import javax.swing.*;
import java.awt.*;

public class birds {
    public static void showBirdsWindow() {
        JFrame birdsFrame = new JFrame("Birds Section");
        birdsFrame.setSize(400, 200);
        birdsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        birdsFrame.setLayout(new FlowLayout());

        JButton feralPigeonsButton = new JButton("Feral Pigeons");
        JButton seagullsButton = new JButton("Seagulls");
        JButton swallowsButton = new JButton("Swallows");
        JButton backToPestsButton = new JButton("Back to Pests Window");

        birdsFrame.add(feralPigeonsButton);
        birdsFrame.add(seagullsButton);
        birdsFrame.add(swallowsButton);
        birdsFrame.add(backToPestsButton);

        feralPigeonsButton.addActionListener(e -> openFeralPigeonsWindow());
        seagullsButton.addActionListener(e -> openSeagullsWindow());
        swallowsButton.addActionListener(e -> openSwallowsWindow());
        backToPestsButton.addActionListener(e -> returnToPestsWindow(birdsFrame));

        birdsFrame.setVisible(true);
    }

    private static void openFeralPigeonsWindow() {
        JFrame feralPigeonsFrame = new JFrame("Feral Pigeons Section");
        feralPigeonsFrame.setSize(400, 300);
        feralPigeonsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        feralPigeonsFrame.setLayout(new BorderLayout());

        JTextArea feralPigeonsTextArea = new JTextArea(
                "Feral pigeons, also known as city pigeons, are a common sight in urban areas. They are descendants of domesticated pigeons.\n\n" +
                        "Key points about feral pigeons:\n" +
                        "- They often roost on buildings and ledges.\n" +
                        "- Pigeon control measures include exclusion, deterrents, and removal.\n" +
                        "- Their droppings can cause damage and health concerns."
        );
        feralPigeonsTextArea.setEditable(false);

        JScrollPane feralPigeonsScrollPane = new JScrollPane(feralPigeonsTextArea);

        JButton backToBirdsButton = new JButton("Back to Birds");

        feralPigeonsFrame.add(feralPigeonsScrollPane, BorderLayout.CENTER);
        feralPigeonsFrame.add(backToBirdsButton, BorderLayout.SOUTH);

        backToBirdsButton.addActionListener(e -> returnToBirdsWindow(feralPigeonsFrame));

        feralPigeonsFrame.setVisible(true);
    }

    private static void openSeagullsWindow(){
        JFrame seagullsFrame = new JFrame("Seagulls Section");
        seagullsFrame.setSize(400, 300);
        seagullsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        seagullsFrame.setLayout(new BorderLayout());

        JTextArea seagullsTextArea = new JTextArea(
                "Seagulls are medium to large birds typically found near coastlines. They are known for scavenging and their distinctive call.\n\n" +
                        "Key points about seagulls:\n" +
                        "- They often gather in large groups and are opportunistic feeders.\n" +
                        "- Some seagull species are migratory, traveling long distances annually.\n" +
                        "- Their behavior and droppings can cause nuisances in urban areas."
        );
        seagullsTextArea.setEditable(false);

        JScrollPane seagullsScrollPane = new JScrollPane(seagullsTextArea);

        JButton backToBirdsButton = new JButton("Back to Birds");

        seagullsFrame.add(seagullsScrollPane, BorderLayout.CENTER);
        seagullsFrame.add(backToBirdsButton, BorderLayout.SOUTH);

        backToBirdsButton.addActionListener(e -> returnToBirdsWindow(seagullsFrame));

        seagullsFrame.setVisible(true);
    }
    private static void openSwallowsWindow(){
        JFrame swallowsFrame = new JFrame("Swallows Section");
        swallowsFrame.setSize(400, 300);
        swallowsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        swallowsFrame.setLayout(new BorderLayout());

        JTextArea swallowsTextArea = new JTextArea(
                "Swallows are small, agile birds known for their graceful flight and aerial feeding.\n\n" +
                        "Key points about swallows:\n" +
                        "- They often build cup-shaped mud nests under eaves or other sheltered locations.\n" +
                        "- Swallows migrate over long distances, traveling to different regions for breeding and wintering.\n" +
                        "- Their population faces threats due to habitat loss and environmental changes."
        );
        swallowsTextArea.setEditable(false);

        JScrollPane swallowsScrollPane = new JScrollPane(swallowsTextArea);

        JButton backToBirdsButton = new JButton("Back to Birds");

        swallowsFrame.add(swallowsScrollPane, BorderLayout.CENTER);
        swallowsFrame.add(backToBirdsButton, BorderLayout.SOUTH);

        backToBirdsButton.addActionListener(e -> returnToBirdsWindow(swallowsFrame));

        swallowsFrame.setVisible(true);
    }

    private static void returnToPestsWindow(JFrame currentFrame) {
        currentFrame.dispose();
        pestWindow.showPestScreen();
    }

    private static void returnToBirdsWindow(JFrame currentFrame) {
        currentFrame.dispose();
        showBirdsWindow();
    }
}
