// Last updated: 09/07/2026, 09:51:12
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next; // skip node
            } else {
                prev = curr; // move prev only if not deleted
            }
            curr = curr.next;
        }
        
        return dummy.next;
    }
}