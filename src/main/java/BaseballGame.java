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
    private boolean keepGame() {
        int strike = counter.getStrike();
        if (strike != 3) {
            return true;
        } else if (strike == 3) {
            return false;
        }
    }
    public void inGame() {
        boolean gameContinue = true;
        String playerNumbers;
        while (gameContinue) {
            playerNumbers = InputView.readNumbers();
            numbers.setPlayerNumbers(playerNumbers);
            judgeNumber();
            ResultView.showResult(counter);
            gameContinue = keepGame();
        }
    }
    public void restartGame() {
        ResultView.restartMessage();
        int num = InputView.readRestart();
        if (num == 1) {
            inGame();
        }
    }
}
