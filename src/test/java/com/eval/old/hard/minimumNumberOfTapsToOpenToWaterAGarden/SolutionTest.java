package com.eval.old.hard.minimumNumberOfTapsToOpenToWaterAGarden;

import com.eval.old.hard.minimumNumberOfTapsToOpenToWaterAGarden.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void exampleFromLeetCode1(){

        var n = 5;
        var ranges = new int[]{3, 4, 1, 1, 0, 0};

        val minimumNumberOfTaps = solution.minTaps(n, ranges);

        assertThat(minimumNumberOfTaps).isEqualTo(1);
    }
    @Test
    void exampleFromLeetCode2(){

        var n = 3;
        var ranges = new int[]{0, 0, 0, 0};

        val minimumNumberOfTaps = solution.minTaps(n, ranges);

        assertThat(minimumNumberOfTaps).isEqualTo(-1);
    }




}