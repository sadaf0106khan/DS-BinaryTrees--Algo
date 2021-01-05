package trees;

class GetTotalnodes{
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}
	
	public int totalNodes(Node node) {
		if(node==null)
			return 0;
		else
			return 1+totalNodes(node.left)+totalNodes(node.rigth);
	}
}
public class GetTotalNoOfNodes {
public static void main(String[] args) {
	GetTotalnodes bt=new GetTotalnodes();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	System.out.println(bt.totalNodes(root));
}
}
