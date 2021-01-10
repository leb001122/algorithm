package january8;

import java.util.*;
public class GoodSection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] set = new int[sc.nextInt()];
		
		for(int i=0; i < set.length; i++) {
			set[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		
		Arrays.sort(set);
		
		int a = 0, b = 0;
		for(int i=0; i < set.length; i++) {
			if(n == set[i]) {
				System.out.println("0");
				return;
			}
			else {
				if(set[i] < n) {
					if(n < set[i+1]) {
						a = set[i];
						b = set[i+1];
						break;
					}
					else
						continue;
				}
			}
		}

		int count = 0, temp = n;
		for(int i = a+1; i <= n; i++) {
			if(i == temp) temp++;
			for(int j = temp; j < b; j++) {
				count++;
//				System.out.println("["+ i +","+ j +"]");
			}
		}
		System.out.println(count);
	} 
}
