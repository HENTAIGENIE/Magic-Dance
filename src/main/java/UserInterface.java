import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserInterface {

    private int frameHeight;
    private int frameWidth;

    JFrame mainMenu = new JFrame("Magic Dance");
    JFrame inGameUI = new JFrame("Game");

    public UserInterface(){

        //Default values
        frameHeight = 256;
        frameWidth = 256;

        //Initialization function calls
        setUpInterface();

    }

    private void setUpInterface(){
        populateMainMenu();
        initializeMainMenu();
    }

    private void initializeMainMenu(){
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setVisible(true);
        mainMenu.setSize(frameWidth, frameHeight);
    }

    private void populateMainMenu(){
        setupPlayButton();
    }

    private void setupPlayButton(){
        JButton playButton = new JButton("PLAY");
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initializeInGameUI();
                mainMenu.setVisible(false);
            }
        });
        mainMenu.add(playButton, BorderLayout.PAGE_END);
    }

    private void initializeInGameUI(){
        inGameUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inGameUI.setLocationRelativeTo(null);
        inGameUI.setVisible(true);
        inGameUI.setSize(frameWidth, frameHeight);
    }

}
