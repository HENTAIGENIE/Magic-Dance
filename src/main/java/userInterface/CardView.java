package userInterface;

import gameplay.card.Card;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CardView extends VBox{

    // Simple pane that displays components on card for testing of game mechanics
    // Summon/tap button on card - changes location when summoned and rotates when tapped

    ImageView cardImageView;

    // Depending on what zone the card is in a different action button will be visible on the view

    public CardView(Card card){
        cardImageView = new ImageView(card.getCardImage());
    }

    public void tap(){
        cardImageView.setRotate(90);
        //Send delegate to game thread that this card is tapped
    }

}
