// https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class linked-list-cycle-ii {
    // tc -> n, sc-> n
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();        
        
        while(head!=null){
            if(!visited.contains(head))
            visited.add(head);
            else return head;
            head = head.next;
        }
        
        return null;
    }
    
    // tc -> n, sc-> 1
    public ListNode detectCycle(ListNode head) {
        //if(head==null || head.next==null) return null;
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                isCycle = true;
                break;
            }
        }
        
        if(!isCycle) return null;
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
