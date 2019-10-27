from queue import PriorityQueue

# q = PriorityQueue()
# q.put((1,2))
# q.put((-1,3))
# while not q.empty():
#     print(q.get())

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
        
def mergeKLists(lists):
    minHeap = PriorityQueue()
    for head in lists:
        while head:
            minHeap.put(head.val)
            head = head.next
    dummy = ListNode(-1)
    head = dummy
    while not minHeap.empty():
        head.next = ListNode(minHeap.get())
        head = head.next
    return dummy.next
    
    
