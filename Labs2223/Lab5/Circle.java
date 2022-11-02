// Author : Brendan Phelan
// Date : 2/11/2022
// Purpose : A test driver program for our Point/Circle inheritance

package Lab5;
public class Circle extends Point 
{  
 protected double radius;
 
 
 public Circle
  (double r, int a, int b)
 {
  super( a, b );
  
  setRadius( r );  
 }
 
 
 public void setRadius( double r ){
	 radius = r; 
	 }
 
 
 public double getRadius() { 
	 return radius; 
	 }
 
 
 
 // convert the Circle to a String
 public String toString()
 {
  return "Center = "  + x 
         + ", " + y  +
         ". Radius = " + radius +".";
 }
}