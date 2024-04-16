public class Deck {

    private Card[] deckofCards;

    public Deck() {
        deckofCards = new Card[52];
    }

    public Deck(int deckLength) {
        deckofCards = new Card[deckLength];
    }

    public void addCardsToDeck(String[] ranks, String[] suits) {
        int index = 0;
        for(int r = 0; r < ranks.length; r++) {
            for(int s = 0; s < suits.length; s++) {
                deckofCards[index] = new Card(ranks[r], suits[s]);
                index++;
            }
        }
    }

    public void printDeck() {
        for (Card card : deckofCards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        //do something
    }

    public void deal() {
        //do something
    }

    public void resetDeck() {
        //do something
    }
}
