package com.eval.medium.addTwoNumbers;


public class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode ret = new ListNode();
        ListNode opr = ret;
        int sum = 0;

        while (l1 != null || l2 != null || sum !=0){
            if (l1 != null){
                sum = sum + l1.getVal();
                l1 = l1.getNext();
            }
            if (l2 != null){
                sum = sum + l2.getVal();
                l2 = l2.getNext();
            }
            opr.setNext(new ListNode(sum % 10));
            sum = sum /10;
            opr = opr.getNext();
        }
        return ret.getNext();
    }

    @Deprecated
    public ListNode addTwoNumbersMine(ListNode l1, ListNode l2) {
        ListNode tmpL1 = l1;
        ListNode tmpL2 = l2;
        int size = 0;

        while (tmpL1 != null || tmpL2 != null) {
            size++;
            if (tmpL1 != null) {
                tmpL1 = tmpL1.getNext();
            }
            if (tmpL2 != null) {
                tmpL2 = tmpL2.getNext();
            }
        }
        if (size == 0) {
            return new ListNode();
        }
        int [] digits = new int[size+1];
        int inc = 0;
        boolean extra = false;
        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                int sumOfDigits = l1.getVal() + l2.getVal();
                if (extra){
                    sumOfDigits +=1;
                }
                extra = sumOfDigits >= 10;
                digits[inc] = sumOfDigits % 10;
                l1 = l1.getNext();
                l2 = l2.getNext();
                inc++;
            }
            else if (l1 != null){
                int digit = l1.getVal();
                if (extra){
                    digit+=1;
                }
                extra = digit >=10;
                digits[inc] = digit % 10;
                l1 = l1.getNext();
                inc++;
            }
            else {
                int digit = l2.getVal();
                if (extra){
                    digit+=1;
                }
                extra = digit >=10;
                digits[inc] = digit % 10;
                l2 = l2.getNext();
                inc++;
            }
        }
        ListNode tmp = new ListNode(digits[0]);
        ListNode resultList = tmp;
        for (int i = 1; i < digits.length - 1; i++) {
            tmp.setNext(new ListNode(digits[i]));
            tmp = tmp.getNext();
        }
        if (extra){
            tmp.setNext(new ListNode(1));
        }
        return resultList;
    }

    @Deprecated
    public ListNode addTwoNumbersPrev(ListNode l1, ListNode l2){
        long first = 0;
        long second = 0;
        long inc1 = 1;
        long inc2 = 1;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                int digit1 = l1.getVal();
                l1 = l1.getNext();
                first += digit1 * inc1;
                if (l1 != null) {
                    inc1 *= 10;
                }
            }
            if (l2 != null) {
                int digit2 = l2.getVal();
                l2 = l2.getNext();
                second += digit2 * inc2;
                if (l2 != null) {
                    inc2 *= 10;
                }
            }
        }
        long inc = 10;
        long result = first + second;
        System.out.println(first + " + " + second + " = " + result);
        ListNode tmp = new ListNode((int) (result % inc));
        result /= inc;
        ListNode resultList = tmp;
        while (result != 0) {
            tmp.setNext(new ListNode((int) (result % inc)));
            tmp = tmp.getNext();
            result /= inc;
        }
        return resultList;
    }
}
