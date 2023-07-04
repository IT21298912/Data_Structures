package lab2;

import java.util.Scanner;

public class main4Q {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		QueueX qX = new QueueX(5);
		
//		qX.insert(5);
//		qX.insert(7);
//		qX.insert(3);
//		qX.insert(1);
//		qX.insert(9);
//		
//		
//		while(!qX.isEmpty()) {
//			
//			int val = qX.remove();
//			System.out.println(val);
//			System.out.println(" ");
//			
//		}
		
		QueueX printQueue = new QueueX(5);
		
		QueueX  evenQueue = new QueueX(5);
		QueueX  oddQueue = new QueueX(5);
		
		for(int i=0;i<5;i++) {
			
			
			System.out.println("Enter transaction ID  "+i+1);
			
			int tc1= scanner.nextInt();
			printQueue.insert(tc1);
			

		
		
//				if(tc1%2==0) {
//					
//					evenQueue.insert(tc1);
//					System.out.println("\n");
//					System.out.println("ID "+tc1+" is sent to PC1 ");
//					
//				}
//				
//				else {
//					oddQueue.insert(tc1);
//					System.out.println("\n");
//					System.out.println("ID "+tc1+" is sent to PC2 ");
//				}
			
			
			
			
		}
		
		
		while(!printQueue.isEmpty()) {
			
			int val2 = printQueue.remove();
//			System.out.println(val2);
//			System.out.println(" ");
			
			
			if(val2%2==0) {
				
				evenQueue.insert(val2);
				System.out.println("\n");
				System.out.println("ID "+val2+" is sent to PC1 ");
				
			}
			
			else {
				oddQueue.insert(val2);
				System.out.println("\n");
				System.out.println("ID "+val2+" is sent to PC2 ");
			}
			
		}
		

		while(!evenQueue.isEmpty()) {
			
			int val3 = evenQueue.remove();
			System.out.println("print even -"+val3);
			System.out.println(" ");
			
		}
		
		
		
		
		while(!oddQueue.isEmpty()) {
			
			int val4 = oddQueue.remove();
			System.out.println("print odd -"+val4);
			System.out.println(" ");
			
		}

		
		
		
		
		
	
	}

}
