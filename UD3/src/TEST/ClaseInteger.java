package TEST;


public class ClaseInteger {
	public static void main (String[]args){
		//Creaci�n del objetto Integer usando el segundo constructor mismo test
		@SuppressWarnings("deprecation")
		Integer num1=new Integer("125");
	        
	        //Creaci�n de un objeto Integer usando el primer constructor
	        @SuppressWarnings("deprecation")
			Integer num2=new Integer(20);
	       
	        //Obtenci�n del entero que almacena cada objeto Integer
	        //Si no se hace esto, las lineas siguientes causar�an error
	        //de compilacion
	        int n1=num1.intValue();
	        int n2=num2.intValue();
	        System.out.println(" Suma de " +n1+ " y "+n2+ " vale "+(n1+n2));
	        if(n1+n2>130)
	         n1++;
	         else 
	         n1--;
		System.out.println(n1);}
	}