package uu;

import java.io.*;
import java.util.ArrayList;

public class Siver3_ArithmeticSequance {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean repeat;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int L = Integer.parseInt(input[1]);
		repeat = true;
	
		while(repeat) {
			if(L>100) {
				System.out.println("-1");
				break;
			}
			setList(N, L);
			L++;
		}
	}
	
	public static void setList(int N, int L) {
		double a1 = (double)(2*N-L*L+L)/(2*L);
		double temp = (int)a1;
		temp = a1 - temp; // 소수점 아래자리 temp에 저장
		
		if(temp == 0.0) {
			for(int i=0, a=(int)a1; i<L; i++, a++) { 
				list.add(a);
				if(list.get(0)<0) {
					list.clear();
					return;
				}	
				System.out.print(list.get(i)+" ");
			}
			repeat = false;
		}
	}		
}		


