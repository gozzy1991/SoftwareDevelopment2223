package Lab02;

import Lab02.HotelRoom;

// Student Name 	: Brendan Phelan
// Student Id Number: 
// Date 			: 29-9-2022
// Purpose 			: Class implementations

public class Lab02q3
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
		roomB.setroomOccupancy(0);
		roomB.setroomRate(80);
		
		System.out.println("Room A has been assigned room number: " + roomA.getroomNumber() + " and is a " + roomA.getroomType() + " room." 
				+ " Also the room is " + roomA.getroomOccupancy() + " and has a rate of " + roomA.getroomRate());
		System.out.println("Room B has been assigned room number: " + roomB.getroomNumber() + " and is a " + roomB.getroomType() + " room."
				+ " Also the room is " + roomB.getroomOccupancy() + " and has a rate of " + roomB.getroomRate());
		System.out.println("Room C has been assigned room number: " + roomC.getroomNumber() + " and is a " + roomC.getroomType() + " room."
				+ " Also the room is " + roomC.getroomOccupancy() + " and has a rate of " + roomC.getroomRate());
		
		
		
	} 
} 