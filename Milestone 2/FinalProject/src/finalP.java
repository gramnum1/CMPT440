

public class finalP extends  language {
	
	
	/*process
	 * takes raw input and converts it into 
	 * html with color coding
	 * @param String input
	 * @return String buff
	 */
	public  String process(String input){
		state=0;
		int start=0;
		int dist=0;
		StringBuffer buff=new StringBuffer(input);
		System.out.println(">java driverDFA "+input);
		for(int i=0; i<input.length();i++){
		  dist++;
		  char c=input.charAt(i);
		  int choice=charToIndex(c);
		  switch(state){
		  //Print
		  case 13: 
			  buff.insert(start, "<span style=\"color: blue;\">").toString();
			  buff.insert(dist+27, "</span>").toString();
			  dist+=27+7;  
			  start=dist;
			  break;
		  //Assignment Statement
		  case 19: 
			  buff.insert(start, "<span style=\"color: gold;\">").toString();
			  buff.insert(dist+27, "</span>").toString();
			  dist+=27+7;  
			  start=dist;
			  break;
		  //Assignment Statement
		  case 24:
			  buff.insert(start, "<span style=\"color: gold;\">").toString();
			  buff.insert(dist+27, "</span>").toString();
			  dist+=27+7;  
			  start=dist;
			  break;
		  //Variable Declaration	  
		  case 32: 
			  buff.insert(start, "<span style=\"color: brown;\">").toString();
			  buff.insert(dist+28, "</span>").toString();
			  dist+=28+7;
			  start=dist;
			  break;
		  //Comment
		  case 37: 
			  buff.insert(start, "<span style=\"color: green;\">").toString();
			  buff.insert(dist+28, "</span>").toString();
			  dist+=28+7;
			  start=dist;
			  break;
		  }
		  
		 
		  //catch for invalid input
		  try{
		    state=DELTA[state][choice];
			}
		  catch(ArrayIndexOutOfBoundsException ex){
		    
			    buff.insert(start, "<span style=\"color: red;\">").toString();
				buff.insert(dist+26, "</span>").toString();
				dist+=26+7;
				start=dist;
			    return buff.toString();
			}
			
		}
		//String is solution
		if(state==q13||state==q19||state==q24||state==q32||state==q37){
			 switch(state){
			 //print 
			 case 13: 
				  buff.insert(start, "<span style=\"color: blue;\">").toString();
				  buff.insert(dist+27, "</span>").toString();
				  break;
			  //assignment statement
			  case 19: 
				  buff.insert(start, "<span style=\"color: gold;\">").toString();
				  buff.insert(dist+27, "</span>").toString();
				  dist+=27+7;  
				  start=dist;
				  break;
			  //assignment statement
			  case 24:
				  buff.insert(start, "<span style=\"color: gold;\">").toString();
				  buff.insert(dist+27, "</span>").toString();
				  dist+=27+7;  
				  start=dist;
				  break;
			  //var dec
			  case 32: 
				  buff.insert(start, "<span style=\"color: brown;\">").toString();
				  buff.insert(dist+28, "</span>").toString();
				  dist+=28+7;
				  start=dist;
				  break;
			  //comment
			  case 37: 
				  buff.insert(start, "<span style=\"color: green;\">").toString();
				  buff.insert(dist+28, "</span>").toString();
				  dist+=28+7;
				  start=dist;
				  break;
			  }
		  System.out.println("That is a solution");
		  return buff.toString();
		}
		//String is not a solution
		else{
			if(state==err){
				buff.insert(start, "<span style=\"color: red;\">").toString();
				buff.insert(dist+26, "</span>").toString();
				dist+=26+7;
				start=dist;
				
			}
		  System.out.println("That is not a solution. q"+state);
		  return buff.toString();
		}
	}
	
	

	

}
