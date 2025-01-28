package com.eval.old.medium.minimumPenaltyForAShop;


import lombok.val;

public class Solution {

    public int bestClosingTime(String customers) {
        var minPenalty = 0;
        var penalty = 0;
        var bestHour = -1;

        for (int i = 0; i < customers.length(); i++) {
            char c = customers.charAt(i);
            if (c == 'Y'){
                penalty++;
            } else {
                penalty--;
            } if (penalty > minPenalty){
                minPenalty = penalty;
                bestHour = i;
            }
        }
        return bestHour + 1;
    }

    @Deprecated
    public int bestClosingTimeValid(String customers) {
        var prefix_n = new int[customers.length() + 1];
        var postfix_y = new int[customers.length() + 1];

        var nCount = 0;
        for (int i = 1; i < prefix_n.length; i++) {
            val charAt = customers.charAt(i - 1);
            if (charAt == 'N'){
                nCount++;
            }
            prefix_n[i] = nCount;
        }
        var yCount = 0;
        for (int j = postfix_y.length - 2; j >= 0; j--) {
            val charAt = customers.charAt(j);
            if (charAt == 'Y'){
                yCount++;
            }
            postfix_y[j] = yCount;
        }
        var index = 0;
        var min = Integer.MAX_VALUE;
        for (int i = 0; i < prefix_n.length; i++) {
            val penalty = prefix_n[i] + postfix_y[i];
            if (penalty < min){
                min = penalty;
                index = i;
            }
        }
        return index;
    }

    @Deprecated
    public int bestClosingTimeOld(String customers){
        int[] penalties = timeFinder(customers);
        var min = Integer.MAX_VALUE;
        var index = 0;
        for (var i = 0; i < penalties.length; i++) {
            if (min > penalties[i]){
                min = penalties[i];
                index = i;
            }
        }
        return index;
    }

    private int[] timeFinder(String customers) {
        int[] penalties = new int[customers.length() + 1];
        for (int i = 0; i < penalties.length; i++) {
            penalties[i] = calculatePenalty(customers, i);
        }
        return penalties;
    }

    private int calculatePenalty(String customers, int hourOfClosing) {
        var noVisits = 0;
        var penalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            final int customerVisit = customers.charAt(i);
            if (customerVisit == 'Y'){
                if (i >= hourOfClosing){
                    penalty++;
                }
            } else {
                noVisits++;
                if (i < hourOfClosing){
                    penalty++;
                }
            }
        }
        if (hourOfClosing > customers.length()){
            return noVisits;
        }
        return penalty;
    }

}
