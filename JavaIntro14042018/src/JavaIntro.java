/**
 * 
 */
import java.util.Scanner; 
//import java.util.stream.Stream;
/**
 * @author hadrian
 * 14/04/2018
 * Ryerson University 
 */
public class JavaIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\nHello! How are you? What is your name? \n\n");
		
		//get the user name from the user 
		Scanner input = new Scanner (System.in); 
		String name; 
		name = input.nextLine();  
		System.out.print("\nYour name is : " + name);		
		input.close(); 
	}
}
