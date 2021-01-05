package trees;

class RotableBinaryTree{

	public Node getNode(int i) {
		Node a=new Node();
		a.data=i;
		return a;
	}
	
	public boolean isRotable(Node node) {
		if(node==null)
			return false;
		return isMirror(node.left,node.rigth);
	}
	
	public boolean isMirror(Node a,Node b) {
		if(a==null&&b==null)
			return true;
		
		if(a==null||b==null)
			return false;
		
		return isMirror(a.left,b.rigth)&&isMirror(a.rigth,b.left);
	}
	
}

public class CheckIfGivenBinaerIsRotable {
public static void main(String[] args) {
	RotableBinaryTree bt=new RotableBinaryTree();
	Node root=bt.getNode(2);
	root.left=bt.getNode(17);
	root.rigth=bt.getNode(7);
	root.left.left=bt.getNode(15);
	root.rigth.rigth=bt.getNode(5);
	root.left.left.left=bt.getNode(61);
	root.rigth.rigth.rigth=bt.getNode(6);
	System.out.println(bt.isRotable(root));
}
}
