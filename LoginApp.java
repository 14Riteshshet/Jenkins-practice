import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUser = "admin";
        String validPass = "password123";

        System.out.println("Enter Username:");
        // Check if input is available to avoid NoSuchElementException in non-interactive Docker modes
        if (scanner.hasNextLine()) {
            String user = scanner.nextLine();

            System.out.println("Enter Password:");
            if (scanner.hasNextLine()) {
                String pass = scanner.nextLine();

                if (user.equals(validUser) && pass.equals(validPass)) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Access Denied");
                }
            } else {
                System.out.println("Error: No password provided.");
            }
        } else {
            System.out.println("Error: No input stream detected. (Did you forget -i or -it?)");
        }
        scanner.close();
    }
}