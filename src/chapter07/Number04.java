package chapter07;

import java.util.Scanner;

public class Number04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				char ch = s.charAt(j);
				for(int k=0; k<b; k++) {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
