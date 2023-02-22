package DemoOOPS;
abstract class TableSev {       //abstract class is incomplete method in a class
//	abstract void food();
	 Order od=new Order();       //the order to create a new memory on od reference object
	abstract void HomeDelivery();     //the method is currently NotAvailable but future is Available
	  void Drink()
	  {                                       //this method is declaring a method
	    System.out.println("Drink Ready");      
	  }                                         //this method is non abstract method use to abstract class
	  void seating()                           
	  {                                        //println(String x)
	    System.out.println("Seating Ready");     //it invokes print(String) and then println().
	  }                                           //x - The String to be printed.
	  void food()                     //then abstract method to be declaring a method
	  { 
	   od.orders();                   //the orders is different then this method is inherit the child_class
	  }
	}
class Table extends TableSev       //the Table_class inherit TableSev class but TableSevis abstract
{

  void HomeDelivery() {                 //the HomeDelivery is abstract method but inherit child_class to method implementation  
	  System.out.println("sorry NotAvailable..");
   }
  void music() {                            //the extra method in this child_class
	  System.out.println("Available..");
  }
}


class Table2 extends TableSev       //the Table_class inherit TableSev class but TableSevis abstract
{
 void Drink()
  {                                       //this method is declaring a method
   System.out.println("Drink Ready & ice cream");      
  }
  void HomeDelivery() {                 //the HomeDelivery is abstract method but inherit child_class to method implementation  
	  System.out.println("Available..");
   }
 
}

