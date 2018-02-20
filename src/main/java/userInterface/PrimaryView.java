package userInterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class PrimaryView extends StackPane {

    public PrimaryView() throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/PrimaryView.fxml"));
        getChildren().add(root);

    }


}
