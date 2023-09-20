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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists==null || lists.length==0) return null;
        return helper(lists,0,lists.length-1);
    }
    public ListNode helper(ListNode[] lists, int left,int right){
      if(left==right) return lists[left];
      int mid = left + (right-left)/2;
      ListNode l1 = helper(lists,left,mid);
      ListNode r1 = helper(lists,mid+1,right);
      return merge(l1,r1);
    }
    public ListNode merge(ListNode l1, ListNode r1){
      ListNode dummy = new ListNode(0);
      ListNode current = dummy;

      while(l1!=null&&r1!=null){
        if(l1.val<r1.val){
          current.next = l1;
          l1 = l1.next;
        }else{
          current.next = r1;
          r1 = r1.next;
        }
        current = current.next;
      }
      if(l1!=null) current.next = l1;
      if(r1!=null) current.next = r1;
      return dummy.next;
    }
}