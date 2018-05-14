/**
 * 
 */
import java.util.Scanner; 
/**
 * @author hadrian
 * @date 14/04/2018
 * @student-number 500194233 
 */
public class JavaMath extends JavaIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c; 
		
		//TODO get the user to input values for a, b and c; 
		
		System.out.print("\nEnter values for a, b and c : \n\n");
		Scanner varInput = new Scanner (System.in);
		
		a = varInput.nextInt (); 
		b = varInput.nextInt (); 
		c = varInput.nextInt (); 
		
		//TODO calculate the sum 
		
		int sum; 
		
		sum = a + b + c; 
		
		//TODO print out the sum of the integer variables 
		
		System.out.print("\n\nSum of a, b and c is : " + sum + "\n\n");
				
		varInput.close(); 		
	}

}
