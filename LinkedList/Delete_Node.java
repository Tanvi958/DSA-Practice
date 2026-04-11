// Problem 237: Delete Node in a Linked List
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We are not given access to the head of the linked list.
// So, we cannot find the previous node.
// Instead, we copy the value of the next node into the current node.
// Then, we delete the next node by skipping it.

// Time Complexity: O(1)
// Space Complexity: O(1)
package LinkedList;

public class Delete_Node {


  //Definition for singly-linked list.
    public class ListNode 
    {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
 

    public void deleteNode(ListNode node) 
    {
        node.val=node.next.val;
        node.next=node.next.next;

    
    }
}
