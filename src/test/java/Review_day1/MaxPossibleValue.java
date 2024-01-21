package Review_day1;

public class MaxPossibleValue {

    public static void main(String[] args) {

        int n = 268;
        boolean isPos = n >0;
        String digits = String.valueOf(Math.abs(n));
        int max = 0;
        //absolute value method (ignores the negative symbol)
        /*we convert the number to a string here so that we can
        access each number individually

         */

        for (int i = 0; i < digits.length(); i++) {
            char eachDigit = digits.charAt(i);

            if(eachDigit < '5'){
                max = Integer.parseInt(digits.substring(0,i)+5 + digits.substring(i));
            }

        }

        System.out.println(max);

    }
}

/*
Create a program that will print the max possible value of
the given number N by inserting the digit 5 somewhere in
the integer

Ex.
    Given N = 268, program should return 5268
    Given N = 670, program should return 6750
    Given N = 0, program should return 50

    //if 1st digit is < 5 we replace it
        //if not check against subsequent numbers
        //if all are greater than 5, add to the end
 */
