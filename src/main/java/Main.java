
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application{

    public static String IMAGES = "/img/";
    public static String FXML = "/fxml/";

    @Override
    public void init(){

    }

    @Override
    public void start(Stage primaryStage) {

        {   /* Root Component */
            Group root = new Group();
            Scene mainScene = new Scene(root);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Magic Dance");

            {   /* Content Pane */
                BorderPane contentPane = new BorderPane();
                contentPane.setPadding(new javafx.geometry.Insets(5, 5, 5, 5));
                contentPane.setStyle("-fx-background-color: red");
                root.getChildren().add(contentPane);

                {   /* Menu */
                    HBox menu = new HBox();
                    menu.setStyle("-fx-background-color: blue");
                    menu.setPadding(new javafx.geometry.Insets(5, 5, 5, 5));
                    menu.setAlignment(Pos.CENTER);
                    contentPane.setTop(menu);

                    Button button = new Button("button");
                    menu.getChildren().add(button);

                    Button button3 = new Button("button3");
                    menu.getChildren().add(button3);
                }

                {   /* Center Pane */
                    Pane centerPane = new StackPane();
                    centerPane.setStyle("-fx-background-color: yellow");
                    centerPane.setPadding(new javafx.geometry.Insets(5, 5, 5, 5));
                    contentPane.setCenter(centerPane);

                    Image image = new Image(IMAGES + "test.png");
                    ImageView IV = new ImageView(image);
                    IV.setFitHeight(256);
                    IV.setFitWidth(256);
                    centerPane.getChildren().add(IV);
                }

                {   /* Footer */
                    HBox footer = new HBox();
                    footer.setStyle("-fx-background-color: blue");
                    footer.setPadding(new javafx.geometry.Insets(5, 5, 5, 5));
                    footer.setAlignment(Pos.CENTER);
                    contentPane.setBottom(footer);

                    Button button2 = new Button("button2");
                    footer.getChildren().add(button2);
                }
            }
        }
        primaryStage.show();
    }

    @Override
    public void stop(){
        //Platform.exit is preferred way to exiting program - allows this method to be run

    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
