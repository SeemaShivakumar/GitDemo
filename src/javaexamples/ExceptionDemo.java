package javaexamples;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=9;
		int j =0;
		
		try {
			int k = i/j;
			System.out.println("value" +k);
			System.out.println("GIT DEMO");
		}
       catch(ArithmeticException ae) {
			System.out.println("Arithmetic error");
		}

		
		catch(ArrayIndexOutOfBoundsException ai) {
			
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
