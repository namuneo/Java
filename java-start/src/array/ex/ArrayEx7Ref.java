package array.ex;

import java.util.Scanner;

public class ArrayEx7Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int studentCnt = scanner.nextInt();

        int[][] scores = new int[studentCnt][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCnt; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCnt; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / studentCnt;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}
