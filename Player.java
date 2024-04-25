import java.util.ArrayList;

public class Player {

    private final String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Card c) {
        hand.add(c);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void call() {
        // do something
    }

    public void raise() {
        // do something
    }

    public void check() {
        // do something
    }

    public void fold() {
        // do something
    }
}
