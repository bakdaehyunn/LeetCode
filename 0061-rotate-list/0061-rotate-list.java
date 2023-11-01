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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode prev = head;
        int len=1;
        while(prev!=null&&prev.next!=null){
            len++;
            prev=prev.next;
        }
        prev.next= head;
        k %=len;
        for(int i=0;i<len-k;i++){
            prev= prev.next;
        }
        head = prev.next;
        prev.next =null;
        return head;
    }
}