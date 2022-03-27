/**
 * 
 */
package binary.tree;

/**
 * @author ahmad
 *
 */
public class BinarySearchTree {
	Node root;

	// Constructor
	public BinarySearchTree() {
		root = null;
	}

	BinarySearchTree(int value) {
		root = new Node(value);
	}

	// This method mainly calls insertRec()
	public void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	// This method mainly calls InorderRec()
	public void inorder() {
		inorderRec(root);
	}

	//Lift-Root-Right
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}

	}
	// This method mainly calls deleteRec()
	public void deleteKey(int key) { root = deleteRec(root, key); }
	Node deleteRec(Node root, int key)
    {
        //  If the tree is empty 
        if (root == null)
            return root;
 
        //* Otherwise, recur down the tree 
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
 
       
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            
            root.key = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
 
        return root;
    }
	 int minValue(Node root)
	    {
	        int minv = root.key;
	        while (root.left != null)
	        {
	            minv = root.left.key;
	            root = root.left;
	        }
	        return minv;
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}