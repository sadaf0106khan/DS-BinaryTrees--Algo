package trees;

class postordertraversal {
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}

	public void postorder(Node node) {
		if (node == null)
			return;
		else {
			postorder(node.left);
			postorder(node.rigth);
			System.out.print(node.data + " ");
		}

	}
}

public class PostOrderTraversal {
	public static void main(String[] args) {
		postordertraversal bt = new postordertraversal();
		Node root = bt.getNode(2);
		root.left = bt.getNode(7);
		root.rigth = bt.getNode(5);
		root.left.left = bt.getNode(2);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(5);
		root.left.rigth.rigth = bt.getNode(11);
		root.rigth.rigth = bt.getNode(9);
		root.rigth.rigth.left = bt.getNode(4);
		System.out.println("inorder");
		bt.postorder(root);
	}
}
