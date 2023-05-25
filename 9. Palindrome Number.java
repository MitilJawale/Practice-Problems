/*  Author: Mitil Jawale
    Date:  22 December 2022
    Topic: 9. Palindrome Number (Leetcode)
*/

import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        long copy1OfX = x;
        long copy2OfX = x;
        int digitCount = 1;
        while(copy1OfX/10!=0) {
            copy1OfX/=10;
            digitCount++;
        }

        long reverseOfX = 0;
        while(digitCount!=0) {
            reverseOfX += (copy2OfX%10)*(Math.pow(10,digitCount-1));
            digitCount--;
            copy2OfX/=10;
        }

        if(reverseOfX == x)
            return true;
        else
            return false;
    }
}
