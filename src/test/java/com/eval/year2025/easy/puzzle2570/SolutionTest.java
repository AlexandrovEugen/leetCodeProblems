package com.eval.year2025.easy.puzzle2570;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new FastestSolution();


    /*
    Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
    Output: [[1,6],[2,3],[3,2],[4,6]]
    Explanation: The resulting array contains the following:
            - id = 1, the value of this id is 2 + 4 = 6.
            - id = 2, the value of this id is 3.
            - id = 3, the value of this id is 2.
            - id = 4, the value of this id is 5 + 1 = 6.

    */
    @Test
    void example1(){
        int[][] nums1 = {{1,2},{2,3},{4,5}}, nums2 = {{1,4},{3,2},{4,1}};

        int[][] result = solution.mergeArrays(nums1, nums2);

        assertThat(result).containsExactly(new int[]{1, 6}, new int[]{2, 3}, new int[]{3, 2}, new int[]{4, 6});

    }

    @Test
    void example2(){
        int[][] nums1 = {{148,597},{165,623},{306,359},{349,566},{403,646},{420,381},{566,543},{730,209},{757,875},{788,208},{932,695}};

        int[][] nums2 = {{74,669},{87,399},{89,165},{99,749},{122,401},{138,16},{144,714},{148,206},{177,948},{211,653},{285,775},{309,289},{349,396},{386,831},{403,318},{405,119},{420,153},{468,433},{504,101},{566,128},{603,688},{618,628},{622,586},{641,46},{653,922},{672,772},{691,823},{693,900},{756,878},{757,952},{770,795},{806,118},{813,88},{919,501},{935,253},{982,385}};


        int[][] result = solution.mergeArrays(nums1, nums2);

        assertThat(result).isNotEmpty();
    }

}