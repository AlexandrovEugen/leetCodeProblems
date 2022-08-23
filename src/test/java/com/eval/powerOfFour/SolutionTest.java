package com.eval.powerOfFour;

import com.eval.powerOfFour.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {


    private final Solution solution = new Solution();


    @Test
    void test1(){
        assertTrue(solution.isPowerOfFour(4));
        assertFalse(solution.isPowerOfFour(25));
        assertTrue(solution.isPowerOfFour(16));
        assertFalse(solution.isPowerOfFour(32));
        assertFalse(solution.isPowerOfFour(100));
    }


}