package com.eval.old.hard.medianOfTwoSortedArrays;

import com.eval.old.hard.medianOfTwoSortedArrays.Solution;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {
        final int[] nums1 = {1, 3};
        final int[] nums2 = {2};
        val expectedMedian = 2.00000;
        val actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(actualMedian).isEqualTo(expectedMedian);
    }

    @Test
    void test2() {
        final int[] nums1 = {1, 2};
        final int[] nums2 = {3,4};
        val expectedMedian = 2.50000;
        val actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(actualMedian).isEqualTo(expectedMedian);
    }
    @Test
    void test3() {
        final int[] nums1 = {};
        final int[] nums2 = {1};
        val expectedMedian = 1.00000;
        val actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(actualMedian).isEqualTo(expectedMedian);
    }
    @Test
    void test4() {
        final int[] nums1 = {1};
        final int[] nums2 = {2};
        val expectedMedian = 1.50000;
        val actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(actualMedian).isEqualTo(expectedMedian);
    }
    @Test
    void test5() {
        final int[] nums1 = {1, 3, 4};
        final int[] nums2 = {2};
        val expectedMedian = 2.50000;
        val actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertThat(actualMedian).isEqualTo(expectedMedian);
    }




}