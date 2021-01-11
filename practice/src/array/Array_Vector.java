package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Array_Vector {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] x = new int[3];
		int [] y = new int[3];
		int [] vector = new int[3];
		
		System.out.print("벡터x를 입력하시오(x1 x2 x3) : ");
		StringTokenizer stX = new StringTokenizer(br.readLine());
		System.out.print("벡터y를 입력하시오(y1 y2 y3) : ");
		StringTokenizer stY = new StringTokenizer(br.readLine());
		for(int i=0; i<3; i++) {
			x[i] = Integer.parseInt(stX.nextToken());
			y[i] = Integer.parseInt(stY.nextToken());
			vector[i] = x[i] + y[i];
		}
		System.out.print("벡터의 합은 vector ( ");
		for(int str : vector) {
			System.out.print(str+" ");
		}System.out.println(")");
		
	}

}
