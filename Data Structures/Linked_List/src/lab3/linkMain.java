package lab3;

public class linkMain {
	public static void main(String[] args) {
		
//		Link Nipuna=new Link("Nipuna", 53.0);  //student 1
//		Link Aravinda=new Link("Aravinda", 45.0);  //student 2
//		Link Prashani=new Link("Prashani", 35.0);  //student 3
		
		
//		Nipuna.next = Aravinda;           //connect together nipuna->aravinda->prashani
//		Aravinda.next = Prashani;
//		Prashani.next = null;
		
//		
//		Nipuna.displayDetails();
//		Aravinda.displayDetails();
//		Prashani.displayDetails();
		
//		System.out.println("--------------------------------");
		
//		
//		Nipuna.next.displayDetails();   //2nd
//		Nipuna.next.next.displayDetails();  //3rd
		
		
		Linklist linklist1 = new Linklist();
		
		linklist1.insertFirst("Nipun", 54.0);
		linklist1.insertFirst("Aravinda", 75.0);
		linklist1.insertFirst("Prashani", 44.0);
		
		
		linklist1.displayList();
		
		
		
		while(!linklist1.isEmpty()) {
			
			Link aLink = linklist1.deleteFirst();
			
			System.out.println("deleted");
			
			aLink.displayDetails();
			
		}
		
		
		
		
	}

}
