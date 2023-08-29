package com.eval.medium.minimumPenaltyForAShop;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void testThat(){
        Stream.of(
                new Pair("YYNY", 2),
                new Pair("YYYY", 4),
                new Pair("YNNY", 1),
                new Pair("NNNN", 0),
                new Pair("YYNY", 2),
                new Pair("YYNY", 2),
                new Pair("YYNY", 2),
                new Pair("YYNY", 2),
                new Pair("YYNY", 2),
                new Pair("YYNY", 2),
                new Pair("YYYNY", 3)
        ).forEach(this::testThatParametrized);
    }


    void testThatParametrized(Pair pair){
        System.out.println(pair);
        val bestClosingTime = solution.bestClosingTime(pair.customers);

        assertThat(bestClosingTime).isEqualTo(pair.bestTime);
    }

    record Pair(String customers, int bestTime){
    }







}