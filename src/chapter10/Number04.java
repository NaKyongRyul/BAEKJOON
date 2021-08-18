package chapter10;

import java.util.Scanner;

public class Number04 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		sb.append((int) (Math.pow(2, a) - 1)).append('\n');
		Hanoi(a, 1, 2, 3);
		System.out.println(sb);
	}
	
	public static void Hanoi(int n, int start, int mid, int to) {
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		Hanoi(n-1, start, to, mid);
		sb.append(start + " " + to + "\n");
		Hanoi(n-1, mid, start, to);
	}

}
