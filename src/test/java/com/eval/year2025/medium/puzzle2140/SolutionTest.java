package com.eval.year2025.medium.puzzle2140;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    /*
    Input: questions = [[3,2],[4,3],[4,4],[2,5]]
    Output: 5
    Explanation: The maximum points can be earned by solving questions 0 and 3.
    - Solve question 0: Earn 3 points, will be unable to solve the next 2 questions
    - Unable to solve questions 1 and 2
    - Solve question 3: Earn 2 points
    Total points earned: 3 + 2 = 5. There is no other way to earn 5 or more points.
     */
    @Test
    void example1() {
        final int[][] questions = {{3,2},{4,3},{4,4},{2,5}};

        long res = solution.mostPoints(questions);

        assertThat(res).isEqualTo(5);
    }

    /*
    Input: questions = [[1,1],[2,2],[3,3],[4,4],[5,5]]
    Output: 7
    Explanation: The maximum points can be earned by solving questions 1 and 4.
    - Skip question 0
    - Solve question 1: Earn 2 points, will be unable to solve the next 2 questions
    - Unable to solve questions 2 and 3
    - Solve question 4: Earn 5 points
    Total points earned: 2 + 5 = 7. There is no other way to earn 7 or more points.
    */
    @Test
    void example2() {
        final int[][] questions = {{1,1},{2,2},{3,3},{4,4},{5,5}};

        long res = solution.mostPoints(questions);

        assertThat(res).isEqualTo(7);
    }


}