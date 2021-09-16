package org.van;
//import java.util.ArrayList;
// part 2 of fizzbuzz
// search edge cases by calculating the lcm for each situation
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input max number");
        int maxNum = scanner.nextInt();

        // different messages depending on division
        String mOThree = "Fizz";
        String mOFive = "Buzz";
        String mOSeven = "Bang";
        String mOEleven = "Bong";
        String mOThirteen = "Fezz";



        for ( int i = 1; i <= maxNum; i++ ) {

            String ans = "";
            String ansReverse = "";
            String factors = "";

            // check for multiple of 3
            if ( i % 3 == 0) {
                ans = ans + mOThree;
                ansReverse = mOThree + ansReverse;
                factors += ", " + 3;
            }
            // check for multiple of 5
            if ( i % 5 == 0) {
                ans = ans + mOFive;
                ansReverse = mOFive + ansReverse;
                factors += ", " + 5;
            }
            // check for multiple of 7
            if ( i % 7 == 0 ) {
                ans = ans + mOSeven;
                ansReverse = mOSeven + ansReverse;
                factors += ", " + 7;
            }
            // check for multiple of 11, wipe everything and add "Bong"
            if ( i % 11 == 0) {
                ans = mOEleven;
                ansReverse = ans;
                factors += ", " + 11;
            }
            // check for multiple of 13, also check existence of a fizz
            if ( i % 13 == 0 ) {
                if (ans.contains("F")) {
                    int tempLen = ans.length();
                    ans = ans.substring(0, 4) + mOThirteen + ans.substring(4, tempLen);
                    ansReverse = ansReverse.substring(0, tempLen - 4) + mOThirteen + ansReverse.substring(tempLen - 4, tempLen);
                } else {
                    // if no Fizz exist
                    ans = mOThirteen + ans;
                    ansReverse = ans + mOThirteen;
                }
                factors += ", " + 13;
            }
            // check for multiple of 17, take reverse order
            if ( i % 17 == 0 ) {
                ans = ansReverse;
                factors += ", " + 17;
            }
            // print conditions
            if ( ans.isEmpty() )  {
                System.out.println(i);
            } else {
                System.out.println(ans + ", Factors: 1" + factors);
            }
        }
    }
}
