package userInterface;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainPane extends VBox {

    public MainPane(){
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: Green");

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> Platform.exit());
        this.getChildren().add(exitButton);

    }


}
