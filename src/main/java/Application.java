import domain.Balls;
import domain.PlayResult;
import domain.ResultView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepGame = false;
        do {
            predictNumber(getComputerBalls());
            System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요.");
            keepGame = determineKeep(keyboard.nextInt());
        } while (keepGame);
    }

    private static boolean determineKeep(int number) {
        return number == 1;
    }

    private static void predictNumber(Balls computerBalls) {
        boolean GetAnswer = false;
        while (!GetAnswer) {
            System.out.print("숫자를 입력해주세요 : ");
            String numbers = keyboard.next();
            PlayResult result = computerBalls.play(mapNumbers(numbers));
            ResultView.show(result);
            GetAnswer = result.GameEnd();
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }

    private static Balls getComputerBalls() {
        List<Integer> computerNumbers = new ArrayList<>();
        setRandomNumber(computerNumbers);
        Balls computerBalls = new Balls(computerNumbers);
        return computerBalls;
    }

    private static void setRandomNumber(List<Integer> computerNumbers) {
        for (int i = 0; i < 3; i++) {
            computerNumbers.add((int) (Math.random() * 9) + 1);
        }
    }

    private static List<Integer> mapNumbers(String numbers) {
        List<Integer> mappedNumbers = new ArrayList<>();
        for (int i=0;i<3;i++) {
            mappedNumbers.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        return mappedNumbers;
    }
}
