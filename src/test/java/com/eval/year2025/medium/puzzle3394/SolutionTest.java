package com.eval.year2025.medium.puzzle3394;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {


    private final Solution solution = new Solution();


    /*
    Input: n = 5, rectangles = [[1,0,5,2],[0,2,2,4],[3,2,5,3],[0,4,4,5]]

    Output: true

    Explanation:

    The grid is shown in the diagram. We can make horizontal cuts at y = 2 and y = 4. Hence, output is true.

    */
    @Test
    void example1(){
        int n = 5;
        int[][] rectangles = {{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};

        boolean res = solution.checkValidCuts(n, rectangles);


        assertThat(res).isTrue();
    }


    /*
    Input: n = 4, rectangles = [[0,0,1,1],[2,0,3,4],[0,2,2,3],[3,0,4,3]]

    Output: true

    Explanation:

    We can make vertical cuts at x = 2 and x = 3. Hence, output is true.
    */
    @Test
    void example2(){
        int n = 4;
        int[][] rectangles = {{0,0,1,1},{2,0,3,4},{0,2,2,3},{3,0,4,3}};

        boolean res = solution.checkValidCuts(n, rectangles);


        assertThat(res).isTrue();
    }

    /*

    Input: n = 4, rectangles = [[0,2,2,4],[1,0,3,2],[2,2,3,4],[3,0,4,2],[3,2,4,4]]

    Output: false

    Explanation:

    We cannot make two horizontal or two vertical cuts that satisfy the conditions. Hence, output is false.
    */
    @Test
    void example3(){
        int n = 4;
        int[][] rectangles = {{0,2,2,4},{1,0,3,2},{2,2,3,4},{3,0,4,2},{3,2,4,4}};

        boolean res = solution.checkValidCuts(n, rectangles);


        assertThat(res).isFalse();
    }

    @Test
    void example4(){
        int n = 3;
        int[][] rectangles = {{0,0,1,3},{1,0,2,2},{2,0,3,2},{1,2,3,3}};

        boolean res = solution.checkValidCuts(n, rectangles);


        assertThat(res).isFalse();
    }

}