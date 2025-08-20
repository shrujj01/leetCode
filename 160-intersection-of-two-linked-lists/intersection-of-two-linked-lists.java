/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB==null){
            return null;
        }
        
        //bringing pointer to same location
        int lenA = getLinkedListLength(headA);
        int lenB = getLinkedListLength(headB);
        ListNode startA = headA;
        ListNode startB = headB;

        if(lenA < lenB){
            int diff = Math.abs(lenA-lenB);
            int counter = 0;
            while(counter < diff){
                startB = startB.next;
                counter++;
            }
        }
        else{
            int diff = Math.abs(lenA-lenB);
            int counter = 0;
            while(counter < diff){
                startA = startA.next;
                counter++;
            }
        }

        //System.out.println("A value = " + startA.val + " B value = " + startB.val);
            while(startA != null && startB != null){
                if(startA == startB){
                    return startA;
                }
                startA = startA.next;
                startB = startB.next;
            }
            return null;
    }

    public int getLinkedListLength(ListNode head){
        if(head == null){
            return 0;
        }
        int length = 0;
        ListNode start = head;
        while(start != null){
            start = start.next;
            length++;
        }
        return length;
    }
}