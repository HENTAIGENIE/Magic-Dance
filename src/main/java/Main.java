import gameplay.card.Card;
import gameplay.card.CardLoader;

import java.io.File;
import java.util.ArrayList;

public class Main /* extends Application*/{


    /*

    public static String IMAGES = "/img/";
    public static String FXML = "/fxml/";

    Scene mainMenu;
    Scene game;

    @Override
    public void init(){

    }

    @Override
    public void start(Stage primaryStage){


        mainMenu = new Scene(new PrimaryView(), 512, 256);
        primaryStage.setTitle("Magic Dance");
        primaryStage.setResizable(true);
        primaryStage.setScene(mainMenu);
        primaryStage.show();


        Card testCard = new Card();
        testCard.setCardImage(IMAGES + "/cards/batterhorn.jpeg");

        Group root = new Group();
        Scene test = new Scene(root, 512, 512);
        CardUIObject testView = new CardUIObject(testCard);
        root.getChildren().add(testView);

        primaryStage.setTitle("Test");
        primaryStage.setScene(test);
        primaryStage.show();

    }

    @Override
    public void stop(){
        //Platform.exit() is preferred way to exiting program - allows this method to be run

    }
    */

    public static void main(String[] args){


        // Load cards from XML formatted file
        ArrayList<Card> cardAssets = new CardLoader().loadCardsFromXML(new File("src/main/resources/xml/card_data.xml"));

        // Test of CardLoader
        for(Card element: cardAssets){
            System.out.println("-----------------");
            System.out.println(element.getName());
            System.out.println(element.getCardType());
            System.out.println(element.getImagePath());
            try { // Resort card array so that error handling is not necessary when calling element.getManaCost().printMana();
                element.getManaCost().printMana();
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
            System.out.println(element.getColor());
            System.out.println(element.getRarity());
        }

        //Application.launch(args); //<-- Launch GUI

    }
}
