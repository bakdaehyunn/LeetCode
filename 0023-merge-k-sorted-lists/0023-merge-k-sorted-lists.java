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
        if(lists.length==0) return null;
        return helper(lists,0,lists.length-1);
    }
    public ListNode helper(ListNode[] lists, int left, int right){
        if(left==right)return lists[left];
        int mid = left +(right-left)/2;
        ListNode leftNode = helper(lists,left,mid);
        ListNode rightNode = helper(lists,mid+1,right);
        return merge(leftNode,rightNode);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy =new ListNode(0);
        ListNode prev = dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                prev.next= left;
                left=left.next;
            }else{
                prev.next = right;
                right = right.next;
            }
            prev= prev.next;
        }
        if(left!=null){
            prev.next = left;
        }
        if(right!=null){
            prev.next =right;
        }
        return dummy.next;
    }
}