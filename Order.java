package DemoOOPS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Order {
	void orders() {
	Pizza pi =new Pizza();             //the pizza is parent_class object reference & child_class memory
	Cheese ch=new Cheese();                //to accessing the parent_class method only 
	Greek ne=new Greek();                    //the parent_class method is current possession on overriding a method
	Soupmaker no=new NonVegSoup();
	Soupmaker ve=new VegSoup();
	int id;
	ArrayList<OrderItem> obj=new ArrayList<>();
	String ids;                    //String class represents character strings
	do {                        //do-while condition loop first do next condition check on 
	System.out.println("Today special menu For :\n1.Soup\n2.biriyani\n3.Pizza");
	Scanner sc =new Scanner(System.in);       //scanner is a class but contractor Not create then System(class).in(method) to be pass
	id=sc.nextInt();                        //Scans the next token of the input as an int. 
	String a;
	if(id==1) {
		System.out.println("vegSoup or NonVegSoup?");
		a=sc.next();                        //String java.util.Scanner.next()
		if(a.equals("veg")|| a.equals("vegsoup")) {
			
			 ve.readymade();       //the amount of food in veg
			obj.add(new OrderItem("vegSoup",30));
		}
		else {				
			no.readymade();
			obj.add(new OrderItem("NonVegSoup",50));		}
	}
	if(id==2) {
		System.out.println("sorry Biriyani is NotAvailable..");   //System class contains several useful class fieldsand methods
	}
	if(id==3) {                                    //the id to check on available food
		System.out.println("1.)pizza\n2.)Cheese_pizza\n3.)Greek_pizza");
		int it=sc.nextInt();
		if(it==1) {
			pi.pizzIsReady();           //the parent class to be extend child class but same method name to override method
			obj.add(new OrderItem("Pizza",90));
		}
		else if(it==2) {               //the object create parent method but to call override the method in current possession to call
			ch.add();
			obj.add(new OrderItem("Cheese_pizza",120));
		}
		else {
			ne.add();                                    //the same method to runtime call on dynamic binding
			obj.add(new OrderItem("Greek_pizza",150));
		}
	}
	System.out.println("do you continue your Order?y or n");
	ids=sc.next();
	}while(ids.equals("y")||ids.equals("yes"));        //while loop to check the condition
	bills(obj);
	}
	
	public void bills(ArrayList<OrderItem> obj) {
		int to=0;
	for (OrderItem orderItem : obj) {
		to+=orderItem.getPrice();
		System.out.println(orderItem.getItemName()+"  Rs:"+orderItem.getPrice());
	}
	System.out.println("Total Amount Rs:"+to);
	}
	
}
