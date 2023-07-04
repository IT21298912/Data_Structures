package p1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StackX stackX = new StackX(5);
//		
//		stackX.push('a');
//		stackX.push('b');
//		stackX.push('c');
//		stackX.push('d');
//		stackX.push('e');
//		
//		
//		while(!stackX.isEmpty()) {
//			char val=stackX.pop();
//			System.out.println("remove"+val);
//		}
		
		bracketcheck bcBracketcheck = new bracketcheck("3 + (( 6 * 2 ) - 3)");
		
		bcBracketcheck.checkB();
	}

}
