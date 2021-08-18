package chapter03;

import java.io.*;

public class Number06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1; i<=a; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}
