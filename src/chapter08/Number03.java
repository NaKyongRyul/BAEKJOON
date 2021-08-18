package chapter08;

import java.util.Scanner;

public class Number03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int cross = 1;
		int prev_count = 0;
		
		while(true) {
			if(a <= prev_count + cross) {
				if(cross % 2 == 1) {
					System.out.println(cross - (a - prev_count - 1) + "/" + (a - prev_count));
				}
				else {
					System.out.println((a - prev_count) + "/" + (cross - (a - prev_count - 1)));
				}	
			}
			else {
				prev_count += cross;
				cross++;
			}
		}
		
		
	}

}
