public class GameNumbers {
    private String playerNumbers;
    private String computerNumbers;

    private void setComputerNumbers() {
        for ( int i = 0; i < 3; i ++)
            computerNumbers += setRandomNumber();
    }
    private String setRandomNumber() {
        return Integer.toString(1+(int)(Math.random()*9));
    }

    public void setPlayerNumbers(String playerNumbers) {
        this.playerNumbers = playerNumbers;
    }

    public String getPlayerNumbers() {
        return playerNumbers;
    }
    public String getComputerNumbers() {
        return computerNumbers;
    }

    public void resetNumber() {
        playerNumbers = "";
        computerNumbers = "";
    }
}
