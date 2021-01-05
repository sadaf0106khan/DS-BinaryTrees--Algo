package trees;
class Rightviewoftree {

	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}
	
	int maxlevel;//instance variable with default value zero
	
	public void rightView(Node node,int level) {
		if(node==null) {
			return;
		}
		if(level>=maxlevel) {
			System.out.print(node.data+" ");
			maxlevel++;
		}
		rightView(node.rigth,level+1);
		rightView(node.left,level+1);
	}//right view of tree

}


		
		

public class RightView {
public static void main(String[] args) {
	Rightviewoftree bt=new Rightviewoftree();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	
	bt.rightView(root, 0);
}
}
