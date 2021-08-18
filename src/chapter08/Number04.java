package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
				
		int day = (height - minus) / (plus - minus);
		if((height - minus) % (plus - minus) != 0) {
			day++;
		}
		System.out.println(day);
	}

//	int result = 0;
//	int count = 0;
	
//	while(true) {
//		result += plus;
//		count++;
//		
//		if(result >= height) {
//			System.out.println(count);
//			break;
//		}
//		else {
//			result -= minus;
//		}
//	}

}
