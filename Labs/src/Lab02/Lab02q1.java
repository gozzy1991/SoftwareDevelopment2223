package Lab02;

import Lab02.HotelRoom;

// Student Name 	: Brendan Phelan
// Student Id Number: 
// Date 			: 12-10-2022


public class Lab02q1
{ 
	public static void main(String args[]) 
	{ 
		
		
		HotelRoom roomA = new HotelRoom();	
		HotelRoom roomB = new HotelRoom();	

		
		roomA.setroomNumber(200);
		roomA.setroomType("Single");
		
		roomB.setroomNumber(201);
		roomB.setroomType("Double");
		
		System.out.println("Room A has been assigned room number: " + roomA.getroomNumber() + " and is a " + roomA.getroomType() + " room.");
		System.out.println("Room B has been assigned room number: " + roomB.getroomNumber() + " and is a " + roomB.getroomType() + " room.");
		
		
		
		
	} // end main
} 