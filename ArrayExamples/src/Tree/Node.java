package Tree;

//Start of Node class.
import java.io.*; // for I/O
import java.util.*; // for Stack class
import java.lang.Integer; // for parseInt()
////////////////////////////////////////////////////////////////

class Node {
	public String sData; // data item (key)
	public int dData; // data item
	public Node leftChild; // this node's left child
	public Node rightChild; // this node's right child

	public void displayNode() { // display ourself
		System.out.print(sData + " ");
		System.out.print(dData);
		System.out.println();
	} // End displayNode().
} // End Node.