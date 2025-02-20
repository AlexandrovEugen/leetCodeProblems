package com.eval.year2025.educative._1TwoPointersAndCo.AddBinary;

public class SolutionFastestFromLeetCode {

    @Deprecated
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            return addBinary(b,a);
        }
        int k = a.length();
        char[] result = new char[k+1];
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0){
            carry+=a.charAt(i)-'0';
            if(j>=0) carry+=b.charAt(j--)-'0';
            result[1+i--] =(char)('0'+ carry % 2);
            carry/=2;
        }

        if(carry!=0){
            result[0]='1';
            return new String(result);
        }
        return new String(result,1,k);
    }
}
