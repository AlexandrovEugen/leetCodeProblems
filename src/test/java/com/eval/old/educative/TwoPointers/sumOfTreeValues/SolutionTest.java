package com.eval.old.educative.TwoPointers.sumOfTreeValues;

import com.eval.old.educative.TwoPointers.sumOfTreeValues.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test(){
        assertThat(Solution.findSumOfThree(new int[]{1, -1, 0}, -1)).isFalse();
        assertThat(Solution.findSumOfThree(new int[]{3,7,1,2,8,4,5}, 10)).isTrue();
        assertThat(Solution.findSumOfThree(new int[]{3,7,1,2,8,4,5}, 21)).isFalse();
    }


}