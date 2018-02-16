package gameplay.card;
import gameplay.ManaCount;
import gameplay.Player;
import gameplay.zone.Zone;

public class Card {

    public static final String IMAGES = "./src/main/resources/img/cards/";

    public enum Color {
        RED,
        WHITE,
        BLUE,
        GREEN,
        BLACK,
        COLORLESS
    }

    public enum Rarity {
        COMMON,
        UNCOMMON,
        RARE,
        MYTHIC_RARE,
        TIME_SHIFTED,
        MASTERPIECE
    }

    // Basic State Fields

    private String name;
    private String cardType;
    private String imagePath;
    private ManaCount manaCost;
    private Color color;
    private Rarity rarity;

    // Game-Play State Fields

    private Zone currentZone;
    private Player owner;

    // ----------------
    // Public Interface
    // ----------------

    // ----- Accessor

    public String getName(){
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    public String getImagePath(){
        return imagePath;
    }

    public Zone getCurrentZone(){
        return currentZone;
    }

    public Player getOwner() {
        return owner;
    }

    public ManaCount getManaCost() throws Exception{
        if (this.manaCost != null) return this.manaCost;
        else {
            throw new Exception("No ManaCount attached : " + this.name);
        }
    }

    public Color getColor(){
        return color;
    }

    public Rarity getRarity(){
        return rarity;
    }


    // ----- Mutator

    public void setName(String name){
        this.name = name;
    }

    public void setCardType(String type) {
        this.cardType = type;
    }

    public void setImagePath(String path){
        this.imagePath = path;
    }

    public void setCurrentZone(Zone zone){
        this.currentZone = zone;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setManaCost(ManaCount manaCost){
        this.manaCost = manaCost;
    }

    public void setColor (Color color){
        this.color = color;
    }

    public void setRarity (Rarity rarity){
        this.rarity = rarity;
    }


    // ----- Constructors

    public Card(){

    }

    public Card(Player owner){

    }


    // ----- Functionality

    /**
     * Called when the card is summoned.
     */
    public void onSummon(){

    }

    /**
     * Called when card is destroyed.
     */
    public void onDestroy(){

    }

}
