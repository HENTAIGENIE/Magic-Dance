package gameplay.card;

import gameplay.ManaCount;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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

        // DOM Document Node created from xmlFile
        Document xmlDoc = parseXMLtoDocument(xmlFile);

        // Begin loading data from the xml Document as long as the Document is not null
        if (xmlDoc != null) {

            // Break the document into Nodes; each Node representing a Card object
            NodeList cardNodesList = xmlDoc.getElementsByTagName("card");
            for (int i = 0; i < cardNodesList.getLength(); i++) {

                // For each cardNode, create a Card object and load the Node's data to it
                Card newCard = cardNodeToCardObject(cardNodesList.item(i));
                // Append the new Card object to the loaded cards ArrayList
                loadedCards.add(newCard);
            }
        }
        else {
            // THROW SOME EXCEPTION THAT INDICATES A FAILED LOAD <------------
        }
        // Return fully loaded array
        return loadedCards;
    }

    // --------------
    // Implementation
    // --------------

    /* Create DOM Document Node from an XML file passed as a parameter */
    private Document parseXMLtoDocument(File xmlFile){

        Document xmlDoc;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {

            // Create the Document Node from XML file
            xmlDoc = factory.newDocumentBuilder().parse(xmlFile);

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
        NodeList fieldCategoryList = cardNode.getChildNodes();

        // Load the fields contained in each category to the cardAsset
        for (int i = 0; i < fieldCategoryList.getLength(); i++){

            Node categoryNode = fieldCategoryList.item(i);
            String categoryName = categoryNode.getNodeName();

            // Depending on the categoryNode name run the respective load algorithm
            if (categoryName.equals("basic")) loadBasicFields(categoryNode, cardAsset);
            else if (categoryName.equals("type_specific")) loadTypeSpecificFields(categoryNode, cardAsset);
        }

        return cardAsset;
    }


    // ----- Load Basic Fields

    private void loadBasicFields(Node basicCategoryNode, Card card){

        NodeList basicFieldsList = basicCategoryNode.getChildNodes();
        for (int i = 0; i < basicFieldsList.getLength(); i++){
            Node fieldNode = basicFieldsList.item(i);

            String fieldName = fieldNode.getNodeName();
            if (fieldNode.getNodeType() != Node.TEXT_NODE) {
                if (fieldName.equals("name")) card.setName(fieldNode.getTextContent());
                else if (fieldName.equals("image")) card.setImagePath(fieldNode.getTextContent());
                else if (fieldName.equals("manacost")) card.setManaCost(loadManaCost(fieldNode));
                else if (fieldName.equals("color")) card.setColor(Card.Color.valueOf(fieldNode.getTextContent()));
                else if (fieldName.equals("rarity")) card.setRarity(Card.Rarity.valueOf(fieldNode.getTextContent()));
            }
        }
    }


    private ManaCount loadManaCost(Node node){

        ManaCount manaCost = new ManaCount();
        NodeList children = node.getChildNodes();

        for (int i = 0; i < children.getLength(); i++){
            Node childNode = children.item(i);
            String nodeName = childNode.getNodeName();

            if (childNode.getNodeType() != Node.TEXT_NODE) {
                int coloredManaCount = Integer.parseInt(childNode.getTextContent());

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


    // ----- Load Type Specific Fields

    private void loadTypeSpecificFields(Node typeSpecificCategoryNode, Card card){

        NodeList typeSpecificFieldsList = typeSpecificCategoryNode.getChildNodes();
        for (int i = 0; i < typeSpecificFieldsList.getLength(); i++){
            Node fieldNode = typeSpecificFieldsList.item(i);

            String fieldName = fieldNode.getNodeName();
            if (fieldNode.getNodeType() != Node.TEXT_NODE){
                if (fieldName.equals("type")){
                    String type = fieldNode.getTextContent();
                    card.setCardType(type);

                }
            }
        }
    }




}
