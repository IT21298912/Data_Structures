package lab3;

public class Link {
	public String name;
	public double average;
	public Link next;
	
	
	
	public Link(String name,double avg) {
		this.name=name;
		this.average=avg;
		this.next=null;        //null link
		
	}
	
	public void displayDetails() {
		System.out.println("name "+name);
		System.out.println("Average "+average);
	}
	

}
