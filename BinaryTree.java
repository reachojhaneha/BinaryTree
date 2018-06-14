package stringsJava;

public class BinaryTree {

	private static Node root;

	public void traverseInorder(Node root) {
		Node firstNode = root;

		if (firstNode.leftChild == null) {
			System.out.println(firstNode.leftChild.data);
		}
		if (firstNode.rightChild == null) {
			System.out.println(firstChild.rightChild.data);
		}
		Node leftChild = traverseInorder(firstNode.leftChild);
		traverseInorder(firstNode);
		Node rightChild = traverseInorder(firstNode.rightChild);

	}

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node.rootNode(node1);
		Node node2 = new Node(12);
		Node node3 = new Node(8);
		Node node4 = new Node(20);
		Node node5 = new Node(5);

		Node.insertNode(node2);
		Node.insertNode(node3);
		Node.insertNode(node4);
		Node.insertNode(node5);

	}

}