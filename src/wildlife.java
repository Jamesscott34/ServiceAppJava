import javax.swing.*;
import java.awt.*;

public class wildlife {
    public static void showWildlifeWindow() {
        JFrame wildlifeFrame = new JFrame("Wildlife Section");
        wildlifeFrame.setSize(400, 300);
        wildlifeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        wildlifeFrame.setLayout(new GridLayout(5, 1));

        JButton foxButton = new JButton("Foxes");
        JButton fieldMiceButton = new JButton("Field Mice");
        JButton squirrelButton = new JButton("Squirrels");
        JButton badgerButton = new JButton("Badgers");
        JButton backToPestButton = new JButton("Back to Pests");

        wildlifeFrame.add(foxButton);
        wildlifeFrame.add(fieldMiceButton);
        wildlifeFrame.add(squirrelButton);
        wildlifeFrame.add(badgerButton);
        wildlifeFrame.add(backToPestButton);

        foxButton.addActionListener(e -> openFoxesWindow());
        fieldMiceButton.addActionListener(e -> openFieldMiceWindow());
        squirrelButton.addActionListener(e -> openSquirrelsWindow());
        badgerButton.addActionListener(e -> openBadgersWindow());
        backToPestButton.addActionListener(e -> returnToPestWindow(wildlifeFrame));

        wildlifeFrame.setVisible(true);
    }

    private static void openFoxesWindow() {
        JFrame foxesFrame = new JFrame("Foxes Section");
        foxesFrame.setSize(400, 300);
        foxesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        foxesFrame.setLayout(new BorderLayout());

        JTextArea foxesTextArea = new JTextArea(
                "Foxes are small to medium-sized mammals known for their bushy tails and cunning behavior.\n\n" +
                        "Key points about foxes:\n" +
                        "- They are nocturnal and omnivorous animals.\n" +
                        "- Foxes inhabit various environments and are adaptable.\n" +
                        "- They play a role in folklore and mythology in many cultures."
        );
        foxesTextArea.setEditable(false);

        JScrollPane foxesScrollPane = new JScrollPane(foxesTextArea);

        JButton backToWildlifeButton = new JButton("Back to Wildlife");

        foxesFrame.add(foxesScrollPane, BorderLayout.CENTER);
        foxesFrame.add(backToWildlifeButton, BorderLayout.SOUTH);

        backToWildlifeButton.addActionListener(e -> returnToWildlifeWindow(foxesFrame));

        foxesFrame.setVisible(true);
    }


    private static void openFieldMiceWindow() {
        JFrame fieldMiceFrame = new JFrame("Field Mice Section");
        fieldMiceFrame.setSize(400, 300);
        fieldMiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fieldMiceFrame.setLayout(new BorderLayout());

        JTextArea fieldMiceTextArea = new JTextArea(
                "Field mice are small rodents that inhabit fields, meadows, and grasslands.\n\n" +
                        "Key points about field mice:\n" +
                        "- They feed on seeds, fruits, and small insects.\n" +
                        "- Field mice serve as a food source for many predators.\n" +
                        "- They reproduce rapidly and have a short lifespan."
        );
        fieldMiceTextArea.setEditable(false);

        JScrollPane fieldMiceScrollPane = new JScrollPane(fieldMiceTextArea);

        JButton backToWildlifeButton = new JButton("Back to Wildlife");

        fieldMiceFrame.add(fieldMiceScrollPane, BorderLayout.CENTER);
        fieldMiceFrame.add(backToWildlifeButton, BorderLayout.SOUTH);

        backToWildlifeButton.addActionListener(e -> returnToWildlifeWindow(fieldMiceFrame));

        fieldMiceFrame.setVisible(true);
    }

    private static void openSquirrelsWindow() {
        JFrame squirrelsFrame = new JFrame("Squirrels Section");
        squirrelsFrame.setSize(400, 300);
        squirrelsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        squirrelsFrame.setLayout(new BorderLayout());

        JTextArea squirrelsTextArea = new JTextArea(
                "Squirrels are small to medium-sized rodents known for their bushy tails and acrobatic abilities.\n\n" +
                        "Key points about squirrels:\n" +
                        "- They are omnivorous and often feed on nuts, seeds, and fruits.\n" +
                        "- Squirrels are active and agile climbers.\n" +
                        "- They build nests, known as dreys, in trees."
        );
        squirrelsTextArea.setEditable(false);

        JScrollPane squirrelsScrollPane = new JScrollPane(squirrelsTextArea);

        JButton backToWildlifeButton = new JButton("Back to Wildlife");

        squirrelsFrame.add(squirrelsScrollPane, BorderLayout.CENTER);
        squirrelsFrame.add(backToWildlifeButton, BorderLayout.SOUTH);

        backToWildlifeButton.addActionListener(e -> returnToWildlifeWindow(squirrelsFrame));

        squirrelsFrame.setVisible(true);
    }


    private static void openBadgersWindow() {
        JFrame badgersFrame = new JFrame("Badgers Section");
        badgersFrame.setSize(400, 300);
        badgersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        badgersFrame.setLayout(new BorderLayout());

        JTextArea badgersTextArea = new JTextArea(
                "Badgers are nocturnal mammals known for their distinctive black and white striped face.\n\n" +
                        "Key points about badgers:\n" +
                        "- They are omnivorous and mainly feed on earthworms.\n" +
                        "- Badgers live in setts, which are underground burrow systems.\n" +
                        "- They are solitary animals and have a hierarchical social structure."
        );
        badgersTextArea.setEditable(false);

        JScrollPane badgersScrollPane = new JScrollPane(badgersTextArea);

        JButton backToWildlifeButton = new JButton("Back to Wildlife");

        badgersFrame.add(badgersScrollPane, BorderLayout.CENTER);
        badgersFrame.add(backToWildlifeButton, BorderLayout.SOUTH);

        backToWildlifeButton.addActionListener(e -> returnToWildlifeWindow(badgersFrame));

        badgersFrame.setVisible(true);
    }


    private static void returnToPestWindow(JFrame currentFrame) {
        currentFrame.dispose();
        pestWindow.showPestScreen();
    }
    private static void returnToWildlifeWindow(JFrame currentFrame) {
        currentFrame.dispose();
        wildlife.showWildlifeWindow();
    }
}
