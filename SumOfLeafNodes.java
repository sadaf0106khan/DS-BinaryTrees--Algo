package trees;
class BinaryTreeForSumLeafData{
	
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		a.left=null;
		a.rigth=null;
		return a;
	}
	
	public boolean isLeaf(Node node) {
		if(node==null)
			return false;
		
		if(node.left==null&&node.rigth==null)
			return true;
		
		isLeaf(node.left);
		isLeaf(node.rigth);
		
		return false;
	}
	int sum;
	public int sumOfLeafNodes(Node node) {
		if(node==null)
			return 0;
		
		if(isLeaf(node)) {
			sum+=node.data;
		}
		sumOfLeafNodes(node.left);
		sumOfLeafNodes(node.rigth);
		
		return sum;
	}
}
public class SumOfLeafNodes {
public static void main(String[] args) {
	BinaryTreeForSumLeafData bt=new BinaryTreeForSumLeafData();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	//root.rigth.rigth.left = bt.getNode(4);
	
	System.out.println(bt.sumOfLeafNodes(root));
}
}
