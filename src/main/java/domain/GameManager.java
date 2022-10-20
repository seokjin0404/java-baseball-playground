package domain;

import java.util.*;

public class GameManager {
    public static Scanner keyboard = new Scanner(System.in);

    public static boolean determineKeep(int number) {
        return number == 1;
    }

    public static void predictNumber(Balls computerBalls) {
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

    public static Balls getComputerBalls() {
        List<Integer> computerNumbers = new ArrayList<>();
        setRandomNumber(computerNumbers);
        Balls computerBalls = new Balls(computerNumbers);
        return computerBalls;
    }

    private static void setRandomNumber(List<Integer> computerNumbers) {
        Set<Integer> numberSet = new HashSet<>();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = getRandomNumber(numberSet);
            computerNumbers.add(randomNumber);
        }
    }

    private static int getRandomNumber(Set<Integer> numberSet) {
        int randomNumber;
        do {
            randomNumber = (int) (Math.random() * 9) + 1;
        } while(numberSet.contains(randomNumber));
        numberSet.add(randomNumber);
        return randomNumber;
    }

    private static List<Integer> mapNumbers(String numbers) {
        List<Integer> mappedNumbers = new ArrayList<>();
        for (int i=0;i<3;i++) {
            mappedNumbers.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        return mappedNumbers;
    }
}
