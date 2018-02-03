package gameplay.card.creature;

import gameplay.card.Card;
import javafx.scene.image.Image;

import java.io.File;

public class Creature implements Card{

    private int power;
    private int toughness;

    public Creature(File data){

        loadCardData(data);

    }

    @Override
    public void loadCardData(File data){

    }

    @Override
    public void onSummon() {

    }

    @Override
    public void onTap() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public Image getCardImage() {
        return null;
    }

    @Override
    public Object getManaCost() {
        return null;
    }

    int getPower(){
        return 0;
    }

    int getToughness(){
        return 0;
    }
}
