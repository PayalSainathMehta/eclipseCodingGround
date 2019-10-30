# Definition for singly-linked list.
import json
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        p1 = headA
        p2 = headB
        l1 = l2 = 0
        while p1:
            l1 = l1 + 1
            p1 = p1.next
        while p2:
            l2 = l2 + 1
            p2 = p2.next
        p1 = headA
        p2 = headB
        i = 0
        if l1 > l2:
            diff = l1-l2
            while i < diff:
                p1 = p1.next
                i = i + 1
        else:
            diff = l2 - l1
            while i  < diff:
                p2 = p2.next
                i = i + 1
        while p1!=p2:
            p1 = p1.next
            p2 = p2.next
        return p1
                
                
def stringToInt(input):
    return int(input)

def stringToListNode(input):
    # Generate list from the input
    numbers = json.loads(input)

    # Now convert that list into linked list
    dummyRoot = ListNode(0)
    ptr = dummyRoot
    for number in numbers:
        ptr.next = ListNode(number)
        ptr = ptr.next

    ptr = dummyRoot.next
    return ptr

def listNodeToString(node):
    if not node:
        return "[]"

    result = ""
    while node:
        result += str(node.val) + ", "
        node = node.next
    return "[" + result[:-2] + "]"

def main():
    import sys
    def readlines():
        for line in sys.stdin:
            yield line.strip('\n')
    lines = readlines()
    while True:
        try:
            line = lines.__next__()
            intersectVal = stringToInt(line)
            line = lines.__next__()
            listA = stringToListNode(line)
            line = lines.__next__()
            listB = stringToListNode(line)
            line = lines.__next__()
            skipA = stringToInt(line)
            line = lines.__next__()
            skipB = stringToInt(line)
            
            ret = Solution().getIntersectionNode(listA, listB)

            out = listNodeToString(ret)
            print(out)
        except StopIteration:
            break

if __name__ == '__main__':
    main()