package gameplay.card.ephemeral.instant;

import gameplay.ManaCount;
import gameplay.card.Card;
import javafx.scene.image.Image;

public class PunishTheEnemy implements Instant {

    @Override
    public void onSummon() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public String getName() {
        return "Punish the Enemy";
    }

    @Override
    public Image getCardImage() {
        return new Image(IMAGES + "punishTheEnemy.jpeg");
    }

    @Override
    public Object getManaCost() {
        return new ManaCount(1,0,0,0,0,4);
    }

    @Override
    public ManaColor getColor() {
        return ManaColor.RED;
    }
}
