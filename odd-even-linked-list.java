// https://leetcode.com/problems/odd-even-linked-list/
class Solution {
   // tc -> n, sc-> 1
   public ListNode oddEvenList(ListNode head) {
       if(head==null) return null;        
       ListNode even = head.next, odd = head, evenHead = even;        
       while(even!=null && even.next!=null){
           odd.next = odd.next.next;
           even.next = even.next.next;
           odd = odd.next;
           even = even.next;
       }
       odd.next = evenHead;
       return head;
   }
}
