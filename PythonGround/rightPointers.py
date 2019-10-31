def connect(root):
    if not root:
        return root
    stack = []
    stack.append(root)
    tail = root
    while stack:
        node = stack.pop(0)
        if node.left:
            stack.append(node.left)
        if node.right:
            stack.append(node.right)
        if node == tail:
            node.next = None
            tail = stack[-1] if stack else None
        else:
            node.next = stack[0]
    return root
        