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
        try {
            verify.verifyIntRange(value, 1, 100);
            System.out.println("The number is in range.");
        } catch (MyOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
