package com.eval.educative.TwoPointers.SearchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test1(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(6, 7, 1, 2, 3, 4, 5), 3)).isEqualTo(4);

    }
    @Test
    void test2(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(6,7,1,2,3,4,5), 6)).isEqualTo(0);

    }
    @Test
    void test3(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(4, 5, 6, 1, 2, 3), 3)).isEqualTo(5);

    }

    @Test
    void test4(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(6, 7, 1, 2, 3, 4, 5), 1)).isEqualTo(2);
    }    @Test
    void test5(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(1, 2, 3, 4, 5, -2, -1), -2)).isEqualTo(5);
    }


}