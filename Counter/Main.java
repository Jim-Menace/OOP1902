import local.util.Menu;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		String[] choices = {"Up","Down","Set Base","Exit"};
		Menu m = new Menu(choices);
		Scanner s = new Scanner(System.in);
		Counter c = new Counter();
		int action = 0;
		c.setBase(2);
		m.setPrompt("Enter action >");
		
		while(true) {
			System.out.println("Counter: " + c.getCount());
			System.out.println("   Base: " + c.getBase());
			//System.out.println();
			//System.out.println("1. Up");
			//System.out.println("2. Down");
			//System.out.println("3. Set Base");
			//System.out.println("4. Exit");
			//System.out.println();
			//System.out.print("Enter action >");
			System.out.print(m);
			
			action = s.nextInt();
			
			if (action == 1) {
				c.up();
			}else if (action == 2) {
				c.down();
			}else if (action == 3) {
				System.out.print("Enter new value for base >");
				c.setBase(s.nextInt());
			}else {
				break;
			} 
		}
	}	
}
