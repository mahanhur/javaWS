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
			} else if(cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력 한다.
				
				System.out.println("Input Number[5~9]");
				String Numa1 = "";
				
			} else if(cmd.equals("a2")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 번째 숫자들의 합과 평균을 출력 한다.
				
			} else if(cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 값만의 합과 평균을 출력 한다.
				
			} else if(cmd.equals("a4")) {
				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력 한다.
				
			} else {
				System.out.println("Invalid Command");
				System.out.println("Try Again");
			}
		} // end while
		System.out.println("Bye!");
		sc.close();
	}

}
