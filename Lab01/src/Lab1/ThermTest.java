package Lab1;

// Student Name 	: Brendan Phelan
// Student Id Number: 
// Date 			: 27-9-2022
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();		// Create another instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
	} // end main
} // end class ThermTest