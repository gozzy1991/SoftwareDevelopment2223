// Author : Brendan Phelan
// Date : 13/2/2023

package Lab15;
import java.util.Scanner;

public class Driver {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please enter a number between 1 and 100: ");
        int value = input.nextInt();

        Verifier verify = new Verifier();
        
        try 
        {
            verify.verifyIntRange(value, 1, 100);
            System.out.println("The number is in range!!!");
        } 
        catch (MyOutOfRangeException a) 
        {
            System.out.println(a.getMessage());
        }
        
        input.nextLine();
        
        System.out.println("Please enter a password: ");
        String password = input.nextLine();
        
        try 
        {
            verify.verifyPasswordStrength(password);
            System.out.println("Password accepted!");
        } 
        catch (MyInvalidPasswordException a) 
        {
            System.out.println(a.getMessage());
        }
    }
    
    
}
