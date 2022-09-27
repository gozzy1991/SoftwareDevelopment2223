package Lab02;

// Implements a Thermometer class.
//Test.. 
public class HotelRoom
{ // begin Thermometer
	private int roomNumber;
	private String roomType;
							
	
	public HotelRoom()			// constructor method #1
	{
		setroomNumber(0);		
	}
		
	public void setroomNumber(int num)
	{
		roomNumber = num;		
	}

	public double getroomNumber()
	{
		return roomNumber;
	}
	public void setroomType(String type)
	{
		roomType = type;		
	}

	public String getroomType()
	{
		return roomType;
	}
} // end class Thermometer