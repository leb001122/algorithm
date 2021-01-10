package january8;

import java.util.Arrays;
import java.util.Scanner;

public class GoodSection2 {
	public static void main(String[] args) {
		int count = 0, l, n, min = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();

		int num[] = new int[l];

		for (int i = 0; i < l; i++) {
			num[i] = sc.nextInt();
		}

		n = sc.nextInt();
		Arrays.sort(num);
		for (int i = 0; i < l; i++) {
			if (num[i] < n) {
				min = num[i] + 1;
				max = num[i + 1] - 1;
			}
		}
		
		System.out.println("a: "+min+"b: "+max);
		int newmax = max;
		while (min != max) {
			for (int i = min; i < newmax; i++) {
				if (min <= n && n <= max && (min != max)) {
					count++;
				}
				max--;
			}
			max = newmax;
			if (min + 1 != max)
				min += 1;

			else
				break;
		}
		System.out.println(count);
	}
}