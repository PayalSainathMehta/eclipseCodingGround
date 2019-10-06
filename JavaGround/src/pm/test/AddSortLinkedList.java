package pm.test;


class ListNode {
	 ListNode head;
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	 

	    /* Method to print linked list */
	    void printList() 
	    { 
	        ListNode temp = head; 
	        while (temp != null) 
	        { 
	            System.out.print(temp.val + " "); 
	            temp = temp.next; 
	        }  
	        System.out.println(); 
	    } 
	 
	    public void addToTheLast(ListNode node)  
		{ 
			
		    if (head == null) 
		    { 
		        head = node; 
		    } 
		    else 
		    { 
		        ListNode temp = head; 
		        while (temp.next != null) 
		            temp = temp.next; 
		        temp.next = node; 
		    } 
		} 
	 
}

public class AddSortLinkedList {	
	
	
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
    
    public static void main(String[] args) {
    	ListNode list1 = new ListNode(1);
    	ListNode list2 = new ListNode(1);
    	
    	list1.addToTheLast(new ListNode(1)); 
        list1.addToTheLast(new ListNode(2)); 
        list1.addToTheLast(new ListNode(4)); 
          
        // Node head2 = new Node(2); 
        list2.addToTheLast(new ListNode(1)); 
        list2.addToTheLast(new ListNode(3)); 
        list2.addToTheLast(new ListNode(4));
    	
    	list1.printList();
    	list2.printList();
    	
    	ListNode res = mergeTwoLists(list1,list2);
    	res.printList();
    }
}
