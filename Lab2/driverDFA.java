
/*Charles Harrison
 * Lab2
 * driverDFA
 */
public class driverDFA extends ManWolf {
	
	/*process
	 * (non-Javadoc)
	 * @see ManWolf#process(java.lang.String)
	 * takes in an input string
	 * and determines whether
	 * it is a solution
	 * @param input: sting of characters
	 * 
	 */
	
	public   void process(String input){
		System.out.println(">java driverDFA "+input);
		for(int i=0; i<input.length();i++){
		  char c=input.charAt(i);
		  int choice=charToIndex(c);
		 
		  //catch for invalid input
		  try{
		    state=DELTA[state][choice];
			}
		  catch(ArrayIndexOutOfBoundsException ex){
		    System.out.println("invalid input ["+c+"]");
			return;
			}
			
		}
		//String is solution
		if(state==q9){
		  System.out.println("That is a solution");
		  return;
		}
		//String is not a solution
		else{
		  System.out.println("That is not a solution.");
		  return;
		}
	}

	public static void main(String[] args) {
		String s="gncgwng";
		String n="gncwgng";
		driverDFA driver=new driverDFA();
		driver.process(s);
		driver.process(n);
		

	}

}
