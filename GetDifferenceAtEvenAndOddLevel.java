package trees;

class GetDifference {

	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}

	public int getDifference(Node node) {
		if (node == null)
			return 0;
		else {
			return node.data - getDifference(node.left) - getDifference(node.rigth);
		}
	}
}

public class GetDifferenceAtEvenAndOddLevel {
	public static void main(String[] args) {
		GetDifference bt = new GetDifference();
		Node root = bt.getNode(2);
		root.left = bt.getNode(7);
		root.rigth = bt.getNode(5);
		root.left.left = bt.getNode(2);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(5);
		root.left.rigth.rigth = bt.getNode(11);
		root.rigth.rigth = bt.getNode(9);
		root.rigth.rigth.left = bt.getNode(4);
		System.out.println(bt.getDifference(root));
	}
}
