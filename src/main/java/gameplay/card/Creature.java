package gameplay.card;

public class Creature extends Permanent {

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

    @Override
    public void onSummon() {
        super.onSummon();
        //Moves card to battle field under summoning sickness
    }
}
