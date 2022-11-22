// Author : Brendan Phelan
// Date : 22/11/2022

package Lab7;

public class Cat extends Animal {
	
	public Cat(String type, int age, String gender) {
	      super(type,age,gender);
	   }
	
	 public void makeSound() {
	      System.out.println("prrrrrrrrrr");
	   } 
	 public void beEvil (){
		 System.out.println("The cat is now evil");
		 }
}
