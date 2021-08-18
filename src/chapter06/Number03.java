package chapter06;

public class Number03 {

	public static void main(String[] args) {
		
	}
	
	public static int arithmetic_sequence(int num) {
		int count = 0;
		if(num < 100) {
			return num;
		}
		count = 99;
		if(num == 1000) {
			num = 999;
		}
		for(int i=100; i<=num; i++) {
			int hun = i/100;
			int ten = (i/10)%10;
			int one = i%10;
			if((hun - ten) == (ten - one)) {
				count++;
			}
		}
		return count;
	}

}
