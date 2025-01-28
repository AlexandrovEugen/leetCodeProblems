package com.eval.old.medium.splitLinkedListinParts;

import com.eval.old.medium.addTwoNumbers.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        var copyHead = head;
        var array = new ListNode[k];
        var length = 0;
        while (copyHead != null){
            length++;
            copyHead = copyHead.next;
        }
        copyHead = head;
        if (length < k){
            var i = 0;
            while (copyHead != null){
                array[i] = new ListNode(copyHead.val);
                copyHead = copyHead.next;
                i++;
            }
        }
        else if (length % k == 0){
            var i = 0;
            final int partSize = length/k;
            var partSizeCounter = partSize;
            ListNode currHead = null;
            while (copyHead != null){
                if (partSizeCounter  == partSize){
                    array[i] = new ListNode(copyHead.val);
                    currHead = array[i];
                    partSizeCounter--;
                    copyHead = copyHead.next;
                } else if (partSizeCounter > 0){
                    currHead.next = new ListNode(copyHead.val);
                    currHead = currHead.next;
                    copyHead = copyHead.next;
                    partSizeCounter--;
                } else {
                    i++;
                    currHead = null;
                    partSizeCounter = partSize;
                }
            }
        } else {
            var timesMoreThenPartition = length % k;
            var partSize = length/ k;
            var partSizeExtra = partSize + 1;
            var partSizeCounter = partSizeExtra;
            var i = 0;
            ListNode currHead = null;
            while (copyHead != null){
                if (partSizeCounter == partSizeExtra){
                    currHead = new ListNode(copyHead.val);
                    array[i] = currHead;
                    partSizeCounter--;
                    copyHead = copyHead.next;
                } else if (partSizeCounter > 0){
                    currHead.next = new ListNode(copyHead.val);
                    currHead = currHead.next;
                    copyHead = copyHead.next;
                    partSizeCounter--;
                } else {
                    i++;
                    currHead = null;
                    partSizeCounter = partSizeExtra;
                    if (timesMoreThenPartition > 1){
                        timesMoreThenPartition--;
                    } else {
                        partSizeExtra = partSize;
                        partSizeCounter = partSize;
                    }
                }

            }
        }
        return array;
    }
}