package userInterface;

import javafx.scene.layout.BorderPane;

public class PrimaryView extends BorderPane {

    public PrimaryView(){

        //Consider importing FXML here
        this.setCenter(new MainPane());
        this.setLeft(new MainSidebar());

    }

}
