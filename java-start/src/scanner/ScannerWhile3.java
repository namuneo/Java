package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("합을 구하고 싶은 정수를 입력하시오. 0을 입력 시 프로그램이 종료됩니다.");

        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("입력한 수의 합은 : " + sum);
                break;
            }
            sum += num;
        }
    }
}
