/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //Stack implementation using Stack class of java
      Stack<ListNode> stack=new Stack<ListNode>();
        //move till the end of linked list
        while(head!=null)
        {
            stack.push(head);
            head=head.next;
        }
        
        ListNode dummy = new ListNode(-1);
        head=dummy;
        while(!stack.isEmpty())
        {
            ListNode current = stack.pop();
            head.next= new ListNode(current.val);
            head = head.next;
        }
        return dummy.next;
    }
}
