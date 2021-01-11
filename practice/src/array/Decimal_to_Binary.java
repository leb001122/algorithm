package array;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수를 입력하시오. : ");
		int decimal = sc.nextInt();
		int [] binary = new int[64];
		getBinary(decimal, binary);
		Print(binary);
	}
	
	static void getBinary(int de, int [] binary) {
		for(int i=63; i>=0; i--) {
			binary[i] = de%2;
			de /= 2;
			if(de == 0) 
				break;
		}
	}
	static void Print(int [] binary) {
		int idx = 0;
		for(int i=0; i<binary.length; i++) {
			if(binary[i] == 0) 
				continue;
			else {
				idx = i;
				break;
			}
		}
		for(int i=idx; i<binary.length; i++) {
			System.out.print(binary[i]);
		}
	}
	
}
