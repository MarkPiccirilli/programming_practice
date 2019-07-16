import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int x = s.nextInt();

		System.out.println("Enter 2nd number: ");
		int y = s.nextInt();

		System.out.println("What would you like to do?:\n1. add\n2. subtract\n3. multiply\n4. divide");
		
		int choice = s.nextInt();
	
		double answer;

		if(choice == 1) {
			answer = x+y;
		}
		else if(choice == 2) {
			answer = x-y;
		}
		else if(choice == 3) {
			answer = x*y;
		}
		else {
			answer = ((double)x)/y;
		}
				
		System.out.println("Answer: " + answer);

	}
}
