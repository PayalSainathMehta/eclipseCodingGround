class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

def levelOrder(self, root: TreeNode):
    levels = []
    if not root:
        return levels
    
    def helper(root,level):
        if len(levels) == level:
            levels.append([])
        levels.append([root.val])
        
        if root.left:
            helper(root.left,level + 1)
        if root.right:
            helper(root.right,level + 1)
        
    helper(root,0)
    return levels
    
    
