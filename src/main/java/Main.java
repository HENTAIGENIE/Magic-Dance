
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.scene.control.Label;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){

        Group root = new Group();
        Scene mainScene = new Scene(root, 256, 256);
        primaryStage.setScene(mainScene);

        Pane pane = new HBox(10);
        pane.setPrefWidth(256);
        pane.setPrefHeight(256);
        root.getChildren().add(pane);
        pane.setPadding(new javafx.geometry.Insets(5, 5, 5, 5));
        Image image = new Image("test.png");
        ImageView IVi = new ImageView(image);
        IVi.setFitWidth(246);
        IVi.setFitHeight(246);
        pane.getChildren().add(IVi);

        /*
        ImageView IV = new ImageView(image);
        IV.setFitHeight(100);
        IV.setFitWidth(100);
        pane.getChildren().add(IV);

        ImageView IV2 = new ImageView(image);
        IV2.setRotate(90);
        pane.getChildren().add(IV2);
        */

        primaryStage.show();

    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
