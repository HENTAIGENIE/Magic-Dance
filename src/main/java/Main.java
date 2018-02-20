
import gameplay.card.Card;
import gameplay.card.CardLoader;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import userInterface.CardUIObject;
import userInterface.PrimaryView;

import java.io.File;
import java.util.ArrayList;

public class Main extends Application {

    public static String IMAGES = "/img/";
    public static String FXML = "/fxml/";

    Scene mainMenu;
    Scene game;

    @Override
    public void init(){

    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        mainMenu = new Scene(new PrimaryView(), 800, 600);

        primaryStage.setTitle("Magic Dance");
        primaryStage.setResizable(true);
        primaryStage.setScene(mainMenu);
        primaryStage.show();

    }

    @Override
    public void stop(){
        //Platform.exit() is preferred way to exiting program - allows this method to be run

    }

    public static void main(String[] args){

        launch(args); //<-- Launch GUI

    }
}
