import java.util.Scanner;

public class LoginPage {
    private static final String USERNAME = "shyamala";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            System.out.println("Access granted Welcome .");
        } else {
            System.out.println("Access denied Invalid username or password.");
        }
    }
}
