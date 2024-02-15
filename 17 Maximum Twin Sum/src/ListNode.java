//Maximum Twin Sum of a Linked List
//
//
//In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list
//is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
//
//    For example, if n = 4, then node 0 is the twin of node 3, 
//    and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
//
//The twin sum is defined as the sum of a node and its twin.
//
//Given the head of a linked list with even length, return the maximum twin sum of the linked list.
public class ListNode {
	 int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) 
	      { this.val = val;
	      this.next = next;
	       };
}
class Solution {
    public int pairSum(ListNode head) {
        int dolzina=0;
        ListNode count=head;
        while(count!=null){
            dolzina++;
            count=count.next;
        }

        ListNode tmp=head;
        for(int i=0;i<dolzina/2-1;i++){
            tmp=tmp.next;
        }
        
        ListNode current=tmp.next;
        tmp.next=null;
        ListNode prev=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        tmp=head;
        ListNode tmp2=prev;
        int maks=0;
        while(tmp!=null){
            if((tmp.val+tmp2.val)>maks)
            {
                maks=tmp.val+tmp2.val;
            }
            tmp=tmp.next;
            tmp2=tmp2.next;

        }
        



        return maks;
    }
}