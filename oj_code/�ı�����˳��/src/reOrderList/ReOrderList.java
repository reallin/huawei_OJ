package reOrderList;
/**
 * Reorder List
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 首先将题目所给单链表从中间分割为两个单链表，再将后半个单链表反向，最后合并两个单链表即可。
 *
 */

public class ReOrderList {
public void reorderList(ListNode head) {
        if(head == null || head.next == null){
        	return;
        }
        ListNode first = head;
        ListNode second = head.next;
        while(second != null&&second.next != null){
        	first = first.next;
        	second = second.next.next;
        }
        ListNode p = second.next;
        second.next = null;
        ListNode after = p.next;
        ListNode before = null;
        while(p != null){
        after = p.next;
        p.next = before;
        before = p;
        p = after;
        }
        
        ListNode l1 = head;
        ListNode l2 = before;
        while (l1 != null && l2 != null) {    
            ListNode l1Next = l1.next;    
            ListNode l2Next = l2.next;    
            l1.next = l2;    
            l2.next = l1Next;    
            l1 = l1Next;    
            l2 = l2Next;    
        }    
    }

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
}

