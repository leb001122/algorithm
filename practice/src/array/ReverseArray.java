package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseArray {

	static int [] array = new int[10];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		inputArray(array, st);		
		// Arrays.sort(array);
		reverseArray(array);
		Print(array);
	}
	
	
	public static void inputArray(int [] arr, StringTokenizer st) {
		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
	}
	public static void reverseArray(int [] arr) {
		int temp;
		for(int i=0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-(i+1)];
			arr[arr.length-(i+1)] = temp;
		}
	}
	public static void Print(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}

}

