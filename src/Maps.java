import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Maps {

    public static void showMapScreen() {
        JFrame mapFrame = new JFrame("Google Maps");
        mapFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mapFrame.setSize(800, 600);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        try {
            URL mapUrl = new URL("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3022.3210366882517!2d-73.98671758483834!3d40.75889517932787!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c259e16f9bf50f%3A0xd44772d8b191074c!2sTimes%20Square!5e0!3m2!1sen!2sus!4v1619601134320!5m2!1sen!2sus");
            InputStream mapStream = mapUrl.openStream();
            editorPane.setPage(mapUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(editorPane);
        mapFrame.add(scrollPane);

        mapFrame.setVisible(true);
    }
}
