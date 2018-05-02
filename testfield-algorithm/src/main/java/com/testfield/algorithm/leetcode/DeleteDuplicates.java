package com.testfield.algorithm.leetcode;

import com.testfield.algorithm.leetcode.bean.ListNode;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode node = head;
        ListNode nextNode = node.next;
        while (nextNode != null) {
            if (node.val == nextNode.val) {
                node.next = nextNode.next;
            } else {
                node = nextNode;
            }
            nextNode = nextNode.next;
        }

        return head;
    }
}
