// Author : Brendan Phelan
// Date : 2/11/2022
// Purpose : A test driver program for our Point/Circle inheritance

package Lab5;


	public class Point 
	{
	 
	 protected int x;
	 protected int y; 
	 
	 
	 
	 
	 public Point( int a, int b ) { 
		 setPoint( a, b ); }
	 
	 
	 public void setPoint(int a, int b)
	 {
	  x = a;
	  y = b;
	 }
	 
	 
	 public int getX() { 
		 return x; 
		 }  
	 
	 
	 public int getY() { 
		 return y; 
		 }
	 
	 
	 public String toString()
	  {return "[" + x + ", " + y + "]";}
	}
