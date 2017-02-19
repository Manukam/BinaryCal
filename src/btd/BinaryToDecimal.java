package btd;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToDecimal {
static double total = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		ArrayList<Character> binary = new ArrayList<Character>();
		String number = sc.next();
		for(int i = 0; i < number.length(); i++){
			binary.add(number.charAt(i));
		}
	//	System.out.println(binary.get(1));
		for(int k = 0; k < number.length(); k++){
			double temp = binary.get(k);
			System.out.println(temp);
			temp = (Math.pow(2, k)) * temp;
			total += temp;
			//double  temp = Double.parseDouble(Math.pow(binary.get(k),k)) + k;
		}
		System.out.println(total);
	}

}
