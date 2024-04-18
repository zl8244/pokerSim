public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for(int i = 0; i < ranks.length; i++) {
            for(int j = 0; j < suits.length; j++) {
                Card c = new Card(ranks[i], suits[j]);
                deck.addCardToDeck(c);
            }
        }
        deck.printDeck();
        deck.shuffle();
        deck.printDeck();
    }
}
