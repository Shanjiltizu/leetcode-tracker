// Last updated: 09/07/2026, 09:53:20
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
    public ListNode swapPairs(ListNode head) {

        // Base case: if list is empty or has only one node, return as is
        if(head==null || head.next==null){
            return head;
        }

        // Create dummy node to handle edge cases
        ListNode shead = new ListNode(0);
        ListNode temp = shead;
        temp.next = head;

        // Loop through pairs of nodes
        while(temp.next!=null && temp.next.next!=null){

            // Get the two nodes to swap
            ListNode first = temp.next;
            ListNode second = first.next;
            ListNode NextNode = second.next;

            // Swap the pair
            first.next = NextNode;
            temp.next = second;
            second.next = first;
            temp = first;
        }

        // Return head (skip dummy node)
        return shead.next;
    }
}