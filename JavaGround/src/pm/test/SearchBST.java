package pm.test;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}
public class SearchBST {
	TreeNode root;

	public static TreeNode searchBST(TreeNode root, int val) {
		if(root == null) {
			return null;
		}
		else if(root.val == val) {
			return root;
		}
		else {
		}
		
		return root;
		
	}
	
	public static void main(String[] args) {
		SearchBST tree = new SearchBST();
		
		tree.root = new TreeNode(1);
		/*
		 * tree.root.left = new TreeNode(2); tree.root.right = new TreeNode(3);
		 * tree.root.left.left = new TreeNode(4); tree.root.left.right = new
		 * TreeNode(5);
		 * 
		 */
        System.out.println(searchBST(tree.root,1));
	}

}
