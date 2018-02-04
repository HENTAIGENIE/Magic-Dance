package gameplay.card.permanent.creature;

import gameplay.ManaCount;
import gameplay.card.permanent.creature.Creature;
import javafx.scene.image.Image;

import java.io.File;

public class Batterhorn implements Creature {

    //Public Interface

    @Override
    public int getPower() {
        return 4;
    }

    @Override
    public int getToughness() {
        return 3;
    }

    @Override
    public Species getSpecies(){
        return Species.BEAST;
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
        return "Batterhorn";
    }

    @Override
    public Image getCardImage() {
        return new Image(IMAGES + "batterhorn.jpeg");
    }

    @Override
    public Object getManaCost() {
        return new ManaCount(1,0,0,0,0,4);
    }

    @Override
    public ManaColor getColor(){
        return ManaColor.RED;
    }

    //Implementation

}
