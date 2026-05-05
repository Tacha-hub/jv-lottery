package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Ball.Color getRandomColor() {
        return Ball.Color.values()[random.nextInt(Ball.Color.values().length)];

    }
}
