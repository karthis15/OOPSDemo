package DemoOOPS;
import java.util.Scanner;
public class Rest {
	public static void main(String[] args) {
		System.out.println("welcome to ResHoall");
		System.out.println("Do you booking Table?Y/n");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a.equals("y")||a.equals("yes")?"Thank you for Booking":"one Table is available");
		TableSev ts=new Table();
		ts.seating();
		ts.Drink();
		ts.food();
		System.out.println("do you want HomeDelivery?y/n");
		a=sc.next();
		if(a.equals("yes")||a.equals("y")) {
			ts.HomeDelivery();
		}
		System.out.println("thank you for coming");	
	}
}
