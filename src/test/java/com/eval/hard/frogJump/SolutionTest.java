package com.eval.hard.frogJump;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    final Solution solution = new Solution();


    @Test
    void frogCanJump() {

        val stones = new int[]{0, 1, 3, 5, 6, 8, 12, 17};
        val canJump = solution.canCross(stones);
        assertThat(canJump).isTrue();

    }

    @Test
    void frogCantJump() {

        val stones = new int[]{0, 1, 2, 3, 4, 8, 9, 11};
        val canJump = solution.canCross(stones);
        assertThat(canJump).isFalse();

    }

    @Test
    void failedTestFromLeetCode(){
        val stones = new int[]{0, 2};
        val canJump = solution.canCross(stones);
        assertThat(canJump).isFalse();
    }

}