package gameplay.card;

import gameplay.ManaCount;
import gameplay.Player;
import gameplay.zone.Zone;
import javafx.scene.image.Image;

public class Card {

    public static final String IMAGES = "./src/main/resources/img/cards/";

    public enum ManaColor {
        RED,
        WHITE,
        BLUE,
        GREEN,
        BLACK,
        COLORLESS
    }

    public enum CardRarity {
        COMMON,
        UNCOMMON,
        RARE,
        MYTHIC_RARE,
        TIME_SHIFTED,
        MASTERPIECE
    }

    private String name;
    private Image cardImage;
    private Zone currentZone;
    private Player owner;
    private ManaCount manaCost;
    private ManaColor color;
    private CardRarity rarity;

    // Accessor

    public String getName(){
        return name;
    }

    public Image getCardImage(){
        return (cardImage == null)? cardImage : cardImage;
    }

    public Zone getZone(){
        return currentZone;
    }

    public ManaCount getManaCost(){
        return manaCost;
    }

    public ManaColor getColor(){
        return color;
    }

    public CardRarity getRarity(){
        return rarity;
    }

    public Zone getCurrentZone(){
        return currentZone;
    }

    //Mutator

    public void setName(String name){
        this.name = name;
    }

    public void setCardImage(String path){
        this.cardImage = new Image(path);
    }

    public void setManaCost(ManaCount manaCost){
        this.manaCost = manaCost;
    }

    public void setColor (ManaColor color){
        this.color = color;
    }

    public void setRarity (CardRarity rarity){
        this.rarity = rarity;
    }

    public void setCurrentZone(Zone zone){
        this.currentZone = zone;
    }

    // Constructors

    public Card(){

    }

    // Public interface methods

    /**
     * Called when the card is summoned. Custom on-summon behaviors should be
     * implemented here.
     */
    public void onSummon(){
        onSummonAbility.play();
    }
    private Ability onSummonAbility = new Ability();

    public void addOnSummonAbility(Ability.KeyWord keyWord){
        onSummonAbility.addAction(keyWord);
    }

    /**
     * Called when card is destroyed. Custom on-death and on-destruction behaviors
     * should be implemented here.
     */
    public void onDestroy(){
        onDestroyAbility.play();
    }
    private Ability onDestroyAbility = new Ability();

    /**
     * Add an action keyword to the onDestroyAbility's actionList which is used to store card behaviors
     * @param keyWord represents an action
     */
    public void addOnDestroyAbility(Ability.KeyWord keyWord){
        onDestroyAbility.addAction(keyWord);
    }



}
