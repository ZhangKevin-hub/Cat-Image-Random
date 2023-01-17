import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.net.*;
import javax.imageio.*;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;

class RandomizedButtonListener implements ActionListener {
    ImageDisplayer imageDisplayer;
    public RandomizedButtonListener(ImageDisplayer imageDisplayer) {
        this.imageDisplayer = imageDisplayer;
    }
    public void actionPerformed(ActionEvent e) {
        String url_base = "https://cataas.com/cat";
        try {
            URL url = new URL(url_base);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream inputStream = connection.getInputStream();
            BufferedImage currentImage = ImageIO.read(inputStream);
            imageDisplayer.getImageLabel().setIcon(new ImageIcon(currentImage));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
