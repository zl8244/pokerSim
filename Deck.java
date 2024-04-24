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
    }

    public void resetDeck() {
        for(int i = 0; i < deckofCards.size(); i++) {
            deckofCards.set(i, sortedDeck.get(i));
        }
    }

    public Card dealCard() {
        return deckofCards.remove(0);
    }
}
