package DemoOOPS;
public class Pizza {            //the base class pizza 
	void pizzIsReady() {
		System.out.println("pizza ");   //system is a class
	}
}
class Cheese extends Pizza{      // pizza inherits to the Cheese pizza
	void add() {                    //the pizza class to be extends on multilevel
		System.out.print("Cheese");    //system package is java.lang.System
		super.pizzIsReady();
	}
}
class Greek extends Pizza{          //the common pizza to inherits to Greek
	void add() {
		System.out.print("Greek");     //system is a class & out is a PrintStream object & println is method
		super.pizzIsReady();
	}
}

