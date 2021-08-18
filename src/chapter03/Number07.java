package chapter03;

import java.io.*;

public class Number07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(bf.readLine());
		bf.close();
		
		for(int i=a; i>0; i--) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}
