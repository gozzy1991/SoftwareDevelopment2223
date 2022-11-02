package CA1;

import java.util.Scanner;

import CA1.Citizen;


public class Citizens {
	
static String maiName ="";

	public static void main(String[] args) {
		Citizen[] citizens = new Citizen[3];
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		
		for(int i = 0; i<3; i++) {

			System.out.println("Please enter the first name for person: " + (i+1));

			String firstName = in.nextLine();

			System.out.println("Please enter the second name for person: " + (i+1));

			String lastName = in.nextLine();

			System.out.println("Please enter the gender of person: " + (i+1));

			String gender = in.nextLine();
			
			System.out.println("Please enter the marital status (M or S) of person: " + (i+1));

			String mStatus = in.nextLine();
			
			if (mStatus == "M" || mStatus== "m" && gender =="F" || gender == "f") {
				
				System.out.println("Please enter the maiden name of person: " + (i+1));

				String maiName = in.nextLine();	
				
			}
			else if (mStatus == "S" || mStatus== "s" || gender =="M" || gender =="m") {
				
				String maiName = "N/A";
			}
			
			

			Citizen a = new Citizen(firstName,lastName,gender,mStatus,maiName);

			
			
			
		
		
	}

}
}
}
