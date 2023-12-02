import javax.swing.*;
import java.awt.*;

public class Insects {
    public static void showInsectsWindow() {
        JFrame insectsFrame = new JFrame("Insects Section");
        insectsFrame.setSize(400, 200);
        insectsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        insectsFrame.setLayout(new FlowLayout());

        JButton antsButton = new JButton("Ants");
        JButton bedbugsButton = new JButton("Bedbugs");
        JButton cockroachesButton = new JButton("Cockroaches");
        JButton silverfishButton = new JButton("Silverfish");
        JButton backToPestsButton = new JButton("Back to Pests Window");

        insectsFrame.add(antsButton);
        insectsFrame.add(bedbugsButton);
        insectsFrame.add(cockroachesButton);
        insectsFrame.add(silverfishButton);
        insectsFrame.add(backToPestsButton);

        antsButton.addActionListener(e -> openAntsWindow());
        bedbugsButton.addActionListener(e -> openBedbugsWindow());
        cockroachesButton.addActionListener(e -> openCockroachesWindow());
        silverfishButton.addActionListener(e -> openSilverfishWindow());
        backToPestsButton.addActionListener(e -> returnToPestsWindow(insectsFrame));

        insectsFrame.setVisible(true);
    }

    private static void openAntsWindow() {
        JFrame antsFrame = new JFrame("Ants Section");
        antsFrame.setSize(400, 300);
        antsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        antsFrame.setLayout(new BorderLayout());

        JTextArea antsTextArea = new JTextArea(
                            "Black Garden Ants (Lasius niger):\n" +
                        "\n" +
                        "General Facts:\n" +
                        "\n" +
                        "Black garden ants are commonly found in gardens and urban areas.\n" +
                        "They belong to the genus Lasius, which includes various species.\n" +
                        "These ants are known for their dark black coloration.\n" +
                        "They are social insects that live in colonies with distinct castes.\n" +
                        "Black garden ants are omnivores, feeding on a wide range of food sources.\n" +
                        "They play a role in soil aeration and seed dispersal.\n" +
                        "Colony Structure:\n" +
                        "\n" +
                        "A black garden ant colony consists of workers, males, and a queen.\n" +
                        "The queen is the largest ant in the colony and is responsible for laying eggs.\n" +
                        "Workers are sterile females that forage for food and care for the queen and brood.\n" +
                        "Males are produced during mating season and are short-lived.\n" +
                        "Life Cycle:\n" +
                        "\n" +
                        "Black garden ants go through complete metamorphosis, including egg, larva, pupa, and adult stages.\n" +
                        "Larvae are fed by workers and undergo several molts before pupating.\n" +
                        "The pupal stage is a non-feeding, resting stage.\n" +
                        "The lifespan of a black garden ant worker is generally a few months to a year.\n" +
                        "Queens can live for several years.\n" +
                        "Queen:\n" +
                        "\n" +
                        "The queen is the reproductive member of the colony.\n" +
                        "She is responsible for laying eggs, which hatch into workers.\n" +
                        "A single queen can produce thousands of eggs in her lifetime.\n" +
                        "The queen's primary role is to ensure the colony's survival.\n" +
                        "Diet:\n" +
                        "\n" +
                        "Black garden ants are omnivorous and feed on a variety of food sources.\n" +
                        "They consume nectar, honeydew produced by aphids, insects, and scavenged materials.\n" +
                        "Workers collect and store food in the nest to sustain the colony.\n" +
                        "Ants are known to tend aphids and protect them from predators in exchange for honeydew.\n" +
                        "Foraging:\n" +
                        "\n" +
                        "Foraging workers lay down pheromone trails to food sources to guide other workers.\n" +
                        "These ants communicate using chemical signals and touch.\n" +
                        "Defense Mechanisms:\n" +
                        "\n" +
                        "Black garden ants can release formic acid as a defense mechanism, which can deter predators or attackers.\n" +
                        "Workers can also bite and sting if threatened.\n" +
                        "Hibernation:\n" +
                        "\n" +
                        "Black garden ants are known to hibernate during the winter months.\n" +
                        "During hibernation, they remain in the nest and reduce their activity.\n" +
                        "Nest Construction:\n" +
                        "\n" +
                        "Black garden ants construct nests underground or in decaying wood.\n" +
                        "Their nests can consist of interconnected chambers and tunnels.\n" +
                        "Workers excavate soil and create galleries for brood rearing.\n" +
                        "Agriculture:\n" +
                        "\n" +
                        "Black garden ants engage in a form of agriculture by tending aphids and other sap-sucking insects.\n" +
                        "They protect these insects in exchange for their honeydew, a sugary substance.\n" +
                        "Pheromone Trails:\n" +
                        "\n" +
                        "Workers lay down pheromone trails to food sources, creating efficient foraging routes.\n" +
                        "These trails are used by other workers to locate and transport food.\n" +
                        "Predators:\n" +
                        "\n" +
                        "Black garden ants have numerous natural predators, including birds, spiders, and other insects.\n" +
                        "They have developed various defensive mechanisms to deter predators.\n" +
                        "Pharaoh Ants (Monomorium pharaonis):\n" +
                        "\n" +
                        "General Facts:\n" +
                        "\n" +
                        "Pharaoh ants (Monomorium pharaonis) are small yellow or light brown ants.\n" +
                        "They are a common household pest and are found in various parts of the world.\n" +
                        "Pharaoh ants are known for their rapid reproductive rate and wide distribution.\n" +
                        "They are highly adaptable and can establish nests in diverse environments.\n" +
                        "Colony Structure:\n" +
                        "\n" +
                        "Pharaoh ant colonies are composed of workers, males, queens, and immature stages.\n" +
                        "The queens are responsible for egg-laying and can live for several years.\n" +
                        "Males are produced for mating, and they die soon after mating.\n" +
                        "Workers are sterile females and perform various tasks in the colony.\n" +
                        "Life Cycle:\n" +
                        "\n" +
                        "Pharaoh ants undergo complete metamorphosis with egg, larva, pupa, and adult stages.\n" +
                        "Larvae are fed by workers and undergo multiple molts.\n" +
                        "The pupal stage is a non-feeding, resting stage.\n" +
                        "Workers can live for several months, while queens have a longer lifespan.\n" +
                        "Queen:\n" +
                        "\n" +
                        "The queen is the primary reproductive member of the colony.\n" +
                        "A single colony can have multiple queens.\n" +
                        "Queens produce eggs, and their primary role is to ensure colony survival.\n" +
                        "Diet:\n" +
                        "\n" +
                        "Pharaoh ants are omnivorous and feed on a variety of food sources.\n" +
                        "They are attracted to sugary substances, proteins, fats, and carbohydrates.\n" +
                        "They can be found foraging in kitchens, pantries, and food storage areas.\n" +
                        "Foraging:\n" +
                        "\n" +
                        "Foraging workers lay down pheromone trails to food sources, facilitating efficient food retrieval.\n" +
                        "These ants use chemical communication to coordinate foraging efforts.\n" +
                        "Defense Mechanisms:\n" +
                        "\n" +
                        "Pharaoh ants are known to bite when threatened or disturbed.\n" +
                        "They can also release a foul-smelling chemical as a defense mechanism.\n" +
                        "Reproduction:\n" +
                        "\n" +
                        "Pharaoh ants reproduce quickly, with queens capable of laying hundreds of eggs in a single day.\n" +
                        "The rapid reproductive rate makes them difficult to control.\n" +
                        "Nest Locations:\n" +
                        "\n" +
                        "Pharaoh ants establish nests in various locations, including walls, electrical outlets, and crevices.\n" +
                        "They can nest in warm, humid environments and prefer inaccessible areas.\n" +
                        "Invasive Species:\n" +
                        "\n" +
                        "Pharaoh ants are considered invasive species and have a significant impact on human habitats.\n" +
                        "They can infest homes, hospitals, and commercial buildings.\n" +
                        "Health Risks:\n" +
                        "\n" +
                        "Pharaoh ants are known to transmit disease-causing pathogens and can contaminate food and surfaces.\n" +
                        "They have been linked to the spread of harmful bacteria in healthcare settings.\n" +
                        "Control Methods:\n" +
                        "\n" +
                        "Effective control of pharaoh ants often requires professional pest management due to their rapid reproduction and spread.\n" +
                        "Baits are commonly used to target colonies and eliminate the queen(s).\n" +
                        "Proper sanitation and sealing potential entry points can help prevent infestations.\n" +
                        "Nesting Behavior:\n" +
                        "\n" +
                        "Pharaoh ants have a polydomous nesting behavior, meaning they establish multiple interconnected nests.\n" +
                        "Colonies can be extensive, with many queens and numerous workers.\n" +
                        "They use a process called \"budding\" to create new nests by moving queens, workers, and brood to other locations.\n" +
                        "Migratory Behavior:\n" +
                        "\n" +
                        "Pharaoh ants are known to be highly migratory and can relocate to new nesting sites rapidly.\n" +
                        "This behavior can make them difficult to control and eradicate.\n" +
                        "Antennae:\n" +
                        "\n" +
                        "Pharaoh ants have 12-segmented antennae that help them detect chemical signals and navigate their environment.\n" +
                        "Budding:"
        );
        antsTextArea.setEditable(false);

        JScrollPane antsScrollPane = new JScrollPane(antsTextArea);

        JButton backToInsectsButton = new JButton("Back to Insects");

        antsFrame.add(antsScrollPane, BorderLayout.CENTER);
        antsFrame.add(backToInsectsButton, BorderLayout.SOUTH);

        backToInsectsButton.addActionListener(e -> returnToInsectsWindow(antsFrame));

        antsFrame.setVisible(true);
    }
    private static void openBedbugsWindow() {
        JFrame bedbugsFrame = new JFrame("Bedbugs Section");
        bedbugsFrame.setSize(400, 300);
        bedbugsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bedbugsFrame.setLayout(new BorderLayout());

        JTextArea bedbugsTextArea = new JTextArea(
                            "General Facts:\n" +
                        "\n" +
                        "Bedbugs, scientifically known as Cimex lectularius, are small parasitic insects that feed on the blood of humans and animals.\n" +
                        "They are wingless insects with flat, oval bodies, and are typically brown or reddish-brown.\n" +
                        "Bedbugs are excellent at hiding in cracks, crevices, and other secluded areas.\n" +
                        "They are most active at night and feed on their host's blood while they sleep.\n" +
                        "Bedbugs can go several months without feeding, depending on environmental conditions.\n" +
                        "These pests are highly adaptable and can be found in many parts of the world.\n" +
                        "Bedbugs do not transmit diseases, but their bites can cause itching and discomfort.\n" +
                        "The mere presence of bedbugs can be a source of stress and anxiety for homeowners.\n" +
                        "Where to Find Bedbugs:\n" +
                        "\n" +
                        "Bedbugs are often found in places where people rest or sleep, such as homes, hotels, and hostels.\n" +
                        "They can be found in bedding, mattresses, box springs, and bed frames.\n" +
                        "Bedbugs can also infest upholstery, curtains, and carpeted areas.\n" +
                        "Common hiding spots include cracks in walls, furniture, and electrical outlets.\n" +
                        "Infestations can occur in theaters, public transportation, and office buildings.\n" +
                        "Bedbugs can hide in suitcases, purses, and clothing, making them easy to transport from one location to another.\n" +
                        "They are not exclusive to beds but can infest other furniture and areas where people spend time.\n" +
                        "How to Look for Bedbugs:\n" +
                        "\n" +
                        "Inspect the seams and folds of mattresses, box springs, and bedding for live bedbugs or their shed exoskeletons.\n" +
                        "Examine cracks and crevices in the bed frame and headboard.\n" +
                        "Check behind wallpaper, picture frames, and in electrical outlets.\n" +
                        "Inspect upholstered furniture and curtains for signs of infestation.\n" +
                        "Examine the seams and folds of luggage and backpacks after traveling.\n" +
                        "Pay attention to any signs of bites on your skin and look for small, itchy, red welts.\n" +
                        "Keep an eye out for tiny reddish-brown bugs crawling on surfaces, especially at night.\n" +
                        "Use a flashlight to inspect hidden areas, as bedbugs are nocturnal and active in the dark.\n" +
                        "Look for small, black fecal spots on sheets, mattresses, or nearby furniture.\n" +
                        "Bedbugs can emit a sweet, musty odor, so pay attention to any unusual smells.\n" +
                        "Evidence of Bedbug Presence:\n" +
                        "\n" +
                        "Bedbug bites are a common sign of their presence. Bites often appear in clusters or rows, are itchy, and may develop into red welts.\n" +
                        "Tiny, reddish-brown bugs crawling on surfaces or hiding in cracks and crevices are a strong indicator of bedbugs.\n" +
                        "Bedbug exoskeletons, which are shed as they grow, can be found in hiding spots or on bedding.\n" +
                        "Small, black or brown fecal spots on sheets, mattresses, or other surfaces indicate bedbug activity.\n" +
                        "Bloodstains on bedding or pajamas may result from bedbugs being accidentally crushed during feeding.\n" +
                        "Musty, sweet odor may be noticeable in areas with a significant bedbug infestation.\n" +
                        "Bedbug eggs are tiny and white, about the size of a pinhead, and may be found in cracks and crevices.\n" +
                        "Lifecycle and Behavior:\n" +
                        "\n" +
                        "Bedbugs go through several life stages, including egg, nymph, and adult.\n" +
                        "Nymphs are smaller and lighter in color than adults.\n" +
                        "Nymphs molt several times before reaching adulthood.\n" +
                        "Adult bedbugs are about the size of an apple seed.\n" +
                        "A single female bedbug can lay hundreds of eggs in her lifetime.\n" +
                        "Bedbugs typically feed every five to ten days, but they can survive longer without a blood meal.\n" +
                        "They prefer to feed on exposed skin while their host is asleep.\n" +
                        "Bedbugs inject saliva that acts as an anesthetic, so hosts often do not feel the bites.\n" +
                        "Bedbug bites can result in various skin reactions, ranging from mild itching to severe allergic reactions.\n" +
                        "Scratching bedbug bites can lead to secondary infections.\n" +
                        "Reproduction:\n" +
                        "\n" +
                        "Bedbugs reproduce through traumatic insemination, where the male pierces the female's abdomen to transfer sperm.\n" +
                        "Female bedbugs can lay eggs individually or in clusters.\n" +
                        "Eggs are laid in hidden locations, making them challenging to detect.\n" +
                        "The eggs hatch into nymphs, which molt several times before becoming adults.\n" +
                        "Reproduction is temperature-dependent, with higher temperatures accelerating development.\n" +
                        "Lifecycle:\n" +
                        "\n" +
                        "The lifecycle of a bedbug involves several stages: egg, nymph (five instars), and adult.\n" +
                        "Nymphs closely resemble adult bedbugs but are smaller and lighter in color.\n" +
                        "Molting occurs after each nymph stage until adulthood is reached.\n" +
                        "Nymphs require blood meals to molt and grow.\n" +
                        "The entire lifecycle, from egg to adult, typically takes several weeks to months.\n" +
                        "Mating:\n" +
                        "\n" +
                        "Mating among bedbugs often occurs in hiding spots or close to where they feed.\n" +
                        "Males pierce the female's abdomen to inseminate her, resulting in traumatic insemination.\n" +
                        "A single insemination can allow the female to lay eggs throughout her life.\n" +
                        "Bedbugs are known to mate shortly after reaching adulthood."
        );
        bedbugsTextArea.setEditable(false);

        JScrollPane bedbugsScrollPane = new JScrollPane(bedbugsTextArea);

        JButton backToInsectsButton = new JButton("Back to Insects");

        bedbugsFrame.add(bedbugsScrollPane, BorderLayout.CENTER);
        bedbugsFrame.add(backToInsectsButton, BorderLayout.SOUTH);

        backToInsectsButton.addActionListener(e -> returnToInsectsWindow(bedbugsFrame));

        bedbugsFrame.setVisible(true);
    }

    private static void openCockroachesWindow() {
        JFrame cockroachesFrame = new JFrame("Cockroaches Section");
        cockroachesFrame.setSize(400, 300);
        cockroachesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cockroachesFrame.setLayout(new BorderLayout());

        JTextArea cockroachesTextArea = new JTextArea(
                            "German Cockroaches:\n" +
                        "\n" +
                        "German cockroaches (Blattella germanica) are among the most common indoor cockroaches worldwide.\n" +
                        "They are small, light brown to tan, and typically have two dark parallel stripes on their pronotum.\n" +
                        "Adult German cockroaches are about 1/2 to 5/8 inches long.\n" +
                        "They have well-developed wings but are rarely capable of sustained flight.\n" +
                        "German cockroaches prefer warm, humid environments and are commonly found in kitchens and bathrooms.\n" +
                        "These roaches are most active at night and tend to hide during the day.\n" +
                        "German cockroaches are prolific breeders and can produce several generations in a year.\n" +
                        "The female carries her egg case (ootheca) until the eggs are about to hatch.\n" +
                        "Each ootheca can contain up to 40 eggs.\n" +
                        "The nymphs emerge from the ootheca and undergo several molts before becoming adults.\n" +
                        "The lifespan of a German cockroach is about 100 to 200 days.\n" +
                        "German cockroaches are known carriers of disease and can contaminate food and surfaces.\n" +
                        "Their presence is a common cause of indoor allergens.\n" +
                        "They are attracted to food and water sources and are often found near appliances, sinks, and garbage areas.\n" +
                        "German cockroaches have a distinct, musky odor.\n" +
                        "Asian Cockroaches:\n" +
                        "\n" +
                        "Asian cockroaches (Blattella asahinai) closely resemble German cockroaches in appearance.\n" +
                        "They are also small and light brown to tan but lack the two dark stripes.\n" +
                        "The key distinguishing feature is their ability to fly well, unlike German cockroaches.\n" +
                        "Asian cockroaches are attracted to lights and are often found near outdoor light fixtures.\n" +
                        "They are commonly mistaken for the German cockroach due to their similar appearance.\n" +
                        "Reproduction:\n" +
                        "\n" +
                        "Both German and Asian cockroaches reproduce quickly, with a single female capable of producing numerous offspring.\n" +
                        "The reproduction rate is influenced by factors like temperature and food availability.\n" +
                        "Females carry the ootheca, containing the eggs, until they are ready to hatch.\n" +
                        "The eggs hatch into nymphs, which undergo several molts before reaching adulthood.\n" +
                        "A female German cockroach can produce up to six generations in a year.\n" +
                        "Their rapid reproduction makes them challenging pests to control.\n" +
                        "Identification:\n" +
                        "\n" +
                        "German cockroaches are often identified by their small size, light brown color, and two dark parallel stripes on their pronotum.\n" +
                        "Asian cockroaches resemble German cockroaches but are more agile and capable of flying.\n" +
                        "Habitat:\n" +
                        "\n" +
                        "German cockroaches are typically found indoors, especially in kitchens, bathrooms, and other warm, humid areas.\n" +
                        "They hide in cracks, crevices, and dark spaces during the day.\n" +
                        "Asian cockroaches are outdoor insects and are drawn to artificial light sources.\n" +
                        "They prefer moist environments and are often found in gardens and outdoor structures.\n" +
                        "Flight:\n" +
                        "\n" +
                        "German cockroaches have underdeveloped wings and are rarely capable of sustained flight.\n" +
                        "Asian cockroaches are strong fliers and are attracted to outdoor lights at night.\n" +
                        "This difference in flight capability helps distinguish between the two species.\n" +
                        "Lifespan:\n" +
                        "\n" +
                        "The typical lifespan of a German cockroach is about 100 to 200 days.\n" +
                        "The lifespan of an Asian cockroach is similar, with adult stages lasting a few months.\n" +
                        "Prevention:\n" +
                        "\n" +
                        "Good hygiene and sanitation are essential for preventing German cockroach infestations.\n" +
                        "Eliminating food and water sources, sealing cracks, and maintaining a clean environment can help.\n" +
                        "Asian cockroach infestations are primarily outdoor issues and may require outdoor pest control measures.\n" +
                        "Sealing gaps around doors and windows can help prevent them from entering homes.\n" +
                        "Disease Transmission:\n" +
                        "\n" +
                        "Both German and Asian cockroaches can carry and transmit disease-causing pathogens.\n" +
                        "They can contaminate food and surfaces with bacteria, viruses, and parasites.\n" +
                        "The presence of cockroaches is a common source of indoor allergens.\n" +
                        "Allergens:\n" +
                        "\n" +
                        "Cockroach allergens can trigger allergic reactions and asthma symptoms in some individuals.\n" +
                        "They shed skin, feces, and saliva contain allergenic proteins.\n" +
                        "Cockroach allergens are a significant health concern in urban environments.\n" +
                        "Pest Control:\n" +
                        "\n" +
                        "Controlling German cockroach infestations often requires the use of baits, traps, and insecticides.\n" +
                        "Effective pest control involves eliminating harborage sites, reducing food sources, and using professional treatments.\n" +
                        "Asian cockroach infestations can be challenging to control due to their outdoor habitat."
        );
        cockroachesTextArea.setEditable(false);

        JScrollPane cockroachesScrollPane = new JScrollPane(cockroachesTextArea);

        JButton backToInsectsButton = new JButton("Back to Insects");

        cockroachesFrame.add(cockroachesScrollPane, BorderLayout.CENTER);
        cockroachesFrame.add(backToInsectsButton, BorderLayout.SOUTH);

        backToInsectsButton.addActionListener(e -> returnToInsectsWindow(cockroachesFrame));

        cockroachesFrame.setVisible(true);
    }

    private static void openSilverfishWindow() {
        JFrame silverfishFrame = new JFrame("Silverfish Section");
        silverfishFrame.setSize(400, 300);
        silverfishFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        silverfishFrame.setLayout(new BorderLayout());

        JTextArea silverfishTextArea = new JTextArea(
                            "General Facts:\n" +
                        "\n" +
                        "Silverfish are small, wingless insects with a distinct, elongated, and flat body shape.\n" +
                        "They are silver to grayish-blue in color and have scales covering their bodies, giving them a metallic appearance.\n" +
                        "Silverfish belong to the order Zygentoma and are often mistaken for insects due to their appearance.\n" +
                        "They are ancient insects, with fossils dating back hundreds of millions of years.\n" +
                        "Silverfish are primarily nocturnal and prefer dark, hidden environments.\n" +
                        "They are often found in homes, libraries, and other buildings.\n" +
                        "These insects are known for their quick, darting movements, resembling the movement of a fish.\n" +
                        "Silverfish are detritivores, feeding on organic matter like dead insects, paper, glue, and clothing.\n" +
                        "They are not harmful to humans but can damage paper and fabrics.\n" +
                        "Silverfish thrive in environments with high humidity levels.\n" +
                        "Diet:\n" +
                        "\n" +
                        "Silverfish feed on a wide range of materials, including cellulose, starch, and protein.\n" +
                        "Their diet includes paper, cardboard, books, wallpaper, fabric, and dead insects.\n" +
                        "They can cause damage to important documents, books, and stored clothing.\n" +
                        "Silverfish can also consume food items like grains and cereals, contaminating them in the process.\n" +
                        "The consumption of carbohydrates makes them common pantry pests.\n" +
                        "Lifespan:\n" +
                        "\n" +
                        "The lifespan of a silverfish varies, with individuals typically living for about two to eight years.\n" +
                        "They go through several molts during their lifetime, growing in size with each molt.\n" +
                        "Silverfish reproduce slowly compared to some other insects.\n" +
                        "Reproduction:\n" +
                        "\n" +
                        "Silverfish engage in a unique mating ritual, with males depositing a spermatophore that females later pick up.\n" +
                        "Females lay small batches of eggs in hidden, dark areas.\n" +
                        "The eggs hatch into nymphs that closely resemble miniature adult silverfish.\n" +
                        "Nymphs continue to molt and grow as they age.\n" +
                        "The time it takes for silverfish to develop into adults depends on factors like temperature and humidity.\n" +
                        "Habitat:\n" +
                        "\n" +
                        "Silverfish prefer damp, dark environments with high humidity levels.\n" +
                        "They are often found in basements, bathrooms, kitchens, and attics.\n" +
                        "Silverfish thrive in cool, dark, and humid spaces, such as in storage rooms and behind baseboards.\n" +
                        "They are particularly attracted to old books, paper, and natural fabrics like cotton and silk.\n" +
                        "Silverfish can be a sign of high humidity and dampness in a building.\n" +
                        "Hiding Spots:\n" +
                        "\n" +
                        "Silverfish are skilled at hiding and can squeeze into tight crevices and cracks.\n" +
                        "They can be found hiding behind wallpaper, baseboards, and in bookshelves.\n" +
                        "Silverfish are often discovered in basements, attics, and crawl spaces.\n" +
                        "They avoid light and prefer staying hidden during the day.\n" +
                        "Climate Tolerance:\n" +
                        "\n" +
                        "Silverfish are well adapted to changing climates and can survive in cold or hot conditions.\n" +
                        "They can endure temperatures ranging from freezing to over 100 degrees Fahrenheit.\n" +
                        "Speed and Movement:\n" +
                        "\n" +
                        "Silverfish are known for their quick and agile movements.\n" +
                        "They can dart away when disturbed, making them challenging to catch.\n" +
                        "Their movement resembles the wriggling motion of a fish, which gave them their common name.\n" +
                        "Antennae:\n" +
                        "\n" +
                        "Silverfish have long, slender antennae on their head.\n" +
                        "These antennae are sensitive and help them detect their surroundings.\n" +
                        "Eyes:\n" +
                        "\n" +
                        "They have small, simple eyes, but their vision is limited.\n" +
                        "They primarily rely on their antennae to navigate in their environment.\n" +
                        "Pheromones:\n" +
                        "\n" +
                        "Silverfish use pheromones for communication and mating.\n" +
                        "Pheromones help attract mates and establish territory.\n" +
                        "Molted Skins:\n" +
                        "\n" +
                        "After molting, silverfish often leave behind their shed skins, which can be a sign of their presence.\n" +
                        "These shed skins are fragile and resemble the shape of the adult silverfish.\n" +
                        "Nocturnal Behavior:\n" +
                        "\n" +
                        "Silverfish are primarily active at night and tend to forage for food during dark hours.\n" +
                        "They avoid light and prefer dark hiding places.\n" +
                        "Book Lovers' Nemeses:\n" +
                        "\n" +
                        "Silverfish are notorious for infesting book collections, particularly old books and paper documents.\n" +
                        "The starch content in paper and glue is a preferred food source for them.\n" +
                        "Elongated Antennae:\n" +
                        "\n" +
                        "Their long antennae are sensory organs that help them locate food and detect changes in their environment.\n" +
                        "The antennae are often longer than the length of their body.\n" +
                        "Copulation Duration:\n" +
                        "\n" +
                        "The mating process in silverfish is relatively short, lasting only a few minutes.\n" +
                        "Males leave spermatophores, which females later pick up to fertilize their eggs.\n" +
                        "Egg Deposits:\n" +
                        "\n" +
                        "Female silverfish lay eggs in hidden locations, often in cracks and crevices.\n" +
                        "The eggs are small and white, measuring only about 1 mm in length."
        );
        silverfishTextArea.setEditable(false);

        JScrollPane silverfishScrollPane = new JScrollPane(silverfishTextArea);

        JButton backToInsectsButton = new JButton("Back to Insects");

        silverfishFrame.add(silverfishScrollPane, BorderLayout.CENTER);
        silverfishFrame.add(backToInsectsButton, BorderLayout.SOUTH);

        backToInsectsButton.addActionListener(e -> returnToInsectsWindow(silverfishFrame));

        silverfishFrame.setVisible(true);
    }

    private static void returnToPestsWindow(JFrame currentFrame) {
        currentFrame.dispose(); // Close the insects window
        pestWindow.showPestScreen(); // Show the pest window again
    }

    private static void returnToInsectsWindow(JFrame currentFrame) {
        currentFrame.dispose(); // Close the specific insect window
        showInsectsWindow(); // Show the insects window again
    }
}


