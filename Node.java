package stringsJava;

public class Node {

	private int data;
	private Node leftChild;
	private Node rightChild;
	
	public Node getleftChild() {
		return leftChild;
	}
	public Node getrightChild() {
		return rightChild;
	}
	public int getdata() {
		return data;
	}
	
	Node(int key){
		this.data = key;
		leftChild = null;
		rightChild = null;
	}
	
	/*public static rootNode(Node root) {
		Node fisrtNode = root;
		//int key = value;
		//fisrtNode.data = key;
		fisrtNode.leftChild = null;
		fisrtNode.rightChild = null;
		
	}*/
	
	public void insertNode(Node value) {
		Node currentNode = value;
		//Node root = new Node(getroot());
		if (currentNode.data < data) {
			if(leftChild == null) {
				leftChild = currentNode;
			}else if(leftChild != null){
				leftChild.insertNode(currentNode);
			}
		}else if(currentNode.data > data) {
			if(rightChild == null) {
				rightChild = currentNode;
			}else if(rightChild != null){
				rightChild.insertNode(currentNode);
			}
		}else if(currentNode.data == data) {
			System.out.println("Same Node");
		}
		
		
	}
	
}
