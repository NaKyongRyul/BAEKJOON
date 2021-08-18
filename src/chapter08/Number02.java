package chapter08;

import java.util.Scanner;

public class Number02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int count = 1;
		int range = 2;
		
		if(a == 1) {
			System.out.println(1);
		}
		
		else {
			while(range <= a) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}

}
