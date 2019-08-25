package Tree;

//Start of TreeApp class.
import java.io.*;
//import Tree.Node;

class TreeApp {
	public static void main(String[] args) throws IOException {
		String value = "";
		int test;
		Tree theTree = new Tree();
		BufferedReader stdin;
		stdin = new BufferedReader(new InputStreamReader(System.in));
		String inputFile = "";
		System.out.print("Enter input filename: ");
		System.out.flush();
		inputFile = stdin.readLine();
		theTree.readInFromFile(inputFile);
		theTree.traverse();
	} // End main()
} // End TreeApp.