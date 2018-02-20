package gameplay.card;
import gameplay.ManaCount;
import gameplay.Player;
import gameplay.card.behavior.Behavior;
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

    public enum Type {
        CREATURE,
        INSTANT,
        ENCHANTMENT,
        ARTIFACT,
        SORCERY,
        LAND,
    }

    public enum Race {
        BEAST,
        ZOMBIE,
    }

    // Basic State Fields

    private String name;
    private Type type;
    private String imagePath;
    private ManaCount manaCost;
    private Color color;
    private Rarity rarity;
    private Race race;
    private int power;
    private int toughness;

    // Game-Play State Fields

    private Zone currentZone;
    private Player owner;
    private Behavior behavior;

    // ----------------
    // Public Interface
    // ----------------


    // ----- Accessor

    public String getName(){
        return name;
    }

    public Type getType() {
        return type;
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

    public ManaCount getManaCost(){
        return manaCost;
    }

    public Color getColor(){
        return color;
    }

    public Rarity getRarity(){
        return rarity;
    }

    public Race getRace(){
        return race;
    }

    public int getPower(){
        return power;
    }

    public int getToughness(){
        return toughness;
    }

    public Behavior getBehavior() { return behavior; }


    // ----- Mutator

    public void setName(String name){
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
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

    public void setRace(Race race) {
        this.race = race;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public void setBehavior(Behavior behavior) {this.behavior = behavior; }


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
