package tree;

class Tree {
	private Node root; // first node of tree

	public Tree() {
		root = null;
	}

	public void insert(int emp, String name) {

		Node newNode = new Node();
		newNode.empno = emp;
		newNode.name = name;

		if (root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;

			while (true) {

				parent = current;

				if (emp < current.empno) {   //if less
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {                          //if greater 
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;

					}

				}
			}

		}
	}

//	public boolean delete(int emp) {
//
//	}

	public Node find(int emp) {

		Node current = root;

		while (current.empno != emp) {

			if (emp < current.empno)
				current = current.leftChild;

			else
				current = current.rightChild;

			if (current == null)
				return null;
		}

		System.out.println("EMployee Name :" + current.name);
		return current;
	}

	public void inOrder(Node localRoot) { //left,root,right
		if (localRoot != null) {
			inOrder(localRoot.leftChild);  //left subtree
			localRoot.displayNode();         //visit the node
			inOrder(localRoot.rightChild);   //right subtree
		}
	}

	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);        //left subtree
			postOrder(localRoot.rightChild);       //right subtree
			localRoot.displayNode();               //visit the node
		}
	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			localRoot.displayNode(); //visit node
			preOrder(localRoot.leftChild);   //left subtree
			preOrder(localRoot.rightChild);   //right subtree
		}
	}
	
	public void TraversinOrder() {
		inOrder(root);
	}
	
	public void TraverspreOrder() {
		preOrder(root);
	}
	
	public void TraverspostOrder() {
		postOrder(root);
	}
	
	public Node findRecursive(Node localroot,int emp) {
		if(localroot==null) {
			return null;
			
		}
		else if(localroot.empno==emp)
		{
			System.out.println(localroot.name);
			return localroot;
		}
		else if(emp<localroot.empno) {
			return findRecursive(localroot.leftChild, emp);
		}
		
		else {
			return findRecursive(localroot.rightChild, emp);
		}
		
		
		
	}
	
	public Node callRecursive(int emp) {
		return findRecursive(root, emp);
	}
	
	
	public void deleteAll( ) {
		
		root=null;
		
		
	}
	


}
