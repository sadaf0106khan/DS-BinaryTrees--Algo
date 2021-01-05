package trees;

class preordertraversal {

	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}

	public void preorder(Node node) {
		if (node == null)
			return;
		else {

			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.rigth);
		}

	}

}

public class PreorderTraversal {
	public static void main(String[] args) {
		preordertraversal bt = new preordertraversal();

		Node root = bt.getNode(2);
		root.left = bt.getNode(7);
		root.rigth = bt.getNode(5);
		root.left.left = bt.getNode(2);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(5);
		root.left.rigth.rigth = bt.getNode(11);
		root.rigth.rigth = bt.getNode(9);
		root.rigth.rigth.left = bt.getNode(4);
		System.out.println("preorder");
		bt.preorder(root);

	}
}
