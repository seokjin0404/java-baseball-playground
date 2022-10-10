public class Counter {
    private int ball = 0;
    private int strike = 0;

    private void increaseStrike() {
        strike += 1;
    }

    private void increaseBall() {
        ball += 1;
    }
    public void judge(int playerIndex, int matchingIndex) {
        if (matchingIndex == playerIndex)
            increaseStrike();
        else if (matchingIndex > 0)
            increaseBall();
    }
}
