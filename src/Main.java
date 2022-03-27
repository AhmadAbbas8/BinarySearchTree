import binary.tree.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		System.err.println("RunApp");
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		// tree.inorder();
		

		tree.inorder();

		System.out.println("\nDelete 20");
		tree.deleteKey(20);
		tree.inorder();

		System.out.println("\nDelete 30");
		tree.deleteKey(30);

		tree.inorder();

		System.out.println("\nDelete 50");
		tree.deleteKey(50);

		tree.inorder();
	}

}
