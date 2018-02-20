package gameplay.card;

import gameplay.ManaCount;
import org.w3c.dom.Document;
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
    5. Return loadedCards array
    5. Boom. Card assets loaded
     */

    // ----------------
    // Public Interface
    // ----------------

    /**
     * Builds cards from XML data and compiles them into an array
     *
     * @param xmlFile a Card data XML file
     * @return array of cards built from XML data provided
     */
    public ArrayList<Card> loadCardsFromXML(File xmlFile){

        ArrayList<Card> loadedCards = new ArrayList<Card>(0);

        Document xmlDoc = parseXMLtoDocument(xmlFile);

        // Begin loading data from the xml Document as long as the Document is not null
        if (xmlDoc != null) {

            // Break the document into Nodes; each Node representing a Card object
            NodeList cardNodesList = xmlDoc.getElementsByTagName("card");
            for (int i = 0; i < cardNodesList.getLength(); i++) {

                // For each cardNode, create a Card object, load the Node's data to it, and append card to loadedCards
                Card newCard = cardNodeToCardObject(cardNodesList.item(i));
                loadedCards.add(newCard);
            }
        }
        else {
            // THROW SOME EXCEPTION THAT INDICATES A FAILED LOAD
        }
        return loadedCards;
    }

    // --------------
    // Implementation
    // --------------

    /* Create DOM Document Node from an XML file  */
    private Document parseXMLtoDocument(File xmlFile){

        Document xmlDoc;

        try {

            //IMPLEMENT VALIDATION WITH XSD - LEARN THE SHIT OUT OF XML

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            xmlDoc = builder.parse(xmlFile);

            return xmlDoc;

        } catch (ParserConfigurationException | SAXException | IOException e) {

            e.printStackTrace();

            return null;
        }

    }


    /* Create a Card object from the data contained within a rigidly structured "card" Node */
    private Card cardNodeToCardObject(Node cardNode){

        // Create new, empty Card which the XML data will be loaded into
        Card cardAsset = new Card();

        // Break the cardNode into "field categories" (Cards are defined in XML with "basic" and "type_specific" fields)
        NodeList fieldList = cardNode.getChildNodes();

        // Load the fields contained in each category to the cardAsset
        for (int i = 0; i < fieldList.getLength(); i++){

            Node fieldNode = fieldList.item(i);
            String categoryName = fieldNode.getNodeName();

            loadBasicFields(fieldNode, cardAsset);

        }

        return cardAsset;
    }


    // ----- Load Basic Fields

    /* Load the fields encapsulated in the "basic" Node to the cardAsset
    * The fields in this category are consistent across all cards */
    private void loadBasicFields(Node fieldNode, Card card){


            String fieldName = fieldNode.getNodeName();
            if (fieldNode.getNodeType() != Node.TEXT_NODE) {
                if (fieldName.equals("name")) card.setName(fieldNode.getTextContent());
                else if (fieldName.equals("image")) card.setImagePath(fieldNode.getTextContent());
                else if (fieldName.equals("manacost")) card.setManaCost(loadManaCost(fieldNode));
                else if (fieldName.equals("color")) card.setColor(Card.Color.valueOf(fieldNode.getTextContent()));
                else if (fieldName.equals("rarity")) card.setRarity(Card.Rarity.valueOf(fieldNode.getTextContent()));
                else if (fieldName.equals("type")) card.setType(Card.Type.valueOf(fieldNode.getTextContent()));
                else if (fieldName.equals("race")) card.setRace(Card.Race.valueOf(fieldNode.getTextContent()));
                else if (fieldName.equals("power")) card.setPower(Integer.parseInt(fieldNode.getTextContent()));
                else if (fieldName.equals("toughness")) card.setToughness(Integer.parseInt(fieldNode.getTextContent()));
            }

    }

    /* Create a new ManaCount and load the respective fields */
    private ManaCount loadManaCost(Node node){

        ManaCount manaCost = new ManaCount();

        // Break "manacount" node into color-component Nodes
        NodeList colorComponentsNodeList = node.getChildNodes();

        // Add the present color-component values to the manaCost
        for (int i = 0; i < colorComponentsNodeList.getLength(); i++){
            Node colorComponent = colorComponentsNodeList.item(i);
            String nodeName = colorComponent.getNodeName();

            if (colorComponent.getNodeType() != Node.TEXT_NODE) {
                // Parse textContent of color-component Node to integer value
                int coloredManaCount = Integer.parseInt(colorComponent.getTextContent());

                // Depending on color-component nodeName, set respective [color]manaCount to value of coloredManaCount
                if (nodeName.equals("red")) manaCost.setRedManaCount(coloredManaCount);
                else if (nodeName.equals("white")) manaCost.setWhiteManaCount(coloredManaCount);
                else if (nodeName.equals("blue")) manaCost.setBlueManaCount(coloredManaCount);
                else if (nodeName.equals("green")) manaCost.setGreenManaCount(coloredManaCount);
                else if (nodeName.equals("black")) manaCost.setBlackManaCount(coloredManaCount);
                else if (nodeName.equals("colorless")) manaCost.setColorlessManaCount(coloredManaCount);

            }
        }

        return manaCost;
    }

}
