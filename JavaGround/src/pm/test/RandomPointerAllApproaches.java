package pm.test;

import java.util.HashMap;
import java.util.Map;

/*
 * IGNORE NULL PASSED IN NODE CALLS
 */
class LNode {
    public int val;
    public LNode next;
    public LNode random;

    public LNode() {}

    public LNode(int _val,LNode _next,LNode _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
    
public class RandomPointerAllApproaches {
	
	public LNode copyRandomListExtraSpace(LNode head) {
		if(head == null)
			return head;
		Map<LNode,LNode> mp = new HashMap<>();
		LNode curr = head;
		//First pass - make clones
		while(curr != null) {
			mp.put(curr, new LNode(curr.val, null, null));
			curr = curr.next;
		}
		
		//2nd pass
		curr = head;
		while(curr != null) {
			mp.get(curr).next = mp.get(curr.next);
			mp.get(curr).random = mp.get(curr.random);
			curr = curr.next;
		}
		
		return mp.get(head);
		
	}
	
	
	
	//2nd approach
	public LNode copyRandomListWithoutExtraSpace(LNode head) {
		if(head == null)
			return head;
		
		LNode curr = head;
		LNode next = null;
		
		//first pass - create mapping to clones
		while(curr != null) {
			next = curr.next;
			LNode copy = new LNode(curr.val,null,null);
			curr.next = copy;
			copy.next = next;
			curr = next;
		}
		
		
		//second pass - assign random pointers
		curr = head;
		while(curr != null) {
			if(curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;
		}
		
		//third pass - restore original list
		curr = head;
		LNode dummyHead = new LNode(0,null,null);
		LNode clonedTailList = dummyHead;
		LNode copy = null;
		while(curr != null) {
			//save the next node
			next = curr.next.next;
			//store current's clone
			copy = curr.next;
			//add current's clone to final list
			clonedTailList.next = copy;
			clonedTailList = copy;
			//restore current's next node
			curr.next = next;
			//advance
			curr = next;
		}
		
		return dummyHead.next;
	}

		

}
