package solution;
	   

public class Solution {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	 if (l1 == null) return l2;  
         if (l2 == null) return l1;  
    	int model = 0;
    	ListNode Result = new ListNode(0);
    	Result.next = l1;
    	ListNode l;
    	while(l1 != null&&l2!=null){
    	l1.val = l1.val+l2.val+model;
    	model = l1.val/10;
    	Result = l1;

    	l1 = l1.next;
    	l2 = l2.next;
    	}
    	if(l2!=null){
    		Result.next = l2;
    		l1 = l2;
    	}
    	while(l1!=null){
    		l1.val += model;  
    		model = l1.val / 10;  
            l1.val = l1.val % 10;  
            Result = l1;  
            l1 = l1.next;
    		
    	}
    	if(model > 0){
    		Result.next = new ListNode(model);
    	}
    	return Result;
        //ListNode list = new ListNode();
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
