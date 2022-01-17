
public class Main {

	
	public static void main(String[] args) {
		
		Tree baum = new Tree();
		
		baum.addNode(8);
		baum.addNode(6);
		baum.addNode(10);
		baum.addNode(12);
		baum.addNode(4);
		baum.addNode(2);
		baum.addNode(100);
		
		int count = baum.countNodes(baum.root);
		System.out.println("Anzahl der Nodes: " + count);
		
		System.out.println("-----------");
		
		baum.inOrderTravers(baum.root);
		
		System.out.println("-----------");
		Node serachNode = baum.find(12);
		System.out.println("Gefunden Node mit dem Wert: " + serachNode.value);
		
		
		
	}
}
