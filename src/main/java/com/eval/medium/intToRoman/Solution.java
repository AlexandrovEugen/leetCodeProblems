package com.eval.medium.intToRoman;

import lombok.val;

public class Solution {

    public String intToRoman(int num){
        StringBuilder string = new StringBuilder();
        int magnitude = 1;
        while (num != 0){
            val digit = num % 10;
            if (magnitude == 1){
                magnitude1(string, digit);
            }
            if (magnitude == 2){
                magnitude2(string, digit);
            }
            if (magnitude == 3){
                magnitude3(string, digit);
            }
            if (magnitude > 3){
                var count = digit;
                while (count > 0){
                    string.insert(0, "M");
                    count -= 1;
                }
            }
            num /= 10;
            magnitude++;
        }
        return string.toString();
    }

    private void magnitude1(StringBuilder string, int digit) {
        switch (digit){
            case 0 -> string.insert(0, "");
            case 1 -> string.insert(0, "I");
            case 2 -> string.insert(0, "II");
            case 3 -> string.insert(0, "III");
            case 4 -> string.insert(0, "IV");
            case 5 -> string.insert(0, "V");
            case 6 -> string.insert(0, "VI");
            case 7 -> string.insert(0, "VII");
            case 8 -> string.insert(0, "VIII");
            case 9 -> string.insert(0, "IX");
        }
    }

    private static void magnitude2(StringBuilder string, int digit) {
        switch (digit){
            case 0 -> string.insert(0, "");
            case 1 -> string.insert(0, "X");
            case 2 -> string.insert(0, "XX");
            case 3 -> string.insert(0, "XXX");
            case 4 -> string.insert(0, "XL");
            case 5 -> string.insert(0, "L");
            case 6 -> string.insert(0, "LX");
            case 7 -> string.insert(0, "LXX");
            case 8 -> string.insert(0, "LXXX");
            case 9 -> string.insert(0, "XC");
        }
    }

    private static void magnitude3(StringBuilder string, int digit){
        switch (digit){
            case 0 -> string.insert(0, "");
            case 1 -> string.insert(0, "C");
            case 2 -> string.insert(0, "CC");
            case 3 -> string.insert(0, "CCC");
            case 4 -> string.insert(0, "CD");
            case 5 -> string.insert(0, "D");
            case 6 -> string.insert(0, "DC");
            case 7 -> string.insert(0, "DCC");
            case 8 -> string.insert(0, "DCCC");
            case 9 -> string.insert(0, "CM");
        }
    }

}
