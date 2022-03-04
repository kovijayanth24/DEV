package Jayanth;
class exceptionhandlers extends Exception{
   String str1;
   exceptionhandlers(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("exceptionhandlers Occurred: "+str1) ;
   }
}
class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new exceptionhandlers("This is My error Message");
	}
	catch(exceptionhandlers exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}
