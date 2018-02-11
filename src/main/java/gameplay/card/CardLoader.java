package gameplay.card;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CardLoader {

    /*
    1. Load XML file
    2. Make nodeList of card elements
    3. Depending on the attribute of each card, make a card object of the respective type
    4. Add the object to the loaded cards array
    5. Boom. Card assets loaded
     */

    // ----------------
    // Public Interface
    // ----------------

    private static ArrayList<Card> loadedCards = new ArrayList<Card>(0); // Loaded cards

    /**
     * @return returns an array list which contains all cards loaded from XML
     */
    public static ArrayList<Card> getLoadedCards(){
        return loadedCards;
    }

    /**
     * Load data from XML file to array list of Cards for usage
     */
    public static void loadCardAssets(){

        File cardsXML = new File("src/main/resources/xml/card_data.xml");
        parseAndLoadXMLData(cardsXML);
        // Do something if there are no cards to load

    }

    // -------------------------
    // XML Parser Implementation
    // -------------------------

    private static void parseAndLoadXMLData(File xmlFile){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document xmlDoc = builder.parse(xmlFile);
            NodeList cardNodeList = xmlDoc.getElementsByTagName("card");

            loadCards(cardNodeList);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static void loadCards(NodeList cardNodeList){

        // For each element in cardNodeList create a Card respective to the element's type attribute
        for (int i = 0; i < cardNodeList.getLength(); i++){

            Element cardTree = (Element) cardNodeList.item(i);

            if (cardTree.getAttribute("type") == "land") loadedCards.add(buildLand(cardTree));
            else if (cardTree.getAttribute("type").equals("creature")) loadedCards.add(buildCreature(cardTree));
            else if (cardTree.getAttribute("type").equals("instant")) loadedCards.add(buildInstant(cardTree));
            else if (cardTree.getAttribute("type").equals("sorcery")) loadedCards.add(buildSorcery(cardTree));
            else if (cardTree.getAttribute("type").equals("enchantment")) loadedCards.add(buildEnchantment(cardTree));
            else if (cardTree.getAttribute("type").equals("artifact")) loadedCards.add(buildArtifact(cardTree));
            else {
                System.out.println("Unrecognized attribute: " + cardTree.getAttribute("type"));
            }
        }
    }

    private static Card buildLand(Element cardTree){

        System.out.println("land");

        return null; // Will return a Land card
    }

    private static Card buildCreature(Element cardTree){

        System.out.println("creature");

        return null; // Will return a Creature card
    }

    private static Card buildInstant(Element cardTree){

        System.out.println("instant");

        return null; // Will return an Instant card
    }

    private static Card buildSorcery(Element cardTree){

        System.out.println("sorcery");

        return null; // Will return a Sorcery card
    }

    private static Card buildEnchantment(Element cardTree){

        System.out.println("enchantment");

        return null; // Will return an Enchantment card
    }

    private static Card buildArtifact(Element cardTree){

        System.out.println("artifact");

        return null; // Will return an Artifact card
    }


}
