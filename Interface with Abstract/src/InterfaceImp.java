// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/31/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish the purpose of an interface rather an abstract class

public class InterfaceImp implements Hobbies, Education, Sports{

	//This is the implementation for the abstract methods in the Interfaces class
	public void sports() {
		System.out.println("This activity would definitely be a part of sports.");
	}
	
	public void education() {
		System.out.println("This activity involves learning and would fall under education.");
	}

	public void hobby() {
		System.out.println("This activity can be seen as a hobby due to the part-time enthusiasts that currently practice it.");
	}

}
