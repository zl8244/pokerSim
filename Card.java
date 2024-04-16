public class Card {
    
    private final String rank;
    private final String suit;

    public Card(String _rank, String _suit) {
        rank = _rank;
        suit = _suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return "Rank: " + rank + " Suit: " + suit;
    }
}