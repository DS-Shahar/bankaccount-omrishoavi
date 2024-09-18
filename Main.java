package cyber;
import java.util.*;
public class Main {

	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please enter length of the rectangle: ");
		int length = reader.nextInt();
		System.out.println("Please enter width of the rectangle: ");
		int width = reader.nextInt();
		Rectangle r1 = new Rectangle(length,width);
		
		System.out.println("Please enter length of the 2nd rectangle: ");
		length = reader.nextInt();
		System.out.println("Please enter width of the 2nd rectangle: ");
		width = reader.nextInt();
		Rectangle r2 = new Rectangle(length,width);
		
		System.out.println();
		System.out.println(r1.toString());
		System.out.println();
		System.out.println(r2.toString());
		System.out.println();
		
		
		r1.draw();
		r2.draw();
		r1.scale(2);
		r1.draw();
		
		System.out.println("Sum of perimeters: " + (r1.calcPerimeter()+r2.calcPerimeter()));
		System.out.println("Sum of areas: " + (r1.calcArea()+r2.calcArea()));
		
		System.out.println(" ");
		
		BankAccount acct1 = new BankAccount(1000, -1000, "Bob");
        BankAccount acct2 = new BankAccount(1000, -1000, "Lisa");
        System.out.println(acct1.balanceToString());
        System.out.println(acct2.balanceToString());
        System.out.println(acct1.transfer(acct2, 500));
        System.out.println(acct1.balanceToString());
        System.out.println(acct2.balanceToString());
        System.out.println(acct1.transfer(acct2, 1600));
        System.out.println(acct1.balanceToString());
        System.out.println(acct2.balanceToString());
	}

}
