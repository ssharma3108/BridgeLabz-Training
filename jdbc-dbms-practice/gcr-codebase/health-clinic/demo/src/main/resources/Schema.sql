/*patient table*/
CREATE TABLE IF NOT EXISTS patients (
                          patient_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          dob DATE,
                          phone VARCHAR(15) UNIQUE NOT NULL,
                          email VARCHAR(100) UNIQUE,
                          address TEXT,
                          blood_group VARCHAR(5),
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
/*SPECIALTIES TABLE*/
CREATE TABLE IF NOT EXISTS specialties (
                             specialty_id INT AUTO_INCREMENT PRIMARY KEY,
                             name VARCHAR(100) UNIQUE NOT NULL
);
/*DOCTORS TABLE*/
CREATE TABLE IF NOT EXISTS doctors (
                         doctor_id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         contact VARCHAR(15),
                         consultation_fee DECIMAL(10,2) NOT NULL,
                         specialty_id INT,
                         is_active BOOLEAN DEFAULT TRUE,

                         FOREIGN KEY (specialty_id)
                             REFERENCES specialties(specialty_id)
                             ON DELETE SET NULL
                             ON UPDATE CASCADE
);
/*APPOINTMENTS TABLE*/
CREATE TABLE IF NOT EXISTS appointments (
                              appointment_id INT AUTO_INCREMENT PRIMARY KEY,
                              patient_id INT NOT NULL,
                              doctor_id INT NOT NULL,
                              appointment_date DATE NOT NULL,
                              appointment_time TIME NOT NULL,
                              status VARCHAR(20) DEFAULT 'SCHEDULED',

                              FOREIGN KEY (patient_id)
                                  REFERENCES patients(patient_id)
                                  ON DELETE CASCADE,

                              FOREIGN KEY (doctor_id)
                                  REFERENCES doctors(doctor_id)
                                  ON DELETE CASCADE
);
/*VISITS TABLE*/
CREATE TABLE IF NOT EXISTS visits (
                        visit_id INT AUTO_INCREMENT PRIMARY KEY,
                        appointment_id INT UNIQUE,
                        diagnosis TEXT,
                        notes TEXT,
                        visit_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                        FOREIGN KEY (appointment_id)
                            REFERENCES appointments(appointment_id)
                            ON DELETE CASCADE
);
/*PRESCRIPTIONS TABLE*/
CREATE TABLE IF NOT EXISTS prescriptions (
                               prescription_id INT AUTO_INCREMENT PRIMARY KEY,
                               visit_id INT NOT NULL,
                               medicine_name VARCHAR(200),
                               dosage VARCHAR(100),
                               duration VARCHAR(100),

                               FOREIGN KEY (visit_id)
                                   REFERENCES visits(visit_id)
                                   ON DELETE CASCADE
);
/*BILLS TABLE*/
CREATE TABLE IF NOT EXISTS bills (
                       bill_id INT AUTO_INCREMENT PRIMARY KEY,
                       visit_id INT UNIQUE,
                       total_amount DECIMAL(10,2),
                       payment_status VARCHAR(20) DEFAULT 'UNPAID',
                       payment_date DATE,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                       FOREIGN KEY (visit_id)
                           REFERENCES visits(visit_id)
                           ON DELETE CASCADE
);
