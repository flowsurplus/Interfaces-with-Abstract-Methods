// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/31/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish the purpose of an interface rather an abstract class

public class InterfaceTest {

	public static void main(String[] args) {
		//This is the start of a series of tests that would involve using the interfaces and implementations
		Hobbies woodworking = new InterfaceImp();
		Education ewoodworking = new InterfaceImp();
		System.out.println("Woodworking is a fantastic activity that manipulates mainly wood to create different objects");
		//This is where the output is generated from the implementation of the interfaces
		woodworking.hobby();
		ewoodworking.education();
		System.out.println("\n");
		
		Sports soccer = new InterfaceImp();
		System.out.println("Soccer is a great sport that involves the usage of a ball and mainly kicking it into goals.");
		soccer.sports();
		System.out.println("\n");
	
		Education programming = new InterfaceImp();
		Hobbies hprogramming = new InterfaceImp();
		System.out.println("Programming is a great activity that takes mental acumen and manipulating/learning new syntaxes to solve problems");
		programming.education();
		hprogramming.hobby();
		System.out.println("\n");
		
		Hobbies knitting = new InterfaceImp();
		System.out.println("Knitting is a specific textile work that typically uses textile string and a needle.");
		knitting.hobby();
		System.out.println("\n");
		
		Hobbies fishing = new InterfaceImp();
		Sports sfishing = new InterfaceImp();
		System.out.println("Fishing is an activity that revolves around attracting fish for either consumption, sport, or entertainment.");
		fishing.hobby();
		sfishing.sports();
	}

}
