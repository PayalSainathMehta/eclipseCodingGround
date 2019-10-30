# Definition for a binary tree node.
import json
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        def helper(nums, low, high):
            if low > high:
                return None
            mid = low + (high - low)//2
            root = TreeNode(nums[mid])
            root.left = helper(nums, low, mid-1)
            root.right = helper(nums, mid+1, high)
            return root
        
        return helper(nums, 0, len(nums) - 1)

def stringToIntegerList(input):
    return json.loads(input)

def treeNodeToString(root):
    if not root:
        return "[]"
    output = ""
    queue = [root]
    current = 0
    while current != len(queue):
        node = queue[current]
        current = current + 1

        if not node:
            output += "null, "
            continue

        output += str(node.val) + ", "
        queue.append(node.left)
        queue.append(node.right)
    return "[" + output[:-2] + "]"

def main():
    import sys
    def readlines():
        for line in sys.stdin:
            yield line.strip('\n')
    lines = readlines()
    while True:
        try:
            line = lines.__next__()
            nums = stringToIntegerList(line)
            
            ret = Solution().sortedArrayToBST(nums)

            out = treeNodeToString(ret)
            print(out)
        except StopIteration:
            break

if __name__ == '__main__':
    main()