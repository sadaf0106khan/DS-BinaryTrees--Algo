package trees;

class MirrorStructureToEachOther{

	public Node getNode(int i) {
		Node a=new Node();
		a.data=i;
		return a;
	}
	
public boolean isMirrorStructureToEachOther(Node node1,Node node2) {
		
		if(node1==null&&node2==null)
			return true;
		
		if (node1==null||node2==null)
			return false;
		
		return     isMirrorStructureToEachOther(node1.left,node2.rigth)
				 &&isMirrorStructureToEachOther(node1.rigth,node2.left);
	}
	
}

public class CheckIfTwoHaveMirrorStructureToEachOther2 {
public static void main(String[] args) {
	MirrorStructureToEachOther bt=new MirrorStructureToEachOther();
	
	Node root=bt.getNode(2);
	root.left=bt.getNode(7);
	root.rigth=bt.getNode(8);
	root.left.left=bt.getNode(5);
	
	Node root1=bt.getNode(12);
	root1.left=bt.getNode(18);
	root1.rigth=bt.getNode(17);
	root1.rigth.rigth=bt.getNode(15);
	
	System.out.println(bt.isMirrorStructureToEachOther(root,root1));
}
}
