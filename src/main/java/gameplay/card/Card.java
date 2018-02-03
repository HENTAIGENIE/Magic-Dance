package gameplay.card;

import javafx.scene.image.Image;
import java.io.File;

public interface Card {

    String IMAGES = "/img/cards/";

    void loadCardData(File data);

    void onSummon();
    void onTap();
    void onDestroy();

    Image getCardImage();
    Object getManaCost();

}
