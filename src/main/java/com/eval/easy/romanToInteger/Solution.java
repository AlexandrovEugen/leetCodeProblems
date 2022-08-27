package com.eval.easy.romanToInteger;


import java.util.HashMap;
import java.util.Map;


public class Solution {

    private final Map<String, Integer> converter;

    public Solution() {
        this.converter = new HashMap<>();
        converter.put("I", 1);
        converter.put("IV", 4);
        converter.put("V", 5);
        converter.put("IX", 9);
        converter.put("X", 10);
        converter.put("XL", 40);
        converter.put("L", 50);
        converter.put("XC", 90);
        converter.put("C", 100);
        converter.put("CD", 400);
        converter.put("D", 500);
        converter.put("CM", 900);
        converter.put("M", 1000);
    }

    @Deprecated
    public int romanToIntOld(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            String first = String.valueOf(s.charAt(i));
            if (i - 1 >= 0) {
                String second = String.valueOf(s.charAt(i - 1));
                if (converter.containsKey(second + first)) {
                    i--;
                    result += converter.get(second + first);
                } else {
                    result += converter.getOrDefault(first, 0);
                }
            } else {
                result += converter.getOrDefault(first, 0);
            }
        }
        return result;
    }

    public int romanToInt(String s){
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)) {
                case 'I' -> result += 1;
                case 'V' -> result += 5;
                case 'X' -> result += 10;
                case 'L' -> result += 50;
                case 'C' -> result += 100;
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
            }
        }
        if (s.contains("IV")){
            result -= 2;
        }
        if (s.contains("IX")){
            result -= 2;
        }
        if (s.contains("XL")){
            result -= 20;
        }
        if (s.contains("XC")){
            result -= 20;
        }
        if (s.contains("CM")){
            result -= 200;
        }
        if (s.contains("CD")){
            result -= 200;
        }
        return result;

    }





}
