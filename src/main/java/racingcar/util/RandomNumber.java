package racingcar.util;

import java.util.Random;

public class RandomNumber {

    private static final Random RANDOM = new Random();

    public static int pick() {
        return RANDOM.nextInt(10);
    }

}
