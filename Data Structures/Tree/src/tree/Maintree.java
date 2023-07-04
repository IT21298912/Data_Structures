package tree;

import java.util.Scanner;

public class Maintree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Tree newtrTree = new Tree();
		
		newtrTree.insert(149, "Anusha");
		newtrTree.insert(167, "Kosala");
		newtrTree.insert(047, "Dinusha");
		newtrTree.insert(066, "Mihiri");
		newtrTree.insert(159, "Jayani");
		newtrTree.insert(118, "Nimal");
		newtrTree.insert(195, "Nishantha");
		newtrTree.insert(034, "Avodya");
		newtrTree.insert(105, "Bimali");
		newtrTree.insert(133, "Sampath");
		
		

		
		
		
		newtrTree.TraversinOrder();
		System.out.println("\n");
		newtrTree.TraverspostOrder();
		System.out.println("\n");
		newtrTree.TraverspreOrder();
		
		
		System.out.println("\nenter employee no: ");
		int emp = sc.nextInt();
		
//		newtrTree.find(emp);
		
		
		newtrTree.deleteAll();
		
		
		newtrTree.callRecursive(emp);  //after delete we can check if there any other values (nothing display)
		


	}

}
