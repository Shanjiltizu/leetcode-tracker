// Last updated: 20/07/2026, 10:09:56
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; death.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        
        // Dummy node to easily handle changes to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // 1. Reach the node just before the inversion zone
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        
        // 2. In-place reversal of the sub-list
        ListNode curr = prev.next; 
        ListNode then = curr.next; 
        
        // Notice we need exactly (right - left) operations
        for (int i = 0; i < right - left; i++) {
            curr.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = curr.next;
        }
        
        return dummy.next;
    }
}