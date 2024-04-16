public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        deck.addCardsToDeck(ranks, suits);
        deck.printDeck();
    }
}
