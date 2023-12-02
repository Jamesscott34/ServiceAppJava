import javax.swing.*;
import java.awt.*;

public class pestWindow {
    private static JFrame currentFrame;

    public static void showPestScreen() {
        currentFrame = new JFrame("Pest Section");
        currentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        currentFrame.setSize(400, 200);
        currentFrame.setLayout(new FlowLayout());

        JButton birdsButton = new JButton("Birds");
        JButton rodentsButton = new JButton("Rodents");
        JButton insectsButton = new JButton("Insects");
        JButton wildlifeButton = new JButton("Wildlife");
        JButton mainButton = new JButton("Main Window");

        currentFrame.add(birdsButton);
        currentFrame.add(rodentsButton);
        currentFrame.add(insectsButton);
        currentFrame.add(wildlifeButton);
        currentFrame.add(mainButton);

        birdsButton.addActionListener(e -> openBirdsWindow());
        rodentsButton.addActionListener(e -> openRodentsWindow());
        insectsButton.addActionListener(e -> openInsectsWindow());
        wildlifeButton.addActionListener(e -> openWildlifeWindow());
        mainButton.addActionListener(e -> openMainWindow());

        currentFrame.setVisible(true);
    }

    private static void openBirdsWindow() {
        currentFrame.dispose();
        birds.showBirdsWindow();
    }

    private static void openRodentsWindow() {
        currentFrame.dispose();
        Rodents.showRodentsWindow();
    }

    private static void openInsectsWindow() {
        currentFrame.dispose();
        Insects.showInsectsWindow();
    }

    private static void openWildlifeWindow() {
        currentFrame.dispose();
        wildlife.showWildlifeWindow();
    }

    private static void openMainWindow() {
        currentFrame.dispose();
        showPestScreen();
    }

}
