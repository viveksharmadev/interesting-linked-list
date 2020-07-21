// https://leetcode.com/problems/remove-linked-list-elements/
class remove-linked-list-elements {
    // tc -> n, sc-> 1
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;        
        while(curr!=null){
            if(curr.next!=null && curr.next.val==val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }            
        }
        return dummy.next;
    }
}
