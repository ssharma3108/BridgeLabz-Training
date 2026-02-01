package junit_testing.junit;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }

        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        if (password == null || !password.matches(passwordRegex)) {
            throw new IllegalArgumentException("Invalid password");
        }

        // Simulating successful registration
        return true;
    }
}
