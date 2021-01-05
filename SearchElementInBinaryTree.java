package trees;

import java.util.LinkedList;
import java.util.Queue;

class SearchInBinaryTree{
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		a.left=null;
		a.rigth=null;
		return a;
	}
	
	public boolean isPresent(Node node,int data) {
		if(node==null)
			return false;
		
		Queue<Node> q=new LinkedList<Node>();
		
		q.offer(node);
		
		while(q.size()>0) {
			Node t=q.poll();
			
			if(t.data==data)
				return true;
			
			if(t.left!=null)
				q.offer(t.left);
			
			if(t.rigth!=null)
				q.offer(t.rigth);
		}
		
		return false;
	}
}

public class SearchElementInBinaryTree {
public static void main(String[] args) {
	SearchInBinaryTree bt=new SearchInBinaryTree();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	
	System.out.println(bt.isPresent(root, 20));
}
}
