package stringsJava;

public class Node {

	private int data;
	private Node leftChild;
	private Node rightChild;
	
	Node(int key){
		this.data = key;
		leftChild = null;
		rightChild = null;
	}
	
	public void rootNode(Node root) {
		Node fisrtNode = root;
		//int key = value;
		//fisrtNode.data = key;
		fisrtNode.leftChild = null;
		fisrtNode.rightChild = null;
		
	}
	
	public void insertNode(Node root, Node value) {
		Node currentNode = value;
		Node rootNode = root;
		if (currentNode.data < rootNode.data) {
			if(rootNode.leftChild == null) {
				rootNode.leftChild = currentNode;
			}else if(rootNode.leftChild != null){
				insertNode(rootNode.leftChild, currentNode);
			}
		}else if(currentNode.data > rootNode.data) {
			if(rootNode.rightChild == null) {
				rootNode.rightChild = currentNode;
			}else if(rootNode.rightChild != null){
				insertNode(rootNode.rightChild, currentNode);
			}
		}else if(currentNode.data == rootNode.data) {
			System.out.println("Same Node");
		}
		
		
	}
	
}
