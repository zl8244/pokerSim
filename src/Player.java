package src;

public class Player {

    private final String name;
    private Deck hand = new Deck();
    private boolean isFolded;
    private boolean isChecked;
    private int chips;

    public Player(String name) {
        this.name = name;
        isFolded = false;
        isChecked = false;
        chips = 1000;
    }

    public void drawCard(Card c) {
        hand.addCardToDeck(c);
    }

    public Deck getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public void call() {
        // decrease chips
        isChecked = false;
    }

    public void raise() {
        // decrease chips
        isChecked = false;
    }

    public void check() {
        isChecked = true;
    }

    public void fold() {
        isFolded = true;
    }

    /**
     * Called at the end of every round so that the player's state doesn't carry over
     */
    public void resetPlayer() {
        isFolded = false;
        isChecked = false;
        hand.clearDeck();
    }
}
