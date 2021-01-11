package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_Max_Min {

	static int sum = 0;
	static int max, min;
	static int [] array = new int[10];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		inputArray(array,st);
		setSum(array);
		setMaxandMin(array);
		System.out.println("합 : "+getSum()+" 최대값 : "+getMax()+" 최소값 : "+getMin());		
	}
	
	
	
	
	public static void inputArray(int [] arr, StringTokenizer st) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}
	public static void setSum(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
	}
	public static int getSum() {
		return sum;
	}
	public static void setMaxandMin(int [] arr) {
		max = arr[0]; min = arr[0];
		for(int i=1; i< arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			else if(min > arr[i])
				min = arr[i];
		}
	}
	public static int getMax() {
		return max;
	}
	public static int getMin() {
		return min;
	}
}
