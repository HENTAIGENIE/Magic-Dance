package gameplay.card;

import java.util.ArrayList;

public class Ability {
    public enum KeyWord {
        DEATH_TOUCH,
        DEFENDER,
        DOUBLE_STRIKE,
        ENCHANT,
        EQUIP,
        FIRST_STRIKE,
        FLASH,
        FLYING,
        HASTE,
        HEXPROOF,
        INDESTRUCTIBLE
    }

    private ArrayList<KeyWord> actionList = new ArrayList<KeyWord>(0);

    // -----------------
    // Public interface
    // -----------------

    public void play(){
        for(KeyWord keyWord : actionList){
            doAction(keyWord);
        }
    }

    public void addAction(KeyWord action){
        actionList.add(action);
    }

    // -----------------------
    // Private implementation
    // -----------------------

    private void doAction(KeyWord keyWord){
        // Hope to god that there is a better way to do this - maybe split into many smaller switches with different "themes"
        // This switch is gonna be fucking huge
        switch (keyWord){
            case DEATH_TOUCH:
                deathTouch();
                break;
            case DEFENDER:
                defender();
                break;
        }
    }

    // Actions

    private void deathTouch(){
        //Maybe make toughness into an absurdly large number
    }

    private void defender(){

    }


    
}
