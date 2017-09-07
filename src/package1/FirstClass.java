package package1;
import java.util.Scanner;

public class FirstClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		System.out.println("Entered Value is: ");
		System.out.print(inp);
		
		Scanner scanString = new Scanner(System.in);
		String s = scanString.nextLine();
		System.out.println("Entered String: ");
		System.out.print(s);
	}

}
