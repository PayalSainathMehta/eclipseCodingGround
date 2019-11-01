import json
class ListNode:
    def __init__(self, x):
            self.val = x
            self.next = None


class Solution:
    def removeDuplicates(self, head: ListNode) -> ListNode:
        dhead = ListNode(0)
        dhead.next = head
        prev = dhead
        while prev:
            curr = prev.next
            while curr and curr.next and curr.next.val == curr.val:
                curr = curr.next
            if prev.next != curr:
                prev.next = curr.next
                continue
            prev = prev.next
        return dhead.next
        

def stringToIntegerList(input):
    return json.loads(input)

def stringToListNode(input):
    # Generate list from the input
    numbers = stringToIntegerList(input)

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
    import io
    def readlines():
        for line in io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8'):
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            head = stringToListNode(line);
            
            ret = Solution().removeDuplicates(head)

            out = listNodeToString(ret);
            print(out)
        except StopIteration:
            break

if __name__ == '__main__':
    main()