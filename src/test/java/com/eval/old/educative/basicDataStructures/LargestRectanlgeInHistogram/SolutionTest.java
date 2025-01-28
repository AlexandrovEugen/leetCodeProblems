package com.eval.old.educative.basicDataStructures.LargestRectanlgeInHistogram;

import com.eval.old.educative.basicDataStructures.LargestRectanlgeInHistogram.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test(){
        assertThat(Solution.largestRectangle(new int[]{1})).isEqualTo(1);
    }
    @Test
    void test1(){
        assertThat(Solution.largestRectangle(new int[]{1, 3})).isEqualTo(3);
    }
    @Test
    void test2(){
        assertThat(Solution.largestRectangle(new int[]{1, 3, 4})).isEqualTo(6);

    }
    @Test
    void test3(){
        assertThat(Solution.largestRectangle(new int[]{6,2,5,4,5,1,6,4,2})).isEqualTo(12);

    }


}