public class Card {
    private int value;
//    private boolean push = false;
//    private boolean pop = false;
    private String color;

    public Card(int value, String color) {

        if (color == "blue") {
            this.color = color;
        } else if (color == "green") {
            this.color = color;
        } else if (color == "yellow") {
            this.color = color;            
        } else if (color == "red") {
            this.color = color;
        } else {
            System.out.println("Es sind nur die Farben Blau, Grün, Gelb und Rot möglich.");
        }

        if (value >= 1 && value <= 9) {
            this.value = value;
        } else {
            System.out.println("Value muss zwischen 1 und 9 sein.");
        }

    }

    public String toString() {
        return "Card{" +
                "value=" + value +
                ", color='" + color + '\'' +
                '}';
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
