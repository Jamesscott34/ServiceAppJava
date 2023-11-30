import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Report {
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

        reportArea.setLineWrap(true); // Enable text wrapping in JTextArea
        reportArea.setWrapStyleWord(true); // Wrap text on word boundaries

        recommendationsArea.setLineWrap(true); // Enable text wrapping in JTextArea
        recommendationsArea.setWrapStyleWord(true); // Wrap text on word boundaries

        JButton saveButton = new JButton("Save Report");

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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveReport(customerNameField.getText(), customerAddressField.getText(), dateField.getText(), reportArea.getText(), rodenticideField.getText(), recommendationsArea.getText(), followUpField.getText());
            }
        });

        reportFrame.setVisible(true);
    }

    private static void saveReport(String customerName, String customerAddress, String date, String report, String rodenticide, String recommendations, String followUp) {
        String fileName = customerName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Customer Name: " + customerName + "\n");
            writer.write("Customer Address: " + customerAddress + "\n");
            writer.write("Date: " + date + "\n");
            writer.write("Report:\n" + report + "\n");
            writer.write("Rodenticide used: " + rodenticide + "\n");
            writer.write("Recommendations:\n" + recommendations + "\n");
            writer.write("Follow up: " + followUp + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}