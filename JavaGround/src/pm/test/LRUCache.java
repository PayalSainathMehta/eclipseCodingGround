package pm.test;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    
    int maxCapacity;
    int totalItemsInCache;
    
    Map<Integer,ListNode> hashTable = new HashMap<>();
    ListNode head;
    ListNode tail;
    

    public LRUCache(int capacity) {
        totalItemsInCache = 0;
        this.maxCapacity = capacity;
            
        head = new ListNode();
        tail = new ListNode();
        
        head.next = tail;
        tail.prev = head;
        
        
    }
    
    public int get(int key) {
        
        ListNode node = hashTable.get(key);
            
        if (node == null) return -1;
        
        moveToHead(node);
        
        return node.value;
        
    }
    
    public void put(int key, int value) {
        ListNode node = hashTable.get(key);
            
        if (node == null){
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;
                
            hashTable.put(key, newNode);
            addToFront(newNode);
            totalItemsInCache++;
            
            if (totalItemsInCache > maxCapacity)
                removeLRUEntry();
        }
        else{
            node.value = value;
            moveToHead(node);
        }
    }   
        private void moveToHead(ListNode node){
            removeFromList(node);
            addToFront(node);
        }
        
        private void addToFront(ListNode node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;    
            head.next = node;
    }
        private void removeFromList(ListNode node){
            ListNode savedPrev = node.prev;
            ListNode savedNext = node.next;
            
            savedPrev.next = savedNext;
            savedNext.prev = savedPrev; 
        }
    
        private void removeLRUEntry(){
            ListNode tail = popTail();
            hashTable.remove(tail.key);
            --totalItemsInCache;
        }
    
        private ListNode popTail(){
            ListNode tailItem = tail.prev;
            removeFromList(tailItem);
            
            return tailItem;
        }
  private class ListNode{
    int key;
    int value;
    
    ListNode prev;
    ListNode next;
}      
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

