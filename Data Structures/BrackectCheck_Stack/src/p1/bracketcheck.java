package p1;


public class bracketcheck {

	private String input;
	
	public bracketcheck(String in) {
		input=in;
	}
	
	public void checkB() {
		int size=input.length();
		StackX stackX = new StackX(size);
		
		for(int i=0;i<size;i++) {
			if(input.charAt(i)=='(')
				stackX.push('(');
			else if(input.charAt(i)==')')
				stackX.pop();
		}
		
		
		if(!stackX.isEmpty())
			System.out.println("invalid");
		else {
			System.out.println("valid");
		}
	}


	
}
