package ws1;

import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Quit");
				break;
			} else if(cmd.equals("i")) {
				
			} else if(cmd.equals("s")) {
				
			} else {
				System.out.println("Invalid Command");
				System.out.println("Try Again");
			}
		} // end while
		System.out.println("Bye!");
		sc.close();
	}

}
