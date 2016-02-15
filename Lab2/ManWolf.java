/*Charles Harrison
 * Lab2
 * ManWolf
 */
public abstract class ManWolf {
	
	//state definitions
	static final int q0=0;
	static final int q1=1;
	static final int q2=2;
	static final int q3=3;
	static final int q4=4;
	static final int q5=5;
	static final int q6=6;
	static final int q7=7;
	static final int q8=8;
	static final int q9 = 9;
	static final int er=10;
	
	//delta transition stable
	static  final int[][] DELTA= 
		{
		  {er,er,er,q1},//q0
		  {q2,er,er,q0},//q1
		  {q1,q3,q4,er},//q2
		  {er,q2,er,q5},//q3
		  {er,er,q2,q6},//q4
		  {er,er,q7,q3},//q5
		  {er,q7,er,q4},//q6
		  {q8,q6,q5,er},//q7
		  {q7,er,er,q9},//q8
		  {er,er,er,q8},//q9
		  {er,er,er,er}//er
				
				
		};
	
	//initial state is q0
	public static int state=q0;
	
	//abstraction of process method
	public abstract void process(String input);
	
	/*charToIndex
	 * takes a character and
	 * converts it to its
	 * delta index representation
	 * @param c: n, w, c, g, 
	 * @return r: 0, 1,2,3 (-1 if char error)
	 */
	public static int charToIndex(char c){
		int r;
		switch(c){
		  case 'n':
			  r= 0;
			  break;
		  case 'w':
			  r=1;
			  break;
		  case 'c':
			  r=2;
			  break;
		  case 'g':
			  r=3;
			  break;
		  default:
			  r=-1;
		}
		return r;
			
		}
	}
			
		
	
	


