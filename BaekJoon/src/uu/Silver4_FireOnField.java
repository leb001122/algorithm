package uu;

import java.util.Scanner;

public class Silver4_FireOnField {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[1001];
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2; i<=N; i++) {
			int tmp = 1;
			int k;
			while(true) {
				arr[i] = tmp;
				for(k=1; i-2*k>=0; k++) {
					if(arr[i]-arr[i-k] == arr[i-k]-arr[i-2*k]) 
						break;			
				}
				if(i-2*k >= 0)
					tmp++;
				else
					break;		
			}
		}
		System.out.println(arr[N]);
	}
}	

		
