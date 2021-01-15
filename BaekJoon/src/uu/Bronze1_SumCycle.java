package uu;

import java.util.Scanner;

public class Bronze1_SumCycle {

	static int N;
	static int [] array;
	static int cycle = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		array = new int[4];
		
		if(N < 10) {
			array[0] = 0;
			array[1] = N;
			opperation(array);
		}
		else {
			array[0] = N/10;
			array[1] = N%10;
			opperation(array);
		}
		System.out.println(cycle);
		
	}
	
	public static int opperation(int [] arr) {
		int temp_0 = arr[0];
		int temp_1 = arr[1];
		
		while(true) {
			if(cycle !=0 && arr[0] == temp_0 && arr[1] == temp_1)
				return cycle;

			int sum = arr[0] + arr[1];
			
			cycle++; 
			
			if(sum < 10) {
				arr[2] = 0;
				arr[3] = sum;
			}
			else {
				arr[2] = sum/10;
				arr[3] = sum%10;
				
			}
		
			arr[0] = arr[1];
			arr[1] = arr[3];
		}
	}

}
