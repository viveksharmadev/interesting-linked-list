// https://leetcode.com/problems/reorder-list/
class Solution {
   // tc -> N, sc-> 1
   public void reorderList(ListNode head) {
       if(head==null)
           return;
       
       // Find Middle
       ListNode slow = head, fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       
       // Reverse second half
       ListNode head2 = reverse(slow.next);
       slow.next = null; // Important
       
       // Link two halves together
       while(head!=null && head2!=null){
           ListNode temp1 = head.next;
           ListNode temp2 = head2.next;
           head2.next = head.next;
           head.next = head2;
           head = temp1;
           head2 = temp2;
       }
   }
   
   private ListNode reverse(ListNode n){
       ListNode prev = null;
       ListNode curr = n;
       while(curr!=null){
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       return prev;
   }
}
