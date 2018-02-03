package gameplay;

public class ManaCount {

    private int redManaCount;
    private int whiteManaCount;
    private int blueManaCount;
    private int greenManaCount;
    private int blackManaCount;
    private int colorlessManaCount;

    // Accessors

    public int getRedManaCount(){
        return redManaCount;
    }

    public int getWhiteManaCount() {
        return whiteManaCount;
    }

    public int getBlueManaCount() {
        return blueManaCount;
    }

    public int getGreenManaCount() {
        return greenManaCount;
    }

    public int getBlackManaCount() {
        return blackManaCount;
    }

    public int getColorlessManaCount() {
        return colorlessManaCount;
    }

    // Mutators

    public void setRedManaCount(int redManaCount) {
        this.redManaCount = redManaCount;
    }

    public void setWhiteManaCount(int whiteManaCount) {
        this.whiteManaCount = whiteManaCount;
    }

    public void setBlueManaCount(int blueManaCount) {
        this.blueManaCount = blueManaCount;
    }

    public void setGreenManaCount(int greenManaCount) {
        this.greenManaCount = greenManaCount;
    }

    public void setBlackManaCount(int blackManaCount) {
        this.blackManaCount = blackManaCount;
    }

    public void setColorlessManaCount(int colorlessManaCount) {
        this.colorlessManaCount = colorlessManaCount;
    }



    public ManaCount(){

    }

    public ManaCount(int red, int white, int blue, int green, int black, int colorless){
        redManaCount = red;
        whiteManaCount = white;
        blueManaCount = blue;
        greenManaCount = green;
        blackManaCount = black;
        colorlessManaCount = colorless;
    }

    public boolean canAfford(ManaCount manaCost){
        //1. Check if there are enough of the mana that are explicitly required in manaCost
        //2. Then check if there are enough of any type excluding the ones found in previous step
        return true;
    }

    public void deductMana(ManaCount manaCost){
        if (canAfford(manaCost)){
            //1. Deduct the non colorless mana
            //2. Either deduct remaining mana randomly, in defined order, or allow user to choose which mana to tap
            // - most likely let user tap
        }
        else {
            //Throw error or something - cant afford
        }
    }

}
