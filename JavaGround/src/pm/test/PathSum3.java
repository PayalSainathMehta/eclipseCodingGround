package pm.test;
import java.util.ArrayList;
import java.util.List;

class Node{
	int val;
	Node left;
	Node right;
	Node(int x){
		val = x;
	}
}
class PathSum3 {
    public List<List<Integer>> pathSum(Node root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, sum, new ArrayList<Integer>(),paths);
        return paths;
    }
    
    public void findPaths(Node root, int sum, List<Integer>current, List<List<Integer>> paths){
        if(root == null)
            return;
        current.add(root.val);
        if(root.val == sum && root.left == null && root.right == null){
            paths.add(current);
            return;
        }
        findPaths(root.left, sum - root.val, new ArrayList<Integer>(current),paths);
        findPaths(root.right, sum - root.val, new ArrayList<Integer>(current),paths);
        
        
    }
}