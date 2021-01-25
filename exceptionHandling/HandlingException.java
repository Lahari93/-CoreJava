package exceptionHandling;


public class HandlingException {

	public static void main(String[] args) {

		System.out.println(1);
		
		try {
			
			MyException.show(10);			
			System.out.println(4 / 0);//ArithmeticException

		} catch (MyException ex) {
			ex.printStackTrace();
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(2);
		System.out.println(3);
		
try {
	       System.out.println(4 / 0);//ArithmeticException
			MyException.show(10);			
			

		} catch (MyException ex) {
			ex.printStackTrace();
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(4);
		System.out.println(5);
		
		
		try {
				MyException.show(5);	
				
			} catch (MyException ex) {
				ex.printStackTrace();
			}
			catch(ArithmeticException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(4);
			System.out.println(5);

		
	}

}
