package trees;

import java.util.Stack;

class inordertraversal {
	public Node getNode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.rigth = null;
		return a;
	}

	
	  public Node inorder(Node node) {
	   if (node == null) 
	   return null;
	   inorder(node.left);
	   System.out.print(node.data+" ");
	   inorder(node.rigth);
	   
	   return node;
	  
	  }
//	public void inorder(Node node) {
//		if (node == null)
//			return;
//		Stack<Node> s = new Stack<Node>();
//		s.push(node);
//		inorder(node.left);
//		 
//		while(s.size()>0) {
//			Node t=s.pop();
//			System.out.print(t.data+" ");
//			if(t.rigth!=null) {
//				Node temp=t.rigth;
//				while(temp!=null) {
//					s.push(temp);
//					temp=temp.left;
//				}
//			}
//		}
//	}//without using recursion

}

public class InorderTraversal {
	public static void main(String[] args) {
		inordertraversal bt = new inordertraversal();

		Node root = bt.getNode(8);
		root.left = bt.getNode(3);
		root.rigth = bt.getNode(10);
		root.left.left = bt.getNode(1);
		root.left.rigth = bt.getNode(6);
		root.left.rigth.left = bt.getNode(4);
		root.left.rigth.rigth = bt.getNode(7);
		root.rigth.rigth = bt.getNode(14);
		root.rigth.rigth.left = bt.getNode(13);
		System.out.println("inorder");
		bt.inorder(root);

	}
}
