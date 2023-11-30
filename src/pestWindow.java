import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pestWindow {
    //todo holds 4 buttons rodents wildlife birds insects
    public static void showPestScreen() {
        JFrame pestFrame = new JFrame("Pest Section");
        pestFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pestFrame.setSize(400, 200);
        pestFrame.setLayout(new FlowLayout());

        JButton birdsButton = new JButton("Birds");
        JButton rodentsButton = new JButton("Rodents");
        JButton insectsButton = new JButton("Insects");

        pestFrame.add(birdsButton);
        pestFrame.add(rodentsButton);
        pestFrame.add(insectsButton);

        birdsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to display bird-related information
                // You can open a new window or dialog for this.
            }
        });

        rodentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the "Rodents" button is clicked, open a new window with "rats" and "mice" buttons.
                JFrame rodentsSubMenu = new JFrame("Rodents Menu");
                rodentsSubMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                rodentsSubMenu.setSize(200, 100);
                rodentsSubMenu.setLayout(new FlowLayout());

                JButton ratsButton = new JButton("Rats");
                JButton miceButton = new JButton("Mice");

                rodentsSubMenu.add(ratsButton);
                rodentsSubMenu.add(miceButton);

                ratsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // When "Rats" button is clicked, display the content of "rats.txt" on a new screen.
                        displayTextFile("../Res/Information/Rodents/Rats.txt");
                    }
                });

                miceButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // When "Mice" button is clicked, display the content of "mice.txt" on a new screen.
                        displayTextFile("C:\\Users\\35387\\Desktop\\java\\ServiceApp\\ServiceApp\\Mice.txt");
                    }
                });

                rodentsSubMenu.setVisible(true);
            }
        });

        insectsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to display insect-related information
                // You can open a new window or dialog for this.
            }
        });

        pestFrame.setVisible(true);
    }

    private static void displayTextFile(String filePath) {
        try {
            // Use ClassLoader to access resources from JAR
            try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(filePath)) {


                if (inputStream != null) {
                    Scanner scanner = new Scanner(inputStream);
                    StringBuilder fileContents = new StringBuilder();


                    while (scanner.hasNextLine()) {
                        fileContents.append(scanner.nextLine()).append("\n");
                    }
                    scanner.close();

                    JFrame textFrame = new JFrame("Text File Contents");
                    textFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    textFrame.setSize(400, 400);

                    JTextArea textArea = new JTextArea(fileContents.toString());
                    textArea.setWrapStyleWord(true);
                    textArea.setLineWrap(true);
                    textArea.setCaretPosition(0);
                    textArea.setEditable(false);

                    JScrollPane scrollPane = new JScrollPane(textArea);

                    textFrame.add(scrollPane);

                    textFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "File not found: " + filePath);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //create seperate windows for each and a button to go back to main screen 
}