package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maximum_ball_number = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setRandomColor(colorSupplier.getRandomColor());
        ball.setRandomNumber(random.nextInt(maximum_ball_number));
        return ball;
    }
}
