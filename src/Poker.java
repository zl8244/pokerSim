package src;
import java.util.ArrayList;

public class Poker {

    private static int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public static enum PokerHands{
        HighCard(1),
        OnePair(2),
        TwoPair(3),
        ThreeOfAKind(4),
        Straight(5),
        Flush(6),
        FullHouse(7),
        FourOfAKind(8),
        StraightFlush(9);

        PokerHands(int i) {
        }
    }

    private static void comparePokerHands(PokerHands player, PokerHands house) {
        // Create a combined hand for player and table cards and hous and table cards
        // See what the best poker hand there is for the two
        // print the winner
        // This function should really be called at the end, when both players decided to not fold
    }

    private static boolean isFlush(ArrayList<Card> hand) {
        String suit = hand.get(0).getSuit();
        boolean isFlush = true;
        for (Card card : hand) {
            if(!card.getSuit().equals(suit)) {
                isFlush = false;
                break;
            }
        }
        return isFlush;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        
        for(int i = 0; i < ranks.length; i++) {
            for(int j = 0; j < suits.length; j++) {
                Card c = new Card(ranks[i], suits[j]);
                deck.addCardToDeck(c);
            }
        }
        deck.shuffle();
        deck.printDeck();
        System.out.println();
        deck.sortDeck(suits);
        deck.printDeck();
        // Player player = new Player("The Player");
        // Player house = new Player("The House");
        // ArrayList<Card> tableCards = new ArrayList<>();
        // for(int i = 0; i < 2; i++) {
        //     player.drawCard(deck.dealCard());
        //     house.drawCard(deck.dealCard());
        // }
    }
}
