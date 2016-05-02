

public abstract class language  {
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
	static final int q10=10;
	static final int q11=11;
	static final int q12=12;
	static final int q13=13;
	static final int q14=14;
	static final int q15=15;
	static final int q16=16;
	static final int q17=17;
	static final int q18=18;
	static final int q19=19;
	static final int q20=20;
	static final int q21=21;
	static final int q22=22;
	static final int q23=23;
	static final int q24=24;
	static final int q25=25;
	static final int q26=26;
	static final int q27=27;
	static final int q28=28;
	static final int q29=29;
	static final int q30=30;
	static final int q31=31;
	static final int q32=32;
	static final int q33=33;
	static final int q34=34;
	static final int q35=35;
	static final int q36=36;
	static final int q37=37;
	static final int q38=38;
	static final int q39=39;
	static final int err=40;
	
	static final int [][] DELTA =
		{
		{q15,   q1,     q28,    q0,     err,	err,    err,    err,    err,    err,    q33,    q15,    q15,    q15,    q15,    q15,    err}, //q0
		{err,   err,    err,    q16,	err,    err,    err,    err,    err,    err,    err,    q2,     err,	err,    err,    err,    err}, //q1
		{err,   err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q3,	    err,	err,	err,	err}, //q2
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q4,	    err,	err,	err}, //q3
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q5,	    err,	err}, //q4
		{err,	err,	err,	q6,	    err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q5
		{err,	err,	err,	err,	err,	err,	err,	q7,	    err,	err,	err,	err,	err,	err,	err,	err,	err}, //q6
		{err,	err,	err,	q8,	    err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,     q8}, //q7
		{q14,	q14,	q14,	err,	q20,	err,	err,	err,	err,	err,	err,	q14,	q14,	q14,	q14,	q14,	q9},  //q8
		{q10,	q10,	q10,	q10,	err,	err,	err,	err,	err,	err,	err,	q10,	q10,	q10,	q10,	q10,	err}, //q9
		{q10,	q10,	q10,	q10,	err,	err,	err,	err,	err,	err,	err,	q10,	q10,	q10,	q10,	q10,	q11}, //q10
		{err,	err,	err,	q12,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q11
		{err,	err,	err,	err,	err,	err,	err,	err,	q13,	err,	err,	err,	err,	err,	err,	err,	err}, //q12
		{err,	err,	err,	q0,	    err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q13
		{err,	err,	err,	q12,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q14
		{err,	err,	err,	q16,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q15
		{err,	err,	err,	err,	err,	err,	q17,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q16
		{err,	err,	err,	q18,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q17
		{q19,	q19,	q19,	err,	q24,	err,	err,	err,	err,	err,	err,	q19,	q19,	q19,	q19,	q19,	q38}, //q18
		{err,	err,	err,	q0,	    err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q38}, //q19
		{err,	err,	err,	q21,	q20,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q20
		{err,	err,	err,	err,	err,	q22,	err,	err,	q13,	err,	err,	err,	err,	err,	err,	err,	err}, //q21
		{err,	err,	err,	q23,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q22
		{q14,	q14,	q14,	err,	q20,	err,	err,	err,	err,	err,	err,	q14,	q14,	q14,	q14,	q14,	err}, //q23
		{err,	err,	err,	q25,	q24,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q24
		{q15,	q1,	    q28,	err,	err,	q26,	err,	err,	err,	err,	q33,	q15,	q15,	q15,	q15,	q15,	err}, //q25
		{err,	err,	err,	q27,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q26
		{q19,	q19,	q19,	err,	q24,	err,	err,	err,	err,	err,	err,	q19,	q19,	q19,	q19,	q19,	err}, //q27
		{err,	err,	err,	q16,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q29,	err}, //q28
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q30,	err,	err,	err,	err,	err}, //q29
		{err,	err,	err,	q31,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q30
		{q32,	q32,	q32,	err,	err,	err,	err,	err,	err,	err,	err,	q32,	q32,	q32,	q32,	q32,	err}, //q31
		{err,	err,	err,	q0, 	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q32
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	q34,	err,	err,	err,	err,	err,	err,	err}, //q33
		{q35,	q35,	q35,	q35,	err,	err,	err,	err,	err,	err,	err,	q35,	q35,	q35,	q35,	q35,	err}, //q34
		{q35,	q35,	q35,	q35,	err,	err,	err,	err,	err,	q36,	err,	q35,	q35,	q35,	q35,	q35,	err}, //q35
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	q37,	err,	err,	err,	err,	err,	err}, //q36
		{err,	err,	err,	q0, 	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}, //q37
		{q39,	q39,	q39,	q39,	err,	err,	err,	err,	err,	err,	err,	q39,	q39,	q39,	q39,	q39,	err}, //q38
		{q39,	q39,	q39,	q39,	err,	err,	err,	err,	err,	err,	err,	q39,	q39,	q39,	q39,	q39,	q19}, //q39
		{err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err,	err}  //err
		};

    public static int state =q0;
    public abstract String process(String input);
    /*charToIndex
     * takes a char and returns an index
     * @param char c
     * @return int r
     */
    public static int charToIndex(char c){
	    int r;
	      switch(c){
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'o':
			case 'q':
			case 's':
			case 'u':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				r=0;
				break;
			case 'p':
				r=1;
				break;
			case 'v':
				r=2;
				break;
			case ' ':
				r=3;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				r=4;
				break;
			case '+':
				r=5;
				break;
			case '=':
				r=6;
				break;
			case '(':
				r=7;
				break;
			case ')':
				r=8;
				break;
			case '-': 
				r=9;
				break;
			case '*':
				r=10;
				break;
			case 'r':
				r=11;
				break;
			case 'i':
				r=12;
				break;
			case 'n':
				r=13;
				break;
			case 't':
				r=14;
				break;
			case 'a':
				r=15;
				break;
			case '"':
				r=16;
				break;
			 default:
				  r=-1;
			}
	return r;
		
		
		
	}




		
	
	

}
