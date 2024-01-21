package interview_prep;

public class swapNums {

    public static void main(String[] args) {

        int a = 3;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + ", " + b);


    }
}
