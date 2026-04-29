package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "color is " + color + "number is " + number;
    }

    public enum Color {
        YELLOW,
        GREEN,
        RED,
        PINK,
        WHITE
    }
}


