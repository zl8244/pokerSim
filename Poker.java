import java.util.ArrayList;

public class Poker {

    public static enum PokerHands{
        HighCard(1),
        OnePair(2),
        TwoPair(3),
        ThreeOfAKind(4),
        Straight(5),
        Flush(6),
        FullHouse(7),
        FourOfAKind(8),
        StraightFlush(9),
        RoyalFlush(10);

        PokerHands(int i) {
        }
    }

    private void comparePokerHands(Player player, Player house, ArrayList<Card> tableCards) {
        // Create a combined hand for player and table cards and hous and table cards
        // See what the best poker hand there is for the two
        // print the winner
        // This function should really be called at the end, when both players decided to not fold
    }

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
        Player player = new Player("The Player");
        Player house = new Player("The House");
        ArrayList<Card> tableCards = new ArrayList<>();
        if(PokerHands.HighCard.compareTo(PokerHands.RoyalFlush) < 0) {
            System.out.println("it works");;
        }
    }
}
