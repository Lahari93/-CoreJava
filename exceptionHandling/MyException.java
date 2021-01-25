package exceptionHandling;

public class MyException  extends Exception{
	
	public static void show(int i) throws MyException 
	{
		if(i==10)//5==10=false
		{
		   throw new MyException();	
		}
		System.out.println("value of i in show()--->"+i);
		
	}

}
