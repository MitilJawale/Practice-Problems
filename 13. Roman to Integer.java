/*  Author: Mitil Jawale
    Date:  23 December 2022
    Topic: 13. Roman to Integer (Leetcode)
*/

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        char[] s_char = s.toCharArray();
        for(int i=0;i+1<=s_char.length;i++) {

            switch(s_char[i]) {
                case 'I':
                    if(i != s_char.length - 1) {
                        if (s_char[i + 1] == 'V') {
                            num += 4;
                            i++;
                            break;
                        } else if (s_char[i + 1] == 'X') {
                            num += 9;
                            i++;
                            break;
                        }
                        else {
                            num += 1;
                            break;
                        }
                    }
                    else {
                        num += 1;
                        break;
                    }
                case 'X':
                    if(i != s_char.length - 1) {
                        if (s_char[i + 1] == 'L') {
                            num += 40;
                            i++;
                            break;
                        } else if (s_char[i + 1] == 'C') {
                            num += 90;
                            i++;
                            break;
                        }
                        else
                            num += 10;
                        break;
                    }
                    else
                        num += 10;
                        break;
                case 'C':
                    if(i != s_char.length - 1) {
                        if (s_char[i + 1] == 'D') {
                            num += 400;
                            i++;
                            break;
                        } else if (s_char[i + 1] == 'M') {
                            num += 900;
                            i++;
                            break;
                        }
                        else
                            num += 100;
                            break;
                    }
                    else
                        num += 100;
                        break;
                case 'V':
                    num += 5;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}
