package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    public void testValidRegistration() {
        boolean result = registration.registerUser(
                "john_doe",
                "john@example.com",
                "Password1"
        );
        assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "",
                    "john@example.com",
                    "Password1"
            );
        });
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "john",
                    "johnexample.com",
                    "Password1"
            );
        });
    }

    @Test
    public void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "john",
                    "john@example.com",
                    "password"
            );
        });
    }
}
