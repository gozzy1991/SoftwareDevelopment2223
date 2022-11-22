// Author : Brendan Phelan
// Date : 22/11/2022

package Lab7;

public class Dog extends Animal {
	
	public Dog(String type, int age, String gender) {
	      super(type,age,gender);
	   }
	
	 public void makeSound() {
	      System.out.println("woof woof");
	   }  
	 
	 public void wagtail (){
		 System.out.println("Tail is wagging");
		 }
	 
}
