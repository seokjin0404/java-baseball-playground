public class BaseballGame {

    GameNumbers numbers = new GameNumbers();
    Counter counter = new Counter();

    public void judgeNumber() {
        int playerNumber;
        int matchingIndex;

        for (int i = 0; i < 3; i ++) {
            playerNumber = numbers.getPlayerNumbers().charAt(i);
            matchingIndex = numbers.getComputerNumbers().indexOf(playerNumber);
            counter.judge(i, matchingIndex);
        }
    }

    public void inGame() {

    }
}
