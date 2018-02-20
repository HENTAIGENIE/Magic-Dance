package userInterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
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

        Button testButton = new Button("Test");
        testButton.getStyleClass().add("button");
        contentsOfScrollPane.getChildren().add(testButton);

    }

}
