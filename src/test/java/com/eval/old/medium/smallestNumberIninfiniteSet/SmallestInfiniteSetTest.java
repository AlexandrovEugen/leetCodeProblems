package com.eval.old.medium.smallestNumberIninfiniteSet;

import com.eval.old.medium.smallestNumberIninfiniteSet.SmallestInfiniteSet;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SmallestInfiniteSetTest {

    final SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

    @Test
    void exampleFromLeetCode1(){
        smallestInfiniteSet.addBack(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(3);
        smallestInfiniteSet.addBack(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(4);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(5);

    }

    @Test
    void exampleFromLeetCode2(){
        smallestInfiniteSet.addBack(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(3);
        smallestInfiniteSet.addBack(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);

        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(4);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(5);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(6);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(7);
        smallestInfiniteSet.addBack(3);
        smallestInfiniteSet.addBack(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);

    }



}