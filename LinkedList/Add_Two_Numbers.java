// Problem 2: Add Two Numbers
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// The numbers are represented as linked lists in reverse order,
// where each node contains a single digit.
//
// We traverse both linked lists simultaneously and add corresponding digits.
// At each step, we also include the carry from the previous addition.
//
// A dummy node is used to simplify result list construction.
// For each sum, we create a new node with (sum % 10) and update the carry (sum / 10).
//
// The loop continues until both lists are fully traversed and no carry remains.
//
// Finally, we return dummy.next, which points to the head of the result list.

// Time Complexity: O(max(m, n))
// Space Complexity: O(max(m, n))


package LinkedList;

public class Add_Two_Numbers {
    // /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; 
    }

}
