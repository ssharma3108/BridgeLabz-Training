import java.io.*;

public class DataStreams {

    public static void main(String[] args) {

        String fileName = "student.dat";

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(101);
            dos.writeUTF("Shivam");
            dos.writeDouble(8.6);

            dos.close();
            fos.close();

            System.out.println("Student data stored successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            dis.close();
            fis.close();

            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
