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
    public ListNode reverseKGroup(ListNode head, int k) {
        //if(head==null) return null;
        int len=0;
        ListNode node =head;
        while(node!=null){
            len++;
            node = node.next;
        }
        int round = len/k;
        if(round ==0)return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0;i<round;i++){
            ListNode current = prev.next;
            for(int j=0;j<k-1;j++){
                ListNode temp = current.next;
                current.next = temp.next;
                temp.next  =prev.next;
                prev.next = temp;
            }
            prev = current;
        }
        return dummy.next;
    }
}