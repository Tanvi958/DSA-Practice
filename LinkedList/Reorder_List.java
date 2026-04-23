// Problem 143: Reorder List
// Platform: LeetCode 
// Difficulty: Medium

// Approach:
// The goal is to reorder the list as:
// L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...

// Step 1: Find the middle of the linked list
// Use slow and fast pointers to reach the midpoint

// Step 2: Reverse the second half of the list
// Reverse nodes after the middle

// Step 3: Merge the two halves
// Alternate nodes from first half and reversed second half

// Time Complexity: O(n)
// Space Complexity: O(1)  // in-place modification

package LinkedList;

public class Reorder_List {

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(second != null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        // Step 3: Merge
        ListNode first = head;
        ListNode secondHalf = prev;

        while(secondHalf != null){
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = temp1;

            first = temp1;
            secondHalf = temp2;
        }
    }
}

