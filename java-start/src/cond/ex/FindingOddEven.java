package cond.ex;

public class FindingOddEven {

    public static void main(String[] args) {
        int x = 21;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + result + "입니다.");
    }
}
