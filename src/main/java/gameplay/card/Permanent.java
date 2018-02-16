package gameplay.card;

public class Permanent extends Card {

    public enum Race {
        BEAST,
    }

    private Race race;
    private int power;
    private int toughness;

    public Race getRace(){
        return race;
    }

    public int getPower(){
        return power;
    }

    public int getToughness(){
        return toughness;
    }

}
