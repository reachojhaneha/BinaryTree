package stringsJava;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirsttree {

	public BreadthFirsttree() {
		BinaryTree b1 = new BinaryTree();
		Node BreadthNode = b1.getroot();
	}

	Queue<Node> q1 = new LinkedList<Node>();

	public void bfs(Node BreadthNode) {
		Node first = BreadthNode;
		q1.add(first);
		while (!q1.isEmpty()) {
			Node temp = q1.peek();
			q1.remove();
			System.out.println(temp.getdata());
			if (temp.getleftChild() != null) {
				q1.add(temp.getleftChild());
			}
			if (temp.getrightChild() != null) {
				q1.add(temp.getrightChild());
			}
		}

	}

}
