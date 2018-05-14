/**
 * 
 */
import java.util.Scanner; 
/**
 * @author hadrian
 * @date 14/04/2018
 * @student-number 500194233 
 */
public class JavaBasicCalc {

	/**
	 * @param args
	 */
	//TODO function definitions 
	public static float add (float a, float b)
	{
		float sum; 
		sum = a + b; 
		return sum; 
	}
	public static float sub (float a, float b)
	{
		float sub; 
		sub = a - b; 
		return sub; 
	}
	public static float prod (float a, float b)
	{
		float p;
		p = a * b; 
		return p; 
	}
	public static float quot (float a, float b)
	{
		float q; 
		q = a / b; 
		return q; 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float a, b; 
		float sumR, diffR, quotR, prodR; 
		char choice; 
		
		// TODO get user input 
		
		Scanner in = new Scanner (System.in); 
		Scanner choices = new Scanner (System.in);
		System.out.print("\na = ");
		a = in.nextFloat(); 
		System.out.print("\nb = ");
		b = in.nextFloat (); 
		
		//TODO select choices 
	
		System.out.print("Select your operation : + , - , * or /\n\n");
		choice = choices.next(".").charAt(0); 
		while (choice == '+' || choice == '-' || choice == '*' || choice == '/')
		{
			switch (choice)
			{
			case '+': 
			 {
				 sumR = add (a, b); 
				 System.out.print("\nSum = " + sumR);
			 }
			case '-': 
			{
				diffR = sub (a, b); 
				System.out.print("\nDifference = " + diffR);
			}
			case '*': 
			{
				prodR = prod (a, b); 
				System.out.print("\nProduct = " + prodR);
			}
			case '/': 
			{
				quotR = quot (a, b); 
				System.out.print("\nQuotient = " + quotR);
			}
			default: 
			{
				System.out.print("\nInvalid sign. Plese select a valid sign.");				
			}	
		}
		in.close(); 
		choices.close(); 
		} 
	}
}
