package com.eval.old.hard.minimunReplacementsToSortTheArray;



public class Solution {

    @Deprecated
    public long minimumReplacementFailed1(int[] nums){

        double res = 0;
        int n  = nums.length;
        double maxMinVal = nums[n -1];

        for (int i = n - 2; i >= 0; i--) {
            double parts = Math.ceil(nums[i]/ maxMinVal);
            res+=parts -1;

            maxMinVal = nums[i]/parts;
        }

        return (long) res;
    }




    @Deprecated
    public long minimumReplacementFailed(int[] nums) {
        var operations = 0L;
        final int n = nums.length;
        if (nums[n -1] == 1){
            for (int num : nums) {
                operations +=num;
            }
            return operations - n;
        }
        var next = nums[n -1];
        for (int i = n - 2; i > 0; i--) {
            final int curr = nums[i];
            if (curr > next){
                final int count = curr / next;
                final int mod = curr % next;
                if (mod == 0){
                    operations += count - 1;
                } else {
                    operations += count;
                    next = mod;
                }
            } else {
                next = curr;
            }
        }

        return operations;
    }

        public long minimumReplacement(int[] nums) {
            long ans = 0;

            int max = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; --i) {
                final int ops = (nums[i] - 1) / max;
                ans += ops;
                max = nums[i] / (ops + 1);
            }

            return ans;
        }

}
