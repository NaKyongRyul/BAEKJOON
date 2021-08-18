package chapter07;

import java.util.Scanner;

public class Number03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;								
			}
		}
		
		for(int k : arr) {
			System.out.print(k + " ");
		}
	}

}