package interface_exceptionhandling;
 class Father extends Exception {
	 private int Fage;
	Father(){}
	Father(int a) {
    Fage=a;
    
	}
	
	public String toString() {
		return "Father Age cannot be negative....";
	   }
  
  	
}


class Son extends Father{
	int sage;
	int fage;
	
	Son(int s,int f){
	  sage=s;
	  fage=f;
	  				
	}
	public String toString() {
		return "Father Age cannot be less  than or equal son Age....";
	   }

}

 class exception {
	  static  void AgeCompare(int fage,int sage) throws Son   {
	     	
	 		if(fage<=sage) 
	 		 throw new Son(sage,fage);	
	 		
	 	
	 }
	 static void NegativeAgeCheck(int age) throws Father   {
	     	
	 		if(age<0) 
	 		 throw new Father(age);	
	 		
	 	
	 }

	
public static void main(String args[]) {

	try {
		NegativeAgeCheck(-30);
		
		
	}catch(Father e){
		System.out.println(e);
	}
	try{AgeCompare(16,26);}catch(Son e){
		System.out.println(e);
	} 
	
	
}
}