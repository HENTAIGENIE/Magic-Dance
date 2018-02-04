package gameplay.spells;

import gameplay.ManaCount;
import gameplay.card.permanent.creature.Creature;
import javafx.scene.image.Image;

import java.io.File;

public class Batterhorn implements Creature {


    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public int getToughness() {
        return 0;
    }

    @Override
    public void onTap() {

    }

    @Override
    public void onSummon() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Image getCardImage() {
        System.out.println(new File(IMAGES + "batterhorn.jpeg").exists());
        //return new Image("/img/cards/batterhorn.jpeg");
        return null;
    }

    @Override
    public Object getManaCost() {
        return new ManaCount(1,0,0,0,0,4);
    }
}
