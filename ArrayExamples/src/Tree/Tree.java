package Tree;

import java.io.*; // for I/O
import java.util.*; // for Stack class
import java.lang.Integer; // for parseInt()
////////////////////////////////////////////////////////////////

class Tree {
	private Node root; // first node of tree
// -------------------------------------------------------------

	public Tree() // constructor
	{
		root = null;
	} // no nodes in tree yet
// -------------------------------------------------------------

	public Node reInsert(String id, Node root) {
		if (root == null) { // New insertion
			Node newNode = new Node();
			newNode.sData = id;
			newNode.dData = 1;
			newNode.leftChild = null;
			newNode.rightChild = null;
			return newNode;
		}
		int compare = id.compareTo(root.sData);
		if (compare < 0)
			root.leftChild = reInsert(id, root.leftChild);
		else if (compare > 0)
			root.rightChild = reInsert(id, root.rightChild);
		else
			root.dData++;
		return root;
	}

// -------------------------------------------------------------
	public void insert(String id) {
		root = reInsert(id, root);
	}

// -------------------------------------------------------------
	public void traverse() {
		inOrder(root);
	}

// -------------------------------------------------------------
	public void readInFromFile(String infilename) throws IOException {
		String token = "", newFile = infilename;
		try {
			FileReader fr = new FileReader(newFile);
			BufferedReader inFile = new BufferedReader(fr);
			token = inFile.readLine();
			while (token != null) {
				StringTokenizer tokenizer;
				tokenizer = new StringTokenizer(token, "'/;?*,#_]()[. !-\":");
				while (tokenizer.hasMoreTokens()) {
					token = tokenizer.nextToken();
					token = token.toLowerCase();
					insert(token);
				} // End while.
				token = inFile.readLine();
			} // End while.
			inFile.close();
		} // End try.
		catch (IOException iox) {
			System.out.println("Problem reading " + newFile);
		} // End catch.
	} // End readInFromFile().
// -------------------------------------------------------------

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.leftChild);
			root.displayNode();
//System.out.println(root.sData + " " + root.dData);
			inOrder(root.rightChild);
		} // End if.
	} // End inOrder().
} // End class Tree