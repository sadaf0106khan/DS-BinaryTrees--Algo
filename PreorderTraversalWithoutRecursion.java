package trees;

import java.util.Stack;

class PreOrderTraversal{
	
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		return a;
	}
	public void preorder(Node node) {
		
		if(node==null)
			return ;
		Stack<Node> s=new Stack<Node>();
		s.push(node);
		
		while(s.size()>0) {
			Node t=s.pop();
			System.out.print(t.data+" ");
			if(t.rigth!=null)
				s.push(t.rigth);
			if(t.left!=null)
				s.push(t.left);
		}
	}
	
}

public class PreorderTraversalWithoutRecursion {
public static void main(String[] args) {
	PreOrderTraversal bt=new PreOrderTraversal();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	
	bt.preorder(root);
}
}
