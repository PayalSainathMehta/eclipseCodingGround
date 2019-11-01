def isSymmetric(TreeNode root):
    return isMirror(root, root)

def isMirror(TreeNode t1, TreeNode t2):
    if t1 == null and t2 == null:
        return True
    if t1 == null or t2 == null:
        return False
    return isMirror(t1.right,t2.left) && isMirror(t1.left,t2.right) 