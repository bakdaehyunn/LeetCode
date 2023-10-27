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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 =new ListNode(0);
        ListNode dummy2 =new ListNode(0);
        ListNode list1 = dummy1;
        ListNode list2 = dummy2;
        while(head!=null){
            if(head.val<x){
                list1.next = head;
                list1 = list1.next;
            }else{
                list2.next = head;
                list2 = list2.next;
            }
            head= head.next;
        }
        list2.next =null;
        list1.next = dummy2.next;
        return dummy1.next;
    }
}