package com.eval.year2025.educative._1TwoPointersAndCo.StringToInteger_atoi;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: s = "42"

    Output: 42

    Explanation:

    The underlined characters are what is read in and the caret is the current reader position.
    Step 1: "42" (no characters read because there is no leading whitespace)
         ^
    Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
    Step 3: "42" ("42" is read in)
     */
    @Test
    void example1(){
        String s = "42";

        int result = solution.myAtoi(s);

        assertThat(result).isEqualTo(42);
    }

    /*
    Input: s = " -042"

    Output: -42

    Explanation:

    Step 1: "   -042" (leading whitespace is read and ignored)
            ^
    Step 2: "   -042" ('-' is read, so the result should be negative)
            ^
    Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
    */
    @Test
    void example2(){
        String s = "-042";

        int result = solution.myAtoi(s);

        assertThat(result).isEqualTo(-42);
    }

    /*
    Input: s = "1337c0d3"

    Output: 1337

    Explanation:

    Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
            ^
    Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
            ^
    Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
    */
    @Test
    void example3(){
        String s = "1337c0d3";

        int result = solution.myAtoi(s);

        assertThat(result).isEqualTo(1337);
    }

    /*
    Input: s = "0-1"

    Output: 0

    Explanation:

    Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
    Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
    Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
    */
    @Test
    void example4(){
        String s = "0-1";

        int result = solution.myAtoi(s);

        assertThat(result).isEqualTo(0);
    }

    /*
    Input: s = "words and 987"

    Output: 0

    Explanation:

    Reading stops at the first non-digit character 'w'.
    */
    @Test
    void example5(){
        String s = "words and 987";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void wrongAnswer1(){
        String s = "-91283472332";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(-2147483648);
    }

    @Test
    void wrongAnswer2(){
        String s = "+1";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void wrongAnswer3(){
        String s = "  -0012a42";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(-12);
    }

    @Test
    void wrongAnswer4(){
        String s = "2147483648";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(2147483647);
    }

    @Test
    void wrongAnswer5(){
        String s = "-2147483647";
        int result = solution.myAtoi(s);
        assertThat(result).isEqualTo(-2147483647);
    }

}