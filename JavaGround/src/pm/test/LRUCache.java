package pm.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache {
	
	int maxCapacity;
	int totalItemsinCache;
	
	ListNode head = new ListNode();
	ListNode tail = new ListNode();
	
	Map<Integer, ListNode> mp = new HashMap<>();
	
	private class ListNode{
		int val;
		int key;
		ListNode prev;
		ListNode next;
	}
	

	public LRUCache(int capacity) {
		//initialize everything
		totalItemsinCache = 0;
		this.maxCapacity = capacity;
		
	
		head.next = tail;
		tail.prev = head;
	}
	
	public int get(int key) {
		ListNode node = mp.get(key);
		if(node == null) return -1;
		
		moveToHead(node);
		return node.val;
	}
	
	
	public void put(int key, int value) {
		ListNode node = mp.get(key);
		if(node == null) {
			ListNode newNode = new ListNode();
			newNode.key = key;
			newNode.val = value;
			
			mp.put(key, newNode);
			addToFront(newNode);
			totalItemsinCache++;
			
			if(totalItemsinCache > maxCapacity)
				removeLRUEntry();		
		}
		else {
			node.val = value;
			moveToHead(node);
		}
		
	
	}
	
	public void removeLRUEntry() {
		ListNode tailItem = tail.prev;
		removeFromList(tailItem);
		mp.remove(tailItem);
		--totalItemsinCache;
	}
	
	public void removeFromList(ListNode node) {
		ListNode savedPrev = node.prev;
		ListNode savedNext = node.next;
		
		savedPrev.next = savedNext;
		savedNext.prev = savedPrev;
	}
	
	public void addToFront(ListNode node) {
		node.prev = head;
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
	}
	
	public void moveToHead(ListNode node) {
		removeFromList(node);
		addToFront(node);
	}
	
	
}