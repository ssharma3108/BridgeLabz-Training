package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    public void testConnectionStillActiveDuringTest() {
        assertTrue(db.isConnected());
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
