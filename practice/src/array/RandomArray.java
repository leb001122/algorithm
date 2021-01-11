package array;

import java.util.Random;

public class RandomArray {
	
	static Random rnd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[10];
		inputArray(array);
		Print(array);
		
	}
	public static void inputArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(100)+1;
		}
	}
	public static void Print(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}
}