
class Node:
    def __init__(self,val,next,random):
        self.val = val
        self.next = next
        self.random = random
        
class Solution:
    
    def __init__(self):
        self.visited = {}

    def getClonedNode(self,node):
        if node:
            if node in self.visited:
                return self.visited[node]
            self.visited[node] = Node(node.val,None,None)
            return self.visited[node]
        return None
    
    def copyRandomList(self, head):
        if not head:
            return None
        
        old_node = head
        new_node = Node(old_node.val,None,None)
        self.visited[old_node] = new_node
        
        while old_node:
            
            new_node.random = self.getClonedList(old_node.random)
            new_node.next = self.getClonedNode(old_node.next)
            
            old_node = old_node.next
            new_node = new_node.next
        
