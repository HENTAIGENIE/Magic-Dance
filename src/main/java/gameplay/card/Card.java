package gameplay.card;

import javafx.scene.image.Image;

public interface Card {

    void onSummon();
    void onTap();
    void onDestroy();

    Image getCardImage();

}
