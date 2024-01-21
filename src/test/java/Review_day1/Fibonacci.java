package Review_day1;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 8;
        int first = 0;
        int second = 1;


        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(first + " " + second);
        }


        /*there is one instance wehre the above logic wont work
        that is if the nth number we are looking for is 0...
        in that case we imply the following if statement to cover
        that instance
         */
        if(n == 0){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

// 0, 1, 1, 2, 3, 5, 8, 13, 21

    }
}
/*
Create a program that will give you the Nth Fibonacci number
where N is an int
Fibonacci is a sequence of numbers starting from 0, 1 where the following
numbers are the sum of the previous 2 numbers


0, 1, 1, 2, 3, 5, 8, 13, 21, etc.
 */