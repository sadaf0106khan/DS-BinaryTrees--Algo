package trees;
class CheckMirrorSymmetric{

	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		return a;
	}
	
	public boolean isMirrorToEachOther(Node node1,Node node2) {
		
		if(node1==null&&node2==null)
			return true;
		
		if (node1==null||node2==null)
			return false;
		
		return node1.data==node2.data
				&&isMirrorToEachOther(node1.left,node2.rigth)
				&&isMirrorToEachOther(node1.rigth,node2.left);
	}
	
}
public class CheckIfTwoTreesAreMirrorToEachOther {
public static void main(String[] args) {
	CheckMirrorSymmetric bt=new CheckMirrorSymmetric();
//	Node root=bt.getNode(8);
//	root.left=bt.getNode(3);
//	root.rigth=bt.getNode(10);
//	root.left.left=bt.getNode(1);
//	root.left.rigth=bt.getNode(6);
//	root.left.rigth.left=bt.getNode(4);
//	root.left.rigth.rigth=bt.getNode(7);
//	root.rigth.rigth=bt.getNode(14);
//	root.rigth.rigth.left=bt.getNode(13);
//	
//	Node root1=bt.getNode(8);
//	root1.left=bt.getNode(10);
//	root1.rigth=bt.getNode(3);
//	root1.left.left=bt.getNode(14);
//	root1.left.rigth=bt.getNode(13);
//	root1.rigth.left=bt.getNode(6);
//	root1.rigth.rigth=bt.getNode(1);
//	root1.rigth.left.rigth=bt.getNode(4);
//	root1.rigth.left.left=bt.getNode(7);
	
	Node root=bt.getNode(2);
	root.left=bt.getNode(7);
	root.rigth=bt.getNode(8);
	root.left.left=bt.getNode(5);
	
	Node root1=bt.getNode(2);
	root1.left=bt.getNode(8);
	root1.rigth=bt.getNode(7);
	root1.rigth.rigth=bt.getNode(5);
	
	System.out.println(bt.isMirrorToEachOther(root, root1));
}
}
