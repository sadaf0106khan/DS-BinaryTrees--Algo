package trees;

import java.util.Stack;

class PostorderTraversal{
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		return a;
	}
	
	public void postorder(Node node) {
		if(node==null)
			return;
		
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		
		s1.push(node);
		
		while(s1.size()>0) {
			Node t=s1.pop();
			
			s2.push(t);
			
			if(t.left!=null)
				s1.push(t.left);
			if(t.rigth!=null)
				s1.push(t.rigth);
		}
		
		while(s2.size()>0)
			System.out.print(s2.pop().data+" ");
	}
}
public class PostorderWithoutRecursion {

}
