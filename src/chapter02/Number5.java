package chapter02;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
//		if(h>0 && m>=45) {
//			System.out.println(h + " " + (m-45));
//		}
//		else if(h>0 && m<45) {
//			System.out.println(h-1 + " " + (m+15));
//		}
//		else if(h==0 && m>=45) {
//			System.out.println(h + " " + (m-45));
//		}
//		else if(h==0 && m<45) {
//			System.out.println(23 + " " + (m+15));
//		}
		
		if(m<45) {
			if(h==0) {
				System.out.println(23 + " " + (m+15));
			}
			else {
				System.out.println((h-1) + " " + (m+15));
			}
		}
		else {
			System.out.println(h + " " + (m-45));
		}
	}

}
