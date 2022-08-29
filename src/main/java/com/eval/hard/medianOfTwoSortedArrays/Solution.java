package com.eval.hard.medianOfTwoSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c = (nums2.length + nums1.length) / 2;
        final boolean isOdd = (nums2.length + nums1.length) / 2d % 1 != 0;
        int previousElem;
        int currentIndex = 0;
        int i = 0;
        int j = 0;

        if (nums1.length == 1 && nums2.length == 0) return nums1[0];
        if (nums1.length == 0 && nums2.length == 1) return nums2[0];


        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j] || nums1[i] < nums2[j]) {
                    previousElem = nums1[i];
                    i++;
                } else {
                    previousElem = nums2[j];
                    j++;
                }
                currentIndex++;

                if (currentIndex == c) {
                    boolean b = i <= nums1.length - 1 && j <= nums2.length - 1;
                    if (isOdd) {
                        if (b) {
                            return Math.min(nums1[i], nums2[j]);
                        } else if (i <= nums1.length - 1) {
                            return nums1[i];
                        } else return nums2[j];
                    } else {
                        if (b) {
                            return (previousElem + Math.min(nums1[i], nums2[j])) / 2d;
                        } else if (i <= nums1.length - 1) {
                            return (previousElem + nums1[i]) / 2d;
                        } else return (previousElem + nums2[j]) / 2d;
                    }
                }
            } else if (i < nums1.length) {
                previousElem = nums1[i];
                i++;
                currentIndex++;
                if (currentIndex == c) {
                    if (isOdd) {
                        return nums1[i];
                    } else {
                        return (previousElem + nums1[i]) / 2d;
                    }
                }

            } else {
                previousElem = nums2[j];
                j++;
                currentIndex++;
                if (currentIndex == c) {
                    if (isOdd) {
                        return nums2[j];
                    } else {
                        return (previousElem + nums2[j]) / 2d;
                    }
                }
            }
        }
        return 0d;
    }

}
