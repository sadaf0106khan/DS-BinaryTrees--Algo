package trees;
class SameStructureToEachOther{

	public Node getNode(int i) {
		Node a=new Node();
		a.data=i;
		return a;
	}
	
	public boolean isSameStructureToEachOther(Node node1,Node node2) {
		if(node1==null&&node2==null)
			return true;
		
		if (node1==null||node2==null)
			return false;
		
		return     isSameStructureToEachOther(node1.left,node2.left)
				 &&isSameStructureToEachOther(node1.rigth,node2.rigth);
	}
}
public class CheckIfTwoHaveSameStructureToEachOther {
public static void main(String[] args) {
	SameStructureToEachOther bt=new SameStructureToEachOther();
	Node root=bt.getNode(2);
	root.left=bt.getNode(7);
	root.rigth=bt.getNode(8);
	root.left.left=bt.getNode(5);
	
	Node root1=bt.getNode(12);
	root1.left=bt.getNode(17);
	root1.rigth=bt.getNode(118);
	root1.left.left=bt.getNode(15);
	
	System.out.println(bt.isSameStructureToEachOther(root, root1));
}
}
