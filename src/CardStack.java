public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        counter = -1;
    }

    public void push(Card newCard) {
        counter++;
        cards[counter] = newCard;
    }

    public Card pop() {
        // System.out.println(cards.length);
        counter--;
        return cards[counter + 1]; //+1 weil beim pop sonst -1 index outbound execption
    }
}
