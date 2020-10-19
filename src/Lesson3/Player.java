package Lesson3;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel newLevel) {
        level = newLevel;
        level.showLevelMessage();
    }
    public void play(int n) {
        level.go(n);
    }
}
