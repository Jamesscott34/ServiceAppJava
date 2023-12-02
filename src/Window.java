import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private static JFrame currentFrame;

    public static void showMainScreen() {
        currentFrame = new JFrame("Main Screen");
        currentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currentFrame.setSize(400, 200);
        currentFrame.setLayout(new FlowLayout());

        JButton contractButton = new JButton("Contract");
        JButton reportButton = new JButton("Reports");
        JButton mapButton = new JButton("Map");
        JButton pestButton = new JButton("Pest");
        JButton emailButton = new JButton("Email");

        currentFrame.add(contractButton);
        currentFrame.add(reportButton);
        currentFrame.add(mapButton);
        currentFrame.add(pestButton);
        currentFrame.add(emailButton);

        contractButton.addActionListener(e -> openContractWindow());
        reportButton.addActionListener(e -> openReportWindow());
        mapButton.addActionListener(e -> openMapWindow());
        pestButton.addActionListener(e -> openPestWindow());
        emailButton.addActionListener(e -> openEmailWindow());

        currentFrame.setVisible(true);
    }

    private static void openContractWindow() {
        currentFrame.dispose();
        contracts.createContractWindow();
    }

    private static void openReportWindow() {
        currentFrame.dispose();
        Report.showReportForm();
    }

    private static void openMapWindow() {
        currentFrame.dispose();
        Maps.showMapScreen();
    }

    private static void openPestWindow() {
        currentFrame.dispose();
        pestWindow.showPestScreen();
    }

    private static void openEmailWindow() {
        currentFrame.dispose();
        Email.showEmailScreen();
    }

}
