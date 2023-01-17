import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageDisplayer extends JFrame {
    private JLabel imageLabel;
    private Image currentImage;
    private JButton randomizedButton;
    private JButton clearButton;

    public ImageDisplayer() {
        // Make JFrame
        // Make Name, default close and border
        setTitle("Image Displayer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(900, 800));

        // Create JPanel 
        JPanel mainPanel = new JPanel();
        add(mainPanel, BorderLayout.CENTER);



        // Create Initalize buttons and add to Jpanel
        randomizedButton = new JButton("Randomized");
        clearButton = new JButton("Clear");
        mainPanel.add(randomizedButton);
        mainPanel.add(clearButton);

        // Create JLabel 
        imageLabel = new JLabel();
        mainPanel.add(imageLabel);

        // Add ActionListeners to buttons
        randomizedButton.addActionListener(new RandomizedButtonListener(this));
        clearButton.addActionListener(new ClearButtonListener(this));

        // display
        pack();
        setVisible(true);
    }

    public JLabel getImageLabel(){
        return imageLabel;
    }
    public void setCurrentImage(Image currentImage){
        this.currentImage = currentImage;
    }
}
