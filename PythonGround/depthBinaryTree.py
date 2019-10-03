class TreeNode:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None



def maxDepth(root):
    if root is None:
        return 0 
    countleft = maxDepth(root.left)
    countright = maxDepth(root.right)
    
    return max(countleft,countright) + 1


root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.right.right = TreeNode(4)


print(maxDepth(root))
       