package Lab02;

import Lab02.HotelRoom;

// Student Name 	: Brendan Phelan
// Student Id Number: 
// Date 			: 29-9-2022
// Purpose 			: Class implementations

public class Lab02q4
{ 
	public static void main(String args[]) 
	{ 
		
		
		HotelRoom roomA = new HotelRoom();	
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 99);

		
		roomA.setroomNumber(200);
		roomA.setroomType("Single");
		roomA.setroomOccupancy(1);       //0 is vacant, 1 is occupied
		roomA.setroomRate(100);
		
		roomB.setroomNumber(201);
		roomB.setroomType("Double");
		
		if (roomB.isOccupied()==false) {
			roomB.setroomOccupancy(1);
		}
		roomB.setroomRate(80);
		
		System.out.println("Room A has been assigned room number: " + roomA.getroomNumber() + " and is a " + roomA.getroomType() + " room." 
				+ " Also the room is occupied. True or False:  "+ roomA.isOccupied() + " and the room has a rate of " + roomA.getroomRate());
		System.out.println("Room B has been assigned room number: " + roomB.getroomNumber() + " and is a " + roomB.getroomType() + " room."
				+ " Also the room is occupied. True or False:  "+ roomB.isOccupied() + " and the room has a rate of " + roomB.getroomRate());
		System.out.println("Room C has been assigned room number: " + roomC.getroomNumber() + " and is a " + roomC.getroomType() + " room."
				+ " Also the room is occupied. True or False: "+ roomC.isOccupied() + " and the room has a rate of " + roomC.getroomRate());
		
		
		
	} 
} 