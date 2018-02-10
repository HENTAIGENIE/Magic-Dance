package userInterface;

import gameplay.card.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CardView extends VBox{

    // Simple pane that displays components on card for testing of game mechanics
    // Summon/tap button on card - changes location when summoned and rotates when tapped

    ImageView cardImageView;

    // Depending on what zone the card is in a different action button will be visible on the view

    public CardView(Card card){

        setCardImageView(card.getCardImage());
        this.getChildren().add(getCardImageView());

    }

    public void tap(){
        cardImageView.setRotate(90);
        //Send delegate to game thread that this card is tapped
    }

    public void setCardImageView(Image cardImage){
        cardImageView = new ImageView(cardImage);
    }

    public ImageView getCardImageView() {
        return cardImageView;
    }
}
