package chapter07;

import java.util.Scanner;

public class Number05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			if(65 <= s.charAt(i) && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 'A']++;
			}
			else {
				arr[s.charAt(i) - 'a']++;
			}

		}
		sc.close();
		
		int max = 0;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}
		}
		System.out.println(ch);
	}

}
