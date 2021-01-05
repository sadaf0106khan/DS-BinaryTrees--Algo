package trees;

class CheckIdentical {
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}

	

	public boolean isIdentical(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)
			return false;

		return node1.data == node2.data && isIdentical(node1.left, node2.left) && isIdentical(node1.rigth, node2.rigth);
	}
}

public class CheckIfTwoBinaryTreeAreIdentical {
	public static void main(String[] args) {
		CheckIdentical bt = new CheckIdentical();

		Node root = bt.getNode(8);
		root.left = bt.getNode(3);
		root.rigth = bt.getNode(10);
		root.left.left = bt.getNode(1);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(4);
		root.left.rigth.rigth = bt.getNode(7);
		root.rigth.rigth = bt.getNode(14);
		root.rigth.rigth.left = bt.getNode(13);

		// bt.inorder(root);
		Node root2 = bt.getNode(8);
		root2.left = bt.getNode(3);
		root2.rigth = bt.getNode(10);
		root2.left.left = bt.getNode(1);
		root2.left.rigth = bt.getNode(6);
		root2.left.rigth.left = bt.getNode(4);
		root2.left.rigth.rigth = bt.getNode(7);
		root2.rigth.rigth = bt.getNode(14);
		root2.rigth.rigth.left = bt.getNode(13);

		System.out.println(bt.isIdentical(root, root2));
	}
}
