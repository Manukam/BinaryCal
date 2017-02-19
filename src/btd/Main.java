package btd;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the decimal number");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int decimal = sc.nextInt();
		int binary;
		int remainder;
		do{
			binary = decimal % 2;
			remainder = decimal / 2;
			decimal = remainder;
			//System.out.print(binary);
			answer.add(binary);
		} while (!(decimal == 1));
		System.out.print(decimal);
		System.out.println(answer.toString());
	}

}
