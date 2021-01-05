package trees;


class CountLeafNodes{
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}
	
	public int leafNodes(Node node) {
		if(node==null)
			return 0;
		if(node.left==null&&node.rigth==null)
			return 1;
		
		return leafNodes(node.left)+leafNodes(node.rigth);
		
	}
}
public class TotalNoOfLeafNodes {
public static void main(String[] args) {
	CountLeafNodes bt=new CountLeafNodes();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	System.out.println(bt.leafNodes(root));
}
}
