package Review_day1;

public class Fib2 {

    public static void main(String[] args) {

        int num = 10;
        int first = 0;
        int second = 1;

        for (int i = 2; i < num; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(second);
    }
}
