package chapter09;

import java.util.Scanner;

public class Number06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0; i<=count; i++) {
			int a = sc.nextInt();
			
			if(a % 2 == 0 && a != 2) {
				for(int j=(int)Math.sqrt(a); j<=a-2; j++) {
					int k = 2;
					
					for(k=2; k<=Math.sqrt(j); k++) {
						if(j % k == 0) {
							break;
						}
					}
					
					if(k > Math.sqrt(j)) {
						System.out.print(j + " ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
