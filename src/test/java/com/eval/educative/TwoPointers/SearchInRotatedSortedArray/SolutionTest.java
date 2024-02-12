package com.eval.educative.TwoPointers.SearchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.assertj.core.api.Assertions.assertThat;


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
    }
    @Test
    void test5(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(1, 2, 3, 4, 5, -2, -1), -2)).isEqualTo(5);
    }
    @Test
    void test6(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(3, 4, 5, 1, 2), 1)).isEqualTo(3);
    }

    @Test
    void test7(){
        assertThat(Solution.binarySearchRotated(Arrays.asList(6 ,7, 8, 9, 10,11, 12, 13, 14, 15, 17, -8, -7, -6, -5, -4, -2, -1, 0 ,2, 3, 4, 5), 17)).isEqualTo(10);
    }

    @Test
    void test8() {
        assertThat(Solution.binarySearchRotated(Arrays.asList(7, 8, 9, 10, 11, 1, 2, 3, 4, 5, 6), 11)).isEqualTo(4);

    }


}