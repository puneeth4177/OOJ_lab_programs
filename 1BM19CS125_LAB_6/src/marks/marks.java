package marks;
import CIE.*;
import see.*;
import java.util.*;


 class marks {
	
	 
  public static void main(String args[]) {
	  int n;
	   Scanner in = new Scanner(System.in); 
		System.out.println("Enter the number of students:\n");
		  n=in.nextInt();
	 
	  Internals[] cie=new Internals[n];
	  externals[] sem=new externals[n];
	  
	  //externals semMarks=new externals();
	  for(int i=0;i<n;i++) {
		  
		  sem[i]=new externals();
		  sem[i].EnterDetails(i+1);
	  
	  
	  
		  cie[i]=new Internals();
		  cie[i].GetDetails();
	  		
                         	       
      
	  }
	  System.out.println("The Marks And Details of Students Registered are:\n");
	  for(int j=0;j<n;j++) {
		  System.out.println("Student " + (j+1));
		  System.out.println("USN: "+sem[j].usn);
		  System.out.println("Name: "+sem[j].name);
		  System.out.println("Semester: "+sem[j].sem);
		  
		  System.out.println("Final Marks :\n");
		  for(int i=0;i<5;i++) {
		  System.out.println("Course " + (i+1) + "\n"+((sem[j].semester[i]/2)+cie[j].internals[i]));
		  }
		  System.out.println();
		 
			 
		  
		 
			
		
		   
		  
		  
	  }
	  
	  
	 
  }
}
