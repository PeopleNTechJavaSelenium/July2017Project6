package exception;

import java.util.Scanner;

public class UseException {

	public static void main(String[] args) {
		int num = 10;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter a division number: ");
			int division = sc.nextInt();
			int result = 10/division;
			System.out.println(result);
			}catch(Exception ex) {
				System.out.println("you can not divide a number by zero");
			}finally {
				sc.close();
			}
	}

}
