package trees;
class SumOfAllNode{
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}
public int sumOfAllNode(Node node){
	int sum=0;
	if(node==null)
		return 0;
	else {
		sum+=node.data+sumOfAllNode(node.left)+sumOfAllNode(node.rigth);
	}
	return sum;
}
}
public class SumOfAllNodesInBinaryTree {
	public static void main(String[] args) {
		SumOfAllNode bt = new SumOfAllNode();
		Node root = bt.getNode(2);
		root.left = bt.getNode(7);
		root.rigth = bt.getNode(5);
		root.left.left = bt.getNode(2);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(5);
		root.left.rigth.rigth = bt.getNode(11);
		root.rigth.rigth = bt.getNode(9);
		root.rigth.rigth.left = bt.getNode(4);
		System.out.println(bt.sumOfAllNode(root));
	}
}
