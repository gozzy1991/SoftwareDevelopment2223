package Lab02;


 
public class HotelRoom
{ 
	private int roomNumber;
	private String roomType;
	private int occupied;
	private String free = "";
	private double rate = 0;
	private boolean occupy;
							
	
	public HotelRoom()			
	{
		setroomNumber(0);		
	}
	
	public HotelRoom(int roomNumber, String roomType, int occupied, double rate)			
	{
		setroomNumber(roomNumber);
		setroomType(roomType);
		setroomOccupancy(occupied);
		setroomRate(rate);
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
	
	public boolean isOccupied() {

	    if (occupied == 0) {
		occupy = false;
		}
	    else if (occupied ==1) {
	    	
	    occupy = true;
	    }
		return occupy;
		
		}
	
	
	
	
	public void setroomOccupancy(int taken)
	{
		occupied = taken;		
	}

	
	public String getroomOccupancy()
	{
		if (occupied == 0) {
			free = "Vacant";
		}
		
	
		else if (occupied ==1) {
			free ="Occupied";
		}
		return free;
	}
	
	
	
	public void setroomRate(double price)
	{
		rate = price;		
	}

	public double getroomRate()
	{
		return rate;
	}
}
 // end class Thermometer