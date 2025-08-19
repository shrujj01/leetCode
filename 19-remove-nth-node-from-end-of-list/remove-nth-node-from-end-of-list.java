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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null && n==1){
            return null;
        }

        ListNode ptr1 = head;
        int length=0;
        while(ptr1!=null){
            ptr1=ptr1.next;
            length++;
        }
        if(length==n){
            return head.next;
        }

        int startIndex = length-n-1;
        ListNode ptr2 = head;
        int j = 0;
        while(j<startIndex){
            ptr2=ptr2.next;
            j++;
        }
        ListNode removalNode = ptr2.next;
        ptr2.next = ptr2.next.next;
        removalNode.next = null;
        
        return head;
        
    }
}