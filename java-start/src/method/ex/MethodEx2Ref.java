package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        message(3, "hello");

    }

    public static void message(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
