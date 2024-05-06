package src;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckofCards = new ArrayList<>();
    private final ArrayList<Card> sortedDeck = new ArrayList<>();

    public void addCardToDeck(Card card) {
        deckofCards.add(card);
        sortedDeck.add(card);
    }

    public void printDeck() {
        for (Card card : deckofCards) {
            System.out.println(card);
        }
    }

    private void swapCards(int index1, int index2) {
        Card temp = deckofCards.get(index1);
        deckofCards.set(index1, deckofCards.get(index2));
        deckofCards.set(index2, temp);
    }

    public void shuffle() {
        
        for(int i = 0; i < deckofCards.size(); i++) {
            int randIndex1 = (int)(Math.random()*51);
            int randIndex2 = (int)(Math.random()*51);
            while(randIndex1 == randIndex2) {
                randIndex2 = (int)(Math.random()*51);
            }
            swapCards(randIndex1, randIndex2);
        }
        
        ArrayList<Card> left = new ArrayList<>();
        ArrayList<Card> right = new ArrayList<>();
        for(int i = 0; i < deckofCards.size()/2; i++) {
            left.add(deckofCards.get(i));
        }
        for(int i = deckofCards.size()/2; i < deckofCards.size(); i++) {
            right.add(deckofCards.get(i));
        }
        ArrayList<Card> temp = new ArrayList<>();
        for(int i = 0; i < left.size(); i++) {
            temp.add(left.get(i));
            temp.add(right.get(i));
        }
        for(int i = 0; i < deckofCards.size(); i++) {
            deckofCards.set(i, temp.get(i));
        }
    }

    public void sortDeck(String[] suitOrder) {
        // Sort by rank
        for (int i = 0; i < deckofCards.size(); i++) {
            for (int j = i + 1; j < deckofCards.size(); j++) {
                Card card1 = deckofCards.get(i);
                Card card2 = deckofCards.get(j);
                if (card1.getRank() > card2.getRank()) {
                    swapCards(i, j);
                }
            }
        }
    
        // Sort by suit order within groups of 4 cards
        for (int i = 0; i < deckofCards.size() - 3; i += 4) {
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    Card card1 = deckofCards.get(i + j);
                    Card card2 = deckofCards.get(i + k);
                    int suit1Index = getSuitIndex(card1.getSuit(), suitOrder);
                    int suit2Index = getSuitIndex(card2.getSuit(), suitOrder);
                    if (suit1Index > suit2Index) {
                        swapCards(i + j, i + k);
                    }
                }
            }
        }
    }

    private int getSuitIndex(String suit, String[] suitOrder) {
        for (int i = 0; i < suitOrder.length; i++) {
            if (suitOrder[i].equals(suit)) {
                return i;
            }
        }
        return -1; // Suit not found
    }
    

    public Card dealCard() {
        return deckofCards.remove(0);
    }
}
