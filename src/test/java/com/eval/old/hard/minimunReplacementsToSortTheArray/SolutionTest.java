package com.eval.old.hard.minimunReplacementsToSortTheArray;

import com.eval.old.hard.minimunReplacementsToSortTheArray.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void testLeetCodeExample1(){
        var nums = new int[]{3, 9, 3};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isEqualTo(2);

    }

    @Test
    void testLeetCodeExample2(){
        var nums = new int[]{1,2,3,4,5};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isZero();

    }
    @Test
    void testLeetCodeExample3(){
        var nums = new int[]{1,2,9,11,3,4};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isEqualTo(8);

    }
    @Test
    void testLeetCodeExample4(){
        var nums = new int[]{2,10,20,19,1};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isEqualTo(47);

    }
    @Test
    void testLeetCodeExample5(){
        var nums = new int[]{19,7,2,24,11,16,1,11,23};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isEqualTo(73);

    }
    @Test
    void testLeetCodeExample6(){
        var nums = new int[]{1,13,15,2,5,14,12,17};

        val minimumReplacement = solution.minimumReplacement(nums);

        assertThat(minimumReplacement).isEqualTo(20);

    }





}