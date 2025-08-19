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
            //reach end of list and connect it to the head
            // make length-k.next as new head
            //reach the node length-k from start and make next as null

            //reach the end of the list and find length;
            if(head == null){
                return null;
            }
            if(head.next == null && k==1){
                return head;
            }
            ListNode ptr1 = head;
            ListNode newHead = null;
            int i =0;
            while(ptr1.next!=null){
                ptr1=ptr1.next;
                i++;
            }
            
            //System.out.println("Length of list = " + (i+1));
            int length = (i+1);
            if(k>i+1){
                k = (k%length);
            }
            else if(k==length){
                return head;
            }
            ptr1.next = head;
            int nodeFromStart = i-k-1;
            ListNode ptr2 = head;
            int j = 0;
            while(j<=nodeFromStart){
                ptr2=ptr2.next;
                j++;
            }
            newHead = ptr2.next;
            ptr2.next = null;

            return newHead;
    }
}