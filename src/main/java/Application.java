import domain.GameManager;

public class Application {
    public static void main(String[] args) {
        boolean keepGame = false;
        do {
            GameManager.predictNumber(GameManager.getComputerBalls());
            System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요.");
            keepGame = GameManager.determineKeep(GameManager.keyboard.nextInt());
        } while (keepGame);
    }
}
