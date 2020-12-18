package CIE;
import java.util.*;

public class Internals {
  public int internals[]=new int[5];
  Scanner input = new Scanner(System.in);
  public void GetDetails() {
	  System.out.println("Enter marks of CIE : \n ");
	
		  for(int j=1;j<=5;j++) {
			  System.out.println("Enter marks of course : " + j);
			  internals[j-1]=input.nextInt();
			  
		  }
		  
	  
	  
	  
	  
  }
  
}
