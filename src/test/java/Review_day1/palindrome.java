package Review_day1;

public class palindrome {
    public static void main(String[] args) {

        int n = 1234321;
        int originalNum = n;
        int reverse = 0;

      //  System.out.println(n % 10);
    // by using remainder of 10...we will always get the last number

        while(n > 0){
            int lastDigit = n % 10; // reads last digit in number
            reverse = reverse * 10 + lastDigit;  //0 * 10 = 0 + last digit = 1
            n /= 10;
        }

        System.out.println(originalNum +" " +(reverse == originalNum ? "palindrome" : "not palindrome"));
/*
if we use 1234 as our number...
 while(n > 0){
    int lastDigit = n % 10; // reads last digit in number
   reverse = reverse * 10 + lastDigit;  //0 * 10 = 0 + last digit = 4
    n /= 10;
        }

    during the second iteration, line 2 will be...
    reverse(now value of 4) = 4 * 10 + 3 = 43
    ....
    during third iteration....
    reverse (now value of 43) = 43 *10 + 2 = 432...
 */

    }
}

