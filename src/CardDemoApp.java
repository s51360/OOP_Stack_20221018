public class CardDemoApp {
    public static void main(String[] args) {
        Card ersteKarte = new Card(1,"red");
        Card zweiteKarte = new Card(2,"yellow");
        Card dritteKarte = new Card(3,"blue");

        Card[] cards = new Card[3];
        cards[0] = ersteKarte;
        cards[1] = zweiteKarte;
        cards[2] = dritteKarte;

        CardStack stack = new CardStack(cards);
        stack.push(cards[0]);
        System.out.println("stack.pop() = " + stack.pop());
    }
}
