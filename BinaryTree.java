package stringsJava;

public class BinaryTree{

	private static Node root;
	
	public Node getroot() {
		return root;
	}

	public static void traverseInorder(Node root) {
		Node firstNode =  root;

		if (firstNode != null) {
		
		Node leftChild = firstNode.getleftChild();
		traverseInorder(leftChild);
		System.out.println(firstNode.getdata());
		Node rightChild = firstNode.getrightChild(); 
	    traverseInorder(rightChild);
		
		}
	}
	
	public static void traversePreorder(Node root) {
		Node firstNode = root;
		if (firstNode != null) {
			System.out.println(firstNode.getdata());
			Node leftnode = firstNode.getleftChild();
			traversePreorder(leftnode);
			Node rightnode = firstNode.getrightChild();
			traversePreorder(rightnode);
		}
	}
	
	public static void traversePostorder(Node root) {
		Node firstNode = root;
		if (firstNode != null) {
			Node leftnode = firstNode.getleftChild();
			traversePostorder(leftnode);
			Node rightnode = firstNode.getrightChild();
			traversePostorder(rightnode);
			System.out.println(firstNode.getdata());
		}
	}
	

	public static void main(String[] args) {
		Node root = new Node(10);
		//Node.rootNode(node1);
		Node node2 = new Node(12);
		Node node3 = new Node(8);
		Node node4 = new Node(20);
		Node node5 = new Node(5);
		Node node6 = new Node(11);
		Node node7 = new Node(9);
		

		root.insertNode(node2);
		root.insertNode(node3);
		root.insertNode(node4);
		root.insertNode(node5);
		root.insertNode(node6);
		root.insertNode(node7);
		traverseInorder(root);
		System.out.println("===========================");
		traversePreorder(root);
		System.out.println("============================");
		traversePostorder(root);
	}

}