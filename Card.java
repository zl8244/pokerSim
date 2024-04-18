public class Card {
    
    private final int rank;
    private final String suit;

    public Card(int _rank, String _suit) {
        rank = _rank;
        suit = _suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        if(rank == 11) {
            return "Jack of " + suit;
        } else if(rank == 12) {
            return "Queen of " + suit;
        } else if(rank == 13) {
            return "King of " + suit;
        } else if(rank == 1) {
            return "Ace of " + suit;
        }
        return rank + " of " + suit;
    }
}