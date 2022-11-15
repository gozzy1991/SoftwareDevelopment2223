// Author : Brendan Phelan
// Date : 14/11/2022

package Lab6;

public class Person {
	   // Variables
	   private String name;
	   private String address;
	   
	   // Constructors
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters & Setters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   //toString
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	}
