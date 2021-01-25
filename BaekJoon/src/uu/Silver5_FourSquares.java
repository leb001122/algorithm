package uu;

import java.util.Scanner;

public class Silver5_FourSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] array = new int[N];
		int k;
		int temp=0;
		double sqrt = 1.0;
		int search=0;
		int min;
		
		for(int i=1; i<=N; i++) {
			if(sqrt != Math.sqrt(i)) {
				k = 0;
				min = 4;
				do {
					k++;
					temp = i - (int) Math.pow(sqrt-k, 2);
					search = 1 + array[temp-1];
					if(min > search) {
						min = search;
					}
				}while(sqrt-k > 1);
				array[i-1] = min;
			}		
			else {
				array[i-1] = 1;
				sqrt++;
			}
		}	
		System.out.println(array[N-1]);
	}
}
