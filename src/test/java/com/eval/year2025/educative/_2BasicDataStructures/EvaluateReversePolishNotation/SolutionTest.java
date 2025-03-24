package com.eval.year2025.educative._2BasicDataStructures.EvaluateReversePolishNotation;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();

    /*
    Input: tokens = ["2","1","+","3","*"]
    Output: 9
    Explanation: ((2 + 1) * 3) = 9
    */
    @Test
    void example1() {
        String[] tokens ={"2","1","+","3","*"};

        int result = solution.evalRPN(tokens);

        assertThat(result).isEqualTo(9);
    }

    /*
    Input: tokens = ["4","13","5","/","+"]
    Output: 6
    Explanation: (4 + (13 / 5)) = 6
    Example 3:
    */
    @Test
    void example2() {
        String[] tokens ={"4","13","5","/","+"};

        int result = solution.evalRPN(tokens);

        assertThat(result).isEqualTo(6);
    }

    /*
    Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    Output: 22
    Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
            = ((10 * (6 / (12 * -11))) + 17) + 5
            = ((10 * (6 / -132)) + 17) + 5
            = ((10 * 0) + 17) + 5
            = (0 + 17) + 5
            = 17 + 5
            = 22

     */
    @Test
    void example3() {
        String[] tokens ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int result = solution.evalRPN(tokens);

        assertThat(result).isEqualTo(22);
    }
}