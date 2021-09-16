package org.van;
//import java.util.ArrayList;
// part 2 of fizzbuzz

public class FizzBuzz {
    public static void main(String[] args) {

        // different messages depending on division
        String mOThree = "Fizz";
        String mOFive = "Buzz";
        String mOSeven = "Bang";
        String mOEleven = "Bong";
        String mOThirteen = "Fezz";

        for ( int i = 1; i <= 300; i++ ) {

            String ans = "";
            String ansReverse = "";

            // check for multiple of 3
            if ( i % 3 == 0) {
                ans = ans + mOThree;
                ansReverse = mOThree + ansReverse;
            }
            // check for multiple of 5
            if ( i % 5 == 0) {
                ans = ans + mOFive;
                ansReverse = mOFive + ansReverse;
            }
            // check for multiple of 7
            if ( i % 7 == 0 ) {
                ans = ans + mOSeven;
                ansReverse = mOSeven + ansReverse;
            }
            // check for multiple of 11, wipe everything and add "Bong"
            if ( i % 11 == 0) {
                ans = mOEleven;
                ansReverse = ans;
            }
            // check for multiple of 13, also check existence of a fizz
            if ( i % 13 == 0 ) {
                if (ans.contains("F")) {
                    ans = ans.substring(0, 4) + mOThirteen + ans.substring(4, ans.length());
                    ansReverse = ansReverse.substring(0, 4) + mOThirteen + ansReverse.substring(4, ansReverse.length());
                } else {
                    // if no Fizz exist
                    ans = mOThirteen + ans;
                    ansReverse = ans + mOThirteen;
                }
            }
            // check for multiple of 17, take reverse order
            if ( i % 17 == 0 ) {
                ans = ansReverse;
            }
            // print conditions
            if ( ans.isEmpty() )  {
                System.out.println(i);
            } else {
                System.out.println(ans);
            }
        }
    }
}
