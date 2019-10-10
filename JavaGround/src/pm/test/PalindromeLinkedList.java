package pm.test;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		ListNode temp = head;
		int len = 0;
		
		//finding length
		while(temp != null) {
			len = len + 1;
			temp = temp.next;
			
		}
		
		if(len <= 1) return true;
		ListNode[] reverse = new ListNode[len / 2];
		int counter = len/2 -1;
		temp = head;
		for(int i = 0; i < len/2 - 1; i++)
		{
			reverse[counter] = temp;
			temp = temp.next;
			counter = counter - 1;
		}
		temp = len % 2 == 0 ? temp : temp.next;
		counter = 0;
		while(temp != null) {
			if(temp.val != reverse[counter].val)
				return false;
			counter++;
			temp = temp.next;
		}
		return true;
	}
}
