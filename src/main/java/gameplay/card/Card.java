package gameplay.card;

import javafx.scene.image.Image;
import java.io.File;

public interface Card {

    String IMAGES = "./src/main/resources/img/cards/";

    void onSummon();
    void onDestroy();

    String getName();
    Image getCardImage();
    Object getManaCost();

}
