package Lab7;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, "Male");
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, "Female");
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		

		}
}