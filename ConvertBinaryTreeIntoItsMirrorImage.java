package trees;

class MirrorImageOfBinaryTree{
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}
	
	public void inorder(Node node) {
		if(node==null)
			return;
		else {
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.rigth);
		}
	}
	
	public Node mirrorImageOfBinaryTree(Node node) {
		if(node==null)
			return null;
		
		Node temp=node.left;
		node.left=node.rigth;
		node.rigth=temp;
		
		mirrorImageOfBinaryTree(node.left);
		mirrorImageOfBinaryTree(node.rigth);
		
		return node;
	}
	
	public Node deleteBinaryTree(Node node) {
		return null;
	}
}

public class ConvertBinaryTreeIntoItsMirrorImage {
public static void main(String[] args) {
	MirrorImageOfBinaryTree bt=new MirrorImageOfBinaryTree();
	Node root = bt.getNode(8);
	root.left = bt.getNode(3);
	root.rigth = bt.getNode(10);
	root.left.left = bt.getNode(1);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(4);
	root.left.rigth.rigth = bt.getNode(7);
	root.rigth.rigth = bt.getNode(14);
	root.rigth.rigth.left = bt.getNode(13);
	bt.inorder(root);
	System.out.println();System.out.println();System.out.println("mirror image of given tree: ");System.out.println();
	Node mirror=bt.mirrorImageOfBinaryTree(root);
	bt.inorder(mirror);
	
}
}
