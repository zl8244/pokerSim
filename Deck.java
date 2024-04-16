import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckofCards = new ArrayList<>();

    public void addCardToDeck(Card card) {
        deckofCards.add(card);
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
        //do something
    }
}
