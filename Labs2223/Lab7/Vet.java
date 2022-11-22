// Author : Brendan Phelan
// Date : 22/11/2022

package Lab7;

public class Vet {
	
	private String name;
	
	public Vet(String name) {
	      this.name = name;
	   }
	
	 public void vaccinate(Animal animal) {
	      System.out.println("\n" + name + " is vaccinating");
	      
	      
	      
	      if (animal instanceof Dog) {
	    	  
	    	  System.out.println("Dog has been vaccinated:  " + animal.toString() );
	      }
	      
	      if (animal instanceof Cat) {
	    	  
	    	  System.out.println("Cat has been vaccinated:  " + animal.toString());
	      }
}   
	 }
