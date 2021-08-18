package chapter07;

import java.util.Scanner;

public class Number11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		if(a>b) {
			System.out.println(a);
		}
		else if(a<b) {
			System.out.print(b);
		}
	}

}
