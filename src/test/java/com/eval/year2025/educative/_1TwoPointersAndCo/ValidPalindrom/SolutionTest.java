package com.eval.year2025.educative._1TwoPointersAndCo.ValidPalindrom;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    /*
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    */
    @Test
    void example1(){
        var s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = solution.isPalindrome(s);
        assertThat(isPalindrome).isTrue();
    }

    /*
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    */
    @Test
    void example2(){
        var s = "race a car";
        boolean isPalindrome = solution.isPalindrome(s);
        assertThat(isPalindrome).isFalse();
    }

    /*
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
    */
    @Test
    void example3(){
        var s = " ";
        boolean isPalindrome = solution.isPalindrome(s);
        assertThat(isPalindrome).isTrue();
    }


}