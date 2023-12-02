import javax.swing.*;
import java.awt.*;

public class Rodents {
    public static void showRodentsWindow() {
        JFrame rodentsFrame = new JFrame("Rodents Section");
        rodentsFrame.setSize(400, 200);
        rodentsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rodentsFrame.setLayout(new FlowLayout());

        JButton ratsButton = new JButton("Rats");
        JButton miceButton = new JButton("Mice");
        JButton backToPestsButton = new JButton("Back to Pests Window");

        rodentsFrame.add(ratsButton);
        rodentsFrame.add(miceButton);
        rodentsFrame.add(backToPestsButton);

        ratsButton.addActionListener(e -> openRatsWindow());
        miceButton.addActionListener(e -> openMiceWindow());
        backToPestsButton.addActionListener(e -> returnToPestsWindow(rodentsFrame));

        rodentsFrame.setVisible(true);
    }

    private static void openRatsWindow() {
        JFrame ratsFrame = new JFrame("Rats Section");
        ratsFrame.setSize(400, 300);
        ratsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ratsFrame.setLayout(new BorderLayout());

        JTextArea ratsTextArea = new JTextArea(
                                "Features:\n" +
                        "\n" +
                        "Rats belong to the family Muridae and are known as rodents.\n" +
                        "They are mammals with fur and are warm-blooded.\n" +
                        "Rats have a strong sense of smell, hearing, and touch.\n" +
                        "They have sharp incisors that continually grow throughout their lives.\n" +
                        "Rats are excellent swimmers and climbers.\n" +
                        "Their tails are long, scaly, and nearly hairless.\n" +
                        "Rats come in various species, with the most common being the brown rat (Rattus norvegicus) and the black rat (Rattus rattus).\n" +
                        "Rats are opportunistic feeders, consuming a wide range of foods.\n" +
                        "They reproduce rapidly, with a single pair of rats capable of producing thousands of descendants in a year.\n" +
                        "Rats are highly adaptable and can thrive in diverse environments.\n" +
                        "Droppings:\n" +
                        "11. Rat droppings are typically pellet-shaped and dark brown.\n" +
                        "\n" +
                        "The presence of rat droppings is a common sign of an infestation.\n" +
                        "Rats defecate frequently, leaving trails of droppings behind.\n" +
                        "Their droppings may carry diseases and should be handled with caution.\n" +
                        "Rat urine can also pose health risks due to potential contamination.\n" +
                        "Size:\n" +
                        "16. Adult brown rats can reach a length of 9-11 inches (excluding the tail) and weigh up to 12 ounces.\n" +
                        "\n" +
                        "Black rats are slightly smaller, with a length of 6-8 inches (excluding the tail) and a weight of up to 5 ounces.\n" +
                        "The tail of a rat is usually longer than its body, ranging from 7 to 10 inches.\n" +
                        "Damages:\n" +
                        "19. Rats are known to chew on various materials, including wires, wood, and pipes, which can lead to property damage and fire hazards.\n" +
                        "\n" +
                        "They can gnaw through plastic and rubber, causing damage to cables and hoses.\n" +
                        "Rats are carriers of diseases like leptospirosis, hantavirus, and salmonellosis, posing health risks to humans.\n" +
                        "They can contaminate food and water sources, leading to foodborne illnesses.\n" +
                        "Rats are vectors for fleas, ticks, and mites, which can transmit diseases to humans and pets.\n" +
                        "Their burrowing activities can weaken building foundations and cause structural problems.\n" +
                        "Rats can damage crops and stored grains, leading to significant agricultural losses."
        );
        ratsTextArea.setEditable(false);

        JScrollPane ratsScrollPane = new JScrollPane(ratsTextArea);

        JButton backToRodentsButton = new JButton("Back to Rodents");

        ratsFrame.add(ratsScrollPane, BorderLayout.CENTER);
        ratsFrame.add(backToRodentsButton, BorderLayout.SOUTH);

        backToRodentsButton.addActionListener(e -> returnToRodentsWindow(ratsFrame));

        ratsFrame.setVisible(true);
    }

    private static void openMiceWindow() {
        JFrame miceFrame = new JFrame("Mice Section");
        miceFrame.setSize(400, 300);
        miceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miceFrame.setLayout(new BorderLayout());

        JTextArea miceTextArea = new JTextArea(
                                "Features:\n" +
                        "\n" +
                        "Mice are small mammals belonging to the family Muridae and the genus Mus.\n" +
                        "They are rodents with a pointed snout, rounded ears, and a long, scaly tail.\n" +
                        "Mice come in various species, with the house mouse (Mus musculus) being one of the most common.\n" +
                        "Like rats, mice are mammals with fur and are warm-blooded.\n" +
                        "Mice are known for their agility, excellent balance, and the ability to squeeze through small openings.\n" +
                        "They have sharp, continually growing incisors and need to gnaw on objects to keep them from overgrowing.\n" +
                        "Mice are prolific breeders, with females capable of having numerous litters each year.\n" +
                        "They have a keen sense of smell, taste, and hearing, and they communicate using high-pitched vocalizations.\n" +
                        "Droppings:\n" +
                        "9. Mouse droppings are typically small, about 1/8 to 1/4 inch in length, and rod-shaped.\n" +
                        "\n" +
                        "The presence of mouse droppings is a clear sign of an infestation.\n" +
                        "Mouse droppings can carry diseases and allergens, and they should be handled carefully.\n" +
                        "The urine of mice can also pose health risks due to potential contamination.\n" +
                        "Size:\n" +
                        "13. House mice are small, with an adult length of about 2.5 to 3.7 inches (excluding the tail).\n" +
                        "\n" +
                        "Their tails are typically long, scaly, and nearly hairless, and can be as long as their bodies.\n" +
                        "Damages:\n" +
                        "15. Mice are known to chew on a wide range of materials, including electrical wires, wood, paper, and insulation.\n" +
                        "\n" +
                        "Their gnawing habits can cause property damage and pose fire hazards.\n" +
                        "Mice can contaminate food and food storage areas with their droppings and urine, leading to foodborne illnesses.\n" +
                        "They are carriers of diseases such as hantavirus, leptospirosis, and salmonellosis, which can be transmitted to humans.\n" +
                        "Mice are vectors for fleas, ticks, and mites, which can transmit diseases to humans and pets.\n" +
                        "Their burrowing activities can weaken foundations and cause structural issues in buildings.\n" +
                        "Mice can damage crops and stored grains, leading to agricultural losses.\n" +
                        "Their presence can lead to financial losses for businesses, such as food establishments and agriculture.\n" +
                        "Mice have an efficient reproductive system, allowing for rapid population growth.\n" +
                        "They can be difficult to control due to their small size, agility, and adaptability.\n" +
                        "Mice are known to be secretive and can go undetected in homes and businesses, causing hidden damage and health risks."
        );
        miceTextArea.setEditable(false);

        JScrollPane miceScrollPane = new JScrollPane(miceTextArea);

        JButton backToRodentsButton = new JButton("Back to Rodents");

        miceFrame.add(miceScrollPane, BorderLayout.CENTER);
        miceFrame.add(backToRodentsButton, BorderLayout.SOUTH);

        backToRodentsButton.addActionListener(e -> returnToRodentsWindow(miceFrame));

        miceFrame.setVisible(true);
    }

    private static void returnToPestsWindow(JFrame currentFrame) {
        currentFrame.dispose(); // Close the rodents window
        pestWindow.showPestScreen(); // Show the pest window again
    }

    private static void returnToRodentsWindow(JFrame currentFrame) {
        currentFrame.dispose(); // Close the rats/mice window
        showRodentsWindow(); // Show the rodents window again
    }
}
