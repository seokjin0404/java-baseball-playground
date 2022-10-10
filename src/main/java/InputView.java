import java.util.Scanner;

public class InputView {

    static Scanner keyboard = new Scanner(System.in);
    public static String readNumbers() {
        System.out.println("숫자를 입력해 주세요 : ");
        return keyboard.nextLine().trim();
    }

    public static int readRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        return keyboard.nextInt();
    }
}
