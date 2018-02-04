package gameplay.card;

import javafx.scene.image.Image;
import java.io.File;

public interface Card {

    String IMAGES = "./src/main/resources/img/cards/";
    enum ManaColor {
        RED,
        WHITE,
        BLUE,
        GREEN,
        BLACK,
        COLORLESS
    }

    void onSummon();
    void onDestroy();

    String getName();
    Image getCardImage();
    Object getManaCost();
    ManaColor getColor();

}
