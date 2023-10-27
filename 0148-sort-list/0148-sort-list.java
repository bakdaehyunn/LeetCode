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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev =null;
        while(fast!=null&&fast.next!=null){
            fast= fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left,right);
    }
    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                current.next  =left;
                left = left.next;
            }else{
                current.next= right;
                right = right.next;
            }
            current = current.next;
        }
        if(left!=null){
            current.next = left;
        }
        if(right!=null){
            current.next = right;
        }
        return dummy.next;
    }
}