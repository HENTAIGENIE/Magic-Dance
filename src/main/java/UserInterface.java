import javax.swing.*;
import java.awt.*;

public class UserInterface {

    private int frameHeight;
    private int frameWidth;

    JFrame magicInterface = new JFrame("Magic Dance");

    public UserInterface(){

        //Default values
        frameHeight = 256;
        frameWidth = 512;

        //Initialization function calls
        setUpInterface();

    }

    private void setUpInterface(){
        populateMainMenu();
        initializeFrame();
    }

    private void initializeFrame(){
        magicInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        magicInterface.setSize(frameWidth, frameHeight);
        magicInterface.setLocationRelativeTo(null);
        magicInterface.setVisible(true);
    }

    private void populateMainMenu(){
        setupPlayButton();
        //Layout here
    }

    private void setupPlayButton(){
        JButton playButton = new JButton("PLAY");
        playButton.addActionListener(e -> {
            changeToGameScreen();
        });
        magicInterface.add(playButton, BorderLayout.PAGE_END); // Most likely will move to another function encapsulating the entire UI layout
    }

    private void changeToGameScreen(){

    }

}
