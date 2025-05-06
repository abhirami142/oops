

import java.util.Scanner;

// User-defined exception class
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class UserAuthentication {
    // Hardcoded correct credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    // Method to authenticate credentials
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new AuthenticationException("Authentication failed: Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        try {
            authenticate(username, password);
            System.out.println("Authentication successful. Welcome, " + username + "!");
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

