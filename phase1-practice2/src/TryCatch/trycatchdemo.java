package TryCatch;

import java.util.Scanner;

public class trycatchdemo {

	public static void main(String[] args) {

		int a, b, c, d;

		System.out.println("Enter two integers:");

		try {
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + " / " + b + " = " + c + ", Remainder = " + d);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error occurred");
		}
		System.out.println("Other Programming logic continues below...");

	}

}