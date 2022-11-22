// Author : Brendan Phelan
// Date : 22/11/2022

package Lab7;

public class Animal {
	   // Variables
	   private String type;
	   private int age;
	   private String gender;
	   
	   // Constructors
	   
	   public Animal() {
		      
		   }
	   
	   public Animal(String type, int age, String gender) {
	      this.type = type;
	      this.age = age;
	      this.gender = gender;
	   }
	   
	   // Getters & Setters
	   public String getType() {
	      return type;
	   }
	   public int getAge() {
	      return age;
	   }
	   public String getGender() {
		      return gender;
		   }
	   
	   public void eat() {
		      System.out.println("Animal is eating");
		   }

	   public void sleep() {
		      System.out.println("Animal is sleeping");
		   }
	   public void makeSound() {
		      System.out.println("A generic animal sound");
		   }   
		   
	   //toString
	   public String toString() {
	      return "Type: " + type + ", " + "Age: " + age + ", " + "Gender: " + gender;
	   }
	   
	   		
	}