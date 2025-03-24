package com.eval.year2025.medium.puzzle2685;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();





    /*
    Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4]]
    Output: 3
    Explanation: From the picture above, one can see that all the components of this graph are complete.
    */
    @Test
    void example1() {
        int n = 6;
        int[][]edges = {{0,1},{0,2},{1,2},{3,4}};

        int result = solution.countCompleteComponents(n, edges);

        assertThat(result).isEqualTo(3);
    }



    /*
    Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
    Output: 1
    Explanation: The component containing vertices 0, 1, and 2 is complete since there is an edge between every pair of two vertices. On the other hand, the component containing vertices 3, 4, and 5 is not complete since there is no edge between vertices 4 and 5. Thus, the number of complete components in this graph is 1.
    */
    @Test
    void example2() {
        int n = 6;
        int[][]edges = {{0,1},{0,2},{1,2},{3,4},{3,5}};

        int result = solution.countCompleteComponents(n, edges);

        assertThat(result).isEqualTo(1);
    }

}