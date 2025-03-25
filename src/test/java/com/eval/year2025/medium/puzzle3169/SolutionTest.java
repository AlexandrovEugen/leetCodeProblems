package com.eval.year2025.medium.puzzle3169;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: days = 10, meetings = [[5,7],[1,3],[9,10]]

    Output: 2

    Explanation:

    There is no meeting scheduled on the 4th and 8th days.
    */
    @Test
    void example1(){
        int days = 10;
        int[][] meetings = {{5,7},{1,3}, {9, 10}};

        int res = solution.countDays(days, meetings);

        assertThat(res).isEqualTo(2);
    }

    /*

    Input: days = 5, meetings = [[2,4],[1,3]]

    Output: 1

    Explanation:

    There is no meeting scheduled on the 5th day.

    */
    @Test
    void example2(){
        int days = 5;
        int[][] meetings = {{2,4},{1,3}};

        int res = solution.countDays(days, meetings);

        assertThat(res).isEqualTo(1);
    }


    /*
    Input: days = 6, meetings = [[1,6]]

    Output: 0

    Explanation:

    Meetings are scheduled for all working days.
    */
    @Test
    void example3(){

        int days = 6;
        int[][] meetings = {{1,6}};

        int res = solution.countDays(days, meetings);

        assertThat(res).isEqualTo(0);
    }




}