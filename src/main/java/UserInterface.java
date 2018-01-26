import javax.swing.*;
import java.awt.*;

public class UserInterface {

    private int frameHeight;
    private int frameWidth;



    public UserInterface(){

        //Default values
        frameHeight = 256;
        frameWidth = 512;

        //Initialization function calls
        setUpInterface();

    }

    private void setUpInterface(){
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new MagicFrame("Magic Dance");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(frameWidth, frameHeight);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });
    }

}
