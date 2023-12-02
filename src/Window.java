import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
    public static void showMainScreen() {
        JFrame frame = new JFrame("Main Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JButton contractButton = new JButton("Contract");
        JButton reportButton = new JButton("Reports");
        JButton pestButton = new JButton("Pest");

        frame.add(contractButton);
        frame.add(reportButton);
        frame.add(pestButton);

        contractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add contract functionality here
            }
        });

        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report.showReportForm();
            }
        });

        pestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pestWindow.showPestScreen();
            }
        });

        frame.setVisible(true);
    }
    // todo add main window with buttons for map reports Pests
}