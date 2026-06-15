// Problem 2095: Delete the Middle Node of a Linked List
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use the Slow and Fast Pointer technique
// to find the middle node of the linked list.
//
// Key Observation:
// - Slow pointer moves one step at a time.
// - Fast pointer moves two steps at a time.
// - When fast reaches the end,
//   slow reaches the middle node.
//
// Steps:
// 1. Handle the edge case:
//      - If the list contains only one node,
//        return null.
// 2. Initialize:
//      - slow = head
//      - fast = head
//      - prev = null
// 3. Move:
//      - slow by one step
//      - fast by two steps
//      while fast and fast.next are not null.
// 4. At the end:
//      - slow points to the middle node.
//      - prev points to the node before middle.
// 5. Delete the middle node:
//      prev.next = slow.next
// 6. Return the modified head.
//
// Example:
// Input: 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
//
// Middle node = 7
//
// Output:
// 1 -> 3 -> 4 -> 1 -> 2 -> 6
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public ListNode deleteMiddle(ListNode head) {

        // Single node case
        if (head == null || head.next == null) {

            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Find middle node
        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete middle node
        prev.next = slow.next;

        return head;
    }
}