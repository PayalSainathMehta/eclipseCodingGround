class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None



class LinkedList:
    def __init__(self):
        "constructor to initiate this object"
         
        self.head = None
        self.tail = None
        return
#     
    def add_list_item(self, item):
        "add an item at the end of the list"
         
        if not isinstance(item, ListNode):
            item = ListNode(item)
 
        if self.head is None:
            self.head = item
        else:
            self.tail.next = item

        self.tail = item
             
        return
    
    def prettyPrintList(self):
        dummy = self.head
        while dummy:
            print(dummy.val,'',end = '')
            dummy = dummy.next
            
        print()
    def detectCycle(self):
        #Using reverse list to check cycle
        head = self.head
        if not head or not head.next:
            return False
        reverse = self.reverseLinkedList(head)
        if reverse is head:
            return True
        return False
        

    def reverseLinkedList(self, head):
        new_head = None
        while head:
            temp = head.next
            head.next = new_head
            new_head = head
            head = temp
        return new_head
            
    def detectCycleWithoutReverse(self):
        head = self.head
        l = []
        while head:
            if head in l:
                return True
            else:
                l.append(head)
            head = head.next
        return False
        

list = LinkedList()
list.add_list_item(3)
list.add_list_item(2)
list.add_list_item(0)
list.add_list_item(-4)
list.add_list_item(2)
list.prettyPrintList()  
print(list.detectCycle())
print(list.detectCycleWithoutReverse())





