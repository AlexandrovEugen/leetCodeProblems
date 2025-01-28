package com.eval.old.medium.maxLenghtOfPairChain;

import com.eval.old.medium.maxLenghtOfPairChain.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void theLongestChainHasToBe2(){
        val pairs = new int[][]{{1,2}, {2,3}, {3,4}};
        val longestChain = solution.findLongestChain(pairs);
        assertThat(longestChain).isEqualTo(2);
    }
    @Test
    void theLongestChainHasToBe2Inverted(){
        val pairs = new int[][]{{2,3}, {3,4}, {1,2}};
        val longestChain = solution.findLongestChain(pairs);
        assertThat(longestChain).isEqualTo(2);
    }
    @Test
    void theLongestChainHasToBe3(){
        val pairs = new int[][]{{1,2}, {7,8}, {4,5}};
        val longestChain = solution.findLongestChain(pairs);
        assertThat(longestChain).isEqualTo(3);
    }


}