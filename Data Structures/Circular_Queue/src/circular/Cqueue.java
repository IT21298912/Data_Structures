package circular;

public class Cqueue {



	private int maxsize;
	private int front;
	private int rear;
	private int queuArray[];
	private int nItems;
	
	
	public Cqueue(int s){
		maxsize=s;
		front=0;
		rear=0;
		queuArray=new int [maxsize];
		nItems=0;
		
	}
	
	public void insert(int j) {
		if(nItems==maxsize)
			System.out.println("queue is full");
		
		else {
			if(rear==maxsize-1)
				rear=1;
			queuArray[++rear]=j;
			nItems++;
		}
	}
	
	public int remove()
	{
		if(nItems==0) {
			System.out.println("queue is empty");
			 return -99;}
		else {
			int temp= queuArray[front++];
			
			if(front==maxsize){
				front=0;
				
				nItems--;
				return temp;
				
			}
		}
		
		return 0;
	}

	
	

}
