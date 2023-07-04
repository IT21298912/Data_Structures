package tree;

public class Node {
	
	public int empno; 
	public String name;
	
	public Node leftChild; 
	public Node rightChild; 
	
	
	public void displayNode( ){
	
		System.out.println("emplyee number :"+empno);
		System.out.println("employee name : "+name);

}
}
