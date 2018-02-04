package gameplay.card;

import gameplay.ManaCount;
import javafx.scene.image.Image;

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

    enum Rarity {
        COMMON,
        UNCOMMON,
        RARE,
        MYTHIC_RARE,
        TIME_SHIFTED,
        MASTERPIECE
    }

    /**
     * Called when the card is summoned. Custom on-summon behaviors should be
     * implemented here.
     */
    void onSummon();

    /**
     * Called when card is destroyed. Custom on-death and on-destruction bahaviors
     * should be implemented here.
     */
    void onDestroy();

    String getName();
    Image getCardImage();
    ManaCount getManaCost();
    ManaColor getColor();
    Rarity getRarity();

}
