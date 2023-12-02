import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Login {

    public static void showLoginScreen() {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 200);
        loginFrame.setLayout(new GridLayout(6, 2));

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Signup");
        JButton cancelButton = new JButton("Cancel");

        loginFrame.add(new JLabel("Username:"));
        loginFrame.add(usernameField);
        loginFrame.add(new JLabel("Password:"));
        loginFrame.add(passwordField);
        loginFrame.add(new JLabel("")); // Empty label for spacing
        loginFrame.add(loginButton);
        loginFrame.add(new JLabel(""));
        loginFrame.add(signupButton);
        loginFrame.add(new JLabel(""));
        loginFrame.add(cancelButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (isAdminLogin(username, password)) {
                    loginFrame.dispose(); // Close the login screen
                    Window.showMainScreen();
                } else if (isValidLogin(username, password)) {
                    loginFrame.dispose(); // Close the login screen
                    Window.showMainScreen(); // Open main window for regular users
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signup.showSignupScreen();
                loginFrame.dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginFrame.dispose();
            }
        });

        loginFrame.setVisible(true);
    }

    private static boolean isValidLogin(String username, String password) {
        String folderPath = "users"; // Folder name
        String filePath = folderPath + "/users.csv"; // File path within the folder

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                String savedUsername = userData[3].trim(); // Assuming username is at index 3
                String savedPassword = userData[4].trim(); // Assuming password is at index 4
                if (username.equals(savedUsername) && password.equals(savedPassword)) {
                    return true; // Username and password match
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Username and password not found or an error occurred
    }
    private static boolean isAdminLogin(String username, String password) {
        // Replace this with your admin credentials check
        return username.equals("admin") && password.equals("admin");
    }


}

class Signup {
    public static void showSignupScreen() {
        JFrame signupFrame = new JFrame("Signup");
        signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signupFrame.setSize(300, 200);
        signupFrame.setLayout(new GridLayout(6, 2));

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField numberField = new JTextField();
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton signupButton = new JButton("Signup");
        JButton cancelButton = new JButton("Cancel");

        signupFrame.add(new JLabel("Name:"));
        signupFrame.add(nameField);
        signupFrame.add(new JLabel("Email:"));
        signupFrame.add(emailField);
        signupFrame.add(new JLabel("Number:"));
        signupFrame.add(numberField);
        signupFrame.add(new JLabel("Username:"));
        signupFrame.add(usernameField);
        signupFrame.add(new JLabel("Password:"));
        signupFrame.add(passwordField);
        signupFrame.add(signupButton);
        signupFrame.add(cancelButton);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String number = numberField.getText();
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                saveUserData(name, email, number, username, password);
                signupFrame.dispose();
                Login.showLoginScreen();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signupFrame.dispose();
            }
        });

        signupFrame.setVisible(true);
    }

    private static void saveUserData(String name, String email, String number, String username, String password) {
        String folderPath = "users"; // Folder name
        String filePath = folderPath + "/users.csv"; // File path within the folder

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(name + "," + email + "," + number + "," + username + "," + password + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

class window {
    public static void showMainScreen() {
        // Your existing code for the main screen
    }
}
