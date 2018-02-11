package userInterface;

import gameplay.card.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CardUIObject extends VBox{

    /*
    Card.createUIObject could build a CardUIObject that fits itself
     */

    ImageView cardImageView;

    // Depending on what zone the card is in a different action button will be visible on the view

    public CardUIObject(){

    }

    public void tap(){

        this.setRotate(90);
        //Send delegate to game thread that this card is tapped
    }

}
