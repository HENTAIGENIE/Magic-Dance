package userInterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class PrimaryViewController {

    @FXML Text alert;
    @FXML ScrollPane scrollPane;
    @FXML HBox contentsOfScrollPane;

    // ------------------------
    // Scrolling Implementation
    // ------------------------

    // Distance (in "average-node-widths") to scroll
    Double nodesToScrollBy = 3.0;

    @FXML public void panLeft(){

        Double hValue = scrollPane.getHvalue();

        // Number of nodes contained in the HBox "contentsOfScrollPane"
        Double numberOfNodesInContentsOfScrollPane = 0.0 + contentsOfScrollPane.getChildren().size();

        // Scroll the scroll pane LEFT by a percent proportional to the average width of [nodesToScrollBy] nodes
        scrollPane.setHvalue(hValue - ((1/numberOfNodesInContentsOfScrollPane) * nodesToScrollBy));
    }

    @FXML public void panRight(){

        Double hValue = scrollPane.getHvalue();

        // Number of nodes contained in the HBox "contentsOfScrollPane"
        Double numberOfNodesInContentsOfScrollPane = 0.0 + contentsOfScrollPane.getChildren().size();

        // Scroll the scroll pane RIGHT by a percent proportional to the average width of [nodesToScrollBy] nodes
        scrollPane.setHvalue(hValue + ((1/numberOfNodesInContentsOfScrollPane) * nodesToScrollBy));
    }

    // ----------------------------
    // Add Card Test Implementation
    // ----------------------------

    @FXML public void addCard(){

        scrollPane.setHvalue(1);

        Button testButton = new Button("");
        testButton.getStyleClass().add("testButton");
        testButton.setMaxHeight(scrollPane.getHeight() - 9);

        Image buttonImage = new Image(getClass().getResourceAsStream("/img/test.png"));
        ImageView biView = new ImageView(buttonImage);
        biView.setFitHeight(testButton.getMaxHeight());
        biView.setPreserveRatio(true);

        Text buttonText = new Text();
        buttonText.setText(String.valueOf(contentsOfScrollPane.getChildren().size()));
        buttonText.getStyleClass().add("testButtonText");
        buttonText.setFill(Color.WHITE);

        StackPane buttonLayers = new StackPane();
        buttonLayers.getChildren().addAll(biView, buttonText);
        buttonLayers.getStyleClass().add("buttonLayers");

        testButton.setGraphic(buttonLayers);

        contentsOfScrollPane.getChildren().add(testButton);

    }

}
