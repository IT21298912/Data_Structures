package p1;

public class StackX {
	
	private int maxsize;
	private char[] stackArray;
	private int top;
	
	
	
	public StackX(int s) {
		maxsize=s;
		stackArray=new char [maxsize];
		top=-1;
		
		
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return(top==maxsize-1);
	}

	public void push(char j) {
		if(!isFull())
			stackArray[++top]=j;
		else {
			System.out.println("stack is empty");
		}
		
	}
	
	public char pop() {
		if(!isEmpty())
			return (stackArray[top--]);
		else {
			System.out.println("stack empty");
		}
		return 0;
	}
	
	public char peek() {
		if(!isEmpty())
			return stackArray[top];
		return 0;
	}
	
	
}
