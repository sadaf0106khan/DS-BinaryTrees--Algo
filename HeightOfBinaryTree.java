package trees;

class GetHeightOfNinaryTree{
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		a.left=null;
		a.rigth=null;
		return a;
	}
	
	public int heightOfTree(Node node) {
		if(node==null)
			return -1;
		return max(heightOfTree(node.left), heightOfTree(node.rigth))+1;
	}
	private int max(int a,int b) {
		return (a>b)?a:b;
	}
	
}


public class HeightOfBinaryTree {
public static void main(String[] args) {
	GetHeightOfNinaryTree bt=new GetHeightOfNinaryTree();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	System.out.println(bt.heightOfTree(root));
}
}
