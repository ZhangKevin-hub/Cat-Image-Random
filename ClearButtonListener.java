import java.awt.event.*;

class ClearButtonListener implements ActionListener {
    ImageDisplayer imageDisplayer;
    public ClearButtonListener(ImageDisplayer imageDisplayer) {
        this.imageDisplayer = imageDisplayer;
    }
    public void actionPerformed(ActionEvent e) {
            // Remove image from imageLabel
            imageDisplayer.getImageLabel().setIcon(null);
    }
}
