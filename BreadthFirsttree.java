package stringsJava;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirsttree {
	
	public BreadthFirsttree() {
	BinaryTree b1 = new BinaryTree();
	Node BreadthNode = b1.getroot();
	}
	Queue<Integer> q1 = new LinkedList<Integer>();
	
	public void bfs(Node BreadthNode) {
		Node first = BreadthNode;
		if (first != null) {
			if(q1.contains(first.getdata())) {
				
			q1.remove(first.getdata());
			}
			System.out.println(first.getdata());
			q1.add(first.getdata());
			/*System.out.println(first.getleftChild());
			//q1.add(first.getleftChild().getdata());
			System.out.println(first.getrightChild());
			//q1.add(first.getrightChild().getdata());
*/			Node leftchild = first.getleftChild();
			bfs(leftchild);
			Node rightchild= first.getrightChild();
			bfs(rightchild);
		}
	}
	
	

}
