package see;
import java.util.Scanner;

import CIE.*;
public class externals extends Student {
     public int semester[] =new int[5];
     Scanner in = new Scanner(System.in);
     
            
     public void EnterDetails(int i) {
    	 System.out.println("Student " + i);
    	 System.out.println("Enter the usn of student:\n");
      	  usn=in.nextInt();
      	  System.out.println("Enter the name  of student:\n");
          name=in.next();
      	  System.out.println("Enter the semester of student:\n");
      	  sem=in.nextInt();
   	  System.out.println("Enter marks of SEE : \n ");
   	 
   		  for(int j=0;j<5;j++) {
   			  System.out.println("Enter marks of course  " + (j+1));
   			 
   			  semester[j]=in.nextInt();
   			  
   		  }
   	  	
   	   	  
   	  
     }
}
