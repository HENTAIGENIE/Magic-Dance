package userInterface;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainSidebar extends VBox {

    public MainSidebar(){

        this.setStyle("-fx-background-color: White");

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> Platform.exit());
        this.getChildren().add(exitButton);

    }

}
