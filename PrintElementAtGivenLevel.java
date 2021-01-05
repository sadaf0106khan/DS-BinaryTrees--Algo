package trees;


class PrintLevelElement{
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		a.left=null;
		a.rigth=null;
		return a;
	}
	
	public void printAtLevel(Node node , int level) {
		if(node==null)
			return;
		if(level==1)
			System.out.print(node.data+" ");
		else {
			printAtLevel(node.left,level-1);
			printAtLevel(node.rigth,level-1);
		}
	}
	public int getHeight(Node node) {
		if(node==null)
			return -1;
		else {
			return max(getHeight(node.left),getHeight(node.rigth))+1;
		}
	}
	private int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	public void printLevelOrder(Node node) {
		if(node==null)
			return;
		
		for(int i=0;i<=getHeight(node);i++) {
			
			printAtLevel(node,i+1);
			System.out.println();
			
			}
			
		}
	public void printLevelOrderInReverse(Node node) {
		if(node==null)
			return;
		
		for(int i=getHeight(node);i>=0;i--) {
			
			printAtLevel(node,i+1);
			System.out.println();
			
			}
			
		}
	
}

public class PrintElementAtGivenLevel {
public static void main(String[] args) {
	PrintLevelElement bt=new PrintLevelElement();
	Node root = bt.getNode(2);
	root.left = bt.getNode(7);
	root.rigth = bt.getNode(5);
	root.left.left = bt.getNode(2);
	root.left.rigth = bt.getNode(6);
	root.left.rigth.left = bt.getNode(5);
	root.left.rigth.rigth = bt.getNode(11);
	root.rigth.rigth = bt.getNode(9);
	root.rigth.rigth.left = bt.getNode(4);
	bt.printLevelOrder(root);System.out.println();
	bt.printLevelOrderInReverse(root);
}
}
