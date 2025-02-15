package com.eval.year2025.medium.puzzle1910;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: s = "daabcbaabcbc", part = "abc"
    Output: "dab"
    Explanation: The following operations are done:
    - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
    - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
    - s = "dababc", remove "abc" starting at index 3, so s = "dab".
    Now s has no occurrences of "abc".
    */
    @Test
    void example(){
        String s = "daabcbaabcbc", part = "abc";

        String result = solution.removeOccurrences(s, part);

        assertThat(result).isEqualTo("dab");
    }


    /*
    Input: s = "axxxxyyyyb", part = "xy"
    Output: "ab"
    Explanation: The following operations are done:
    - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
    - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
    - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
    - s = "axyb", remove "xy" starting at index 1 so s = "ab".
    Now s has no occurrences of "xy".
    */
    @Test
    void example2(){
        String s = "axxxxyyyyb", part = "xy";

        String result = solution.removeOccurrences(s, part);

        assertThat(result).isEqualTo("ab");
    }


}