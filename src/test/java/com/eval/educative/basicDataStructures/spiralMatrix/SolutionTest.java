package com.eval.educative.basicDataStructures.spiralMatrix;



import lombok.val;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;


class SolutionTest {


    @Test
    void test() {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        val integers = Solution.spiralOrder(matrix);

        val expected = Lists.newArrayList(1, 2, 3, 6, 9, 8, 7, 4, 5);

    }

}