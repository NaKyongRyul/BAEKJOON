package chapter03;

import java.io.*;
import java.util.*;
	
public class Number09 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int[] b_arr = new int[a];
		int[] c_arr = new int[a];
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			b_arr[i] = b;
			c_arr[i] = c;
			arr[i] = b + c;
		}
		for(int i=0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + b_arr[i] + " + " + c_arr[i] + " = " + arr[i]);
		}
		sc.close();
	}

}
