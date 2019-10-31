class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        
def serialize(self, root):
    """Encodes a tree to a single string.
    
    :type root: TreeNode
    :rtype: str
    """
    def rserialize(root,string):
        if not root:
            string = string + 'None,'
        string = string + str(root.val) + ','
        string = rserialize(root.left, string)
        string = rserialize(root.right, string)
        return string
    
    return rserialize(root, '')

def deserialize(self, data):
    """Decodes your encoded data to tree.
    
    :type data: str
    :rtype: TreeNode
    """
    
    def rdeserialize(l):
        if l[0] == 'None':
            l.pop(0)
            return None
        root = TreeNode(l[0])
        l.pop(0)
        root.left = rdeserialize(l)
        root.right = rdeserialize(l) 
        return root
        
    data_list = data.split(',')
    root = rdeserialize(data_list)
    return root