import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Report {
    private static final String REPORTS_FOLDER = "Reports";

    public static void showReportForm() {
        JFrame reportFrame = new JFrame("Report Form");
        reportFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reportFrame.setSize(400, 400);
        reportFrame.setLayout(new GridLayout(8, 2));

        JTextField customerNameField = new JTextField();
        JTextField customerAddressField = new JTextField();
        JTextField dateField = new JTextField();
        JTextArea reportArea = new JTextArea(4, 15);
        JTextField rodenticideField = new JTextField();
        JTextArea recommendationsArea = new JTextArea(4, 15);
        JTextField followUpField = new JTextField();

        reportArea.setLineWrap(true);
        reportArea.setWrapStyleWord(true);

        recommendationsArea.setLineWrap(true);
        recommendationsArea.setWrapStyleWord(true);

        JButton saveButton = new JButton("Save Report");
        JButton returnButton = new JButton("Return to Main Window");

        reportFrame.add(new JLabel("Customer Name:"));
        reportFrame.add(customerNameField);
        reportFrame.add(new JLabel("Customer Address:"));
        reportFrame.add(customerAddressField);
        reportFrame.add(new JLabel("Date:"));
        reportFrame.add(dateField);
        reportFrame.add(new JLabel("Report:"));
        reportFrame.add(new JScrollPane(reportArea));
        reportFrame.add(new JLabel("Rodenticide used:"));
        reportFrame.add(rodenticideField);
        reportFrame.add(new JLabel("Recommendations:"));
        reportFrame.add(new JScrollPane(recommendationsArea));
        reportFrame.add(new JLabel("Follow up:"));
        reportFrame.add(followUpField);
        reportFrame.add(saveButton);
        reportFrame.add(returnButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveReport(customerNameField.getText(), customerAddressField.getText(), dateField.getText(), reportArea.getText(), rodenticideField.getText(), recommendationsArea.getText(), followUpField.getText());
                JOptionPane.showMessageDialog(null, "Report saved successfully.");
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reportFrame.dispose();
                // Replace this with the method to go back to the main window
                Window.showMainScreen();
            }
        });

        reportFrame.setVisible(true);
    }

    private static void saveReport(String customerName, String customerAddress, String date, String report, String rodenticide, String recommendations, String followUp) {
        String fileName = customerName + ".txt";
        String filePath = REPORTS_FOLDER + File.separator + fileName;

        try {
            File directory = new File(REPORTS_FOLDER);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write("Customer Name: " + customerName + "\n");
                writer.write("Customer Address: " + customerAddress + "\n");
                writer.write("Date: " + date + "\n");
                writer.write("Report:\n" + report + "\n");
                writer.write("Rodenticide used: " + rodenticide + "\n");
                writer.write("Recommendations:\n" + recommendations + "\n");
                writer.write("Follow up: " + followUp + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
