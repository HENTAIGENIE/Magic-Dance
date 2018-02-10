import gameplay.GameMode;
import gameplay.card.Card;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import userInterface.CardView;
import userInterface.PrimaryView;

public class Main extends Application{


    public static String IMAGES = "/img/";
    public static String FXML = "/fxml/";

    Scene mainMenu;
    Scene game;

    @Override
    public void init(){

    }

    @Override
    public void start(Stage primaryStage){

        /*
        mainMenu = new Scene(new PrimaryView(), 512, 256);
        primaryStage.setTitle("Magic Dance");
        primaryStage.setResizable(true);
        primaryStage.setScene(mainMenu);
        primaryStage.show();
        */

        Card testCard = new Card();
        testCard.setCardImage(IMAGES + "/cards/batterhorn.jpeg");

        Group root = new Group();
        Scene test = new Scene(root, 512, 512);
        CardView testView = new CardView(testCard);
        root.getChildren().add(testView);

        primaryStage.setTitle("Test");
        primaryStage.setScene(test);
        primaryStage.show();

    }

    @Override
    public void stop(){
        //Platform.exit() is preferred way to exiting program - allows this method to be run

    }


    public static void main(String[] args){


        //GameMode.init();

        //CardClassLoader.loadCards(); <-- Load all cards to array for use
        Application.launch(args);
    }
}
