package chapter11;

import java.util.Scanner;

public class Number02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s_n = sc.nextLine();
		int s_len = s_n.length();
		int n = Integer.parseInt(s_n);
		int result = 0;
		sc.close();
		
		for(int i=n-(s_len*9); i<n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum + i == n) {		
				result = i;
				break;
			}
			
		}
		System.out.println(result);
	}

}
