package chapter06;

public class Number02 {

	public static void main(String[] args) {
		for(int i=0; i<10001; i++) {	
			int n = d(i);
		}
		
	}

	public static int d(int number) {
		int sum = number;
		while(number != 0) {
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}
