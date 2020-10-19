package Lesson3;

import java.util.stream.IntStream;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    final public void go(int count) {
        run();
        IntStream.range(0, count).forEach(i -> jump());
        turn();
    }
}
