import java.util.Scanner;

public class InputView {

    static Scanner keyboard = new Scanner(System.in);
    public static String readNumbers() {
        System.out.println("숫자를 입력해 주세요 : ");
        return keyboard.nextLine().trim();
    }

    public static int readRestart() {
        return keyboard.nextInt();
    }

}
