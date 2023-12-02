import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class contracts {
    public static void createContractWindow() {
        JFrame contractFrame = new JFrame("Create Contract");
        contractFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        contractFrame.setSize(400, 300);
        contractFrame.setLayout(new GridLayout(8, 2));

        JTextField accountNameField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField phoneNumberField = new JTextField();
        JTextField emailAddressField = new JTextField();
        JTextField siteNameField = new JTextField();
        JTextField visitsField = new JTextField();
        JTextField priceField = new JTextField();

        JButton saveButton = new JButton("Save");
        JButton mainButton = new JButton("Main Window");

        contractFrame.add(new JLabel("Account Name:"));
        contractFrame.add(accountNameField);
        contractFrame.add(new JLabel("Address:"));
        contractFrame.add(addressField);
        contractFrame.add(new JLabel("Phone Number:"));
        contractFrame.add(phoneNumberField);
        contractFrame.add(new JLabel("Email Address:"));
        contractFrame.add(emailAddressField);
        contractFrame.add(new JLabel("Site Name:"));
        contractFrame.add(siteNameField);
        contractFrame.add(new JLabel("Visits per Year:"));
        contractFrame.add(visitsField);
        contractFrame.add(new JLabel("Price per Quarter:"));
        contractFrame.add(priceField);
        contractFrame.add(saveButton);
        contractFrame.add(mainButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String siteName = siteNameField.getText();
                String contractInfo = String.format("Account Name: %s\nAddress: %s\nPhone Number: %s\nEmail Address: %s\nSite Name: %s\nVisits per Year: %s\nPrice per Quarter: %s",
                        accountNameField.getText(), addressField.getText(), phoneNumberField.getText(), emailAddressField.getText(), siteName, visitsField.getText(), priceField.getText());
                saveContract(siteName, contractInfo);
                contractFrame.dispose();
            }
        });

        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contractFrame.dispose();
                Window.showMainScreen();
            }
        });

        contractFrame.setVisible(true);
    }

    private static void saveContract(String siteName, String contractInfo) {
        String folderPath = "Contracts"; // Folder name
        String filePath = folderPath + "/" + siteName + ".txt"; // File path within the folder

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contractInfo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

