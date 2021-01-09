package january8;

import java.util.*;
public class GoodSection {

	public static void main(String[] args) {
		// 입력
		// 1. 집합의 크기 L
		// 2. 집합의 원소
		// 3. n
		// 출력 : n을 포함하는 좋은 구간의 개수
		// 좋은 구간이란 : 구간[A, B], A,B는 양의 정수, A < B, 집합 S에 포함된 정수는 구간에 속하지 않음

		// 입력
		Scanner sc = new Scanner(System.in);
		int [] set = new int[sc.nextInt()];
		
		for(int i=0; i < set.length; i++) {
			set[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		
		// n이 집합의 어느 두 정수 사이에 속하는 수인지 구하기 
		// ex) 집합의 원소가 1, 4, 6, 12, 13이고 n = 7이라면 n은 6과 12 사이에 속한다. a = 6, b = 12 저장
		int count = 0, a = 0, b = 0;
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
		// a = 6, b = 12; n = 7 이라면
		// i가 7이라면 구간의 개수는 12-7-1게 because [7,8],[7,9][7,10][7,11] 
		// i가 8이라면 구간의 개수는 12-8-1개 because [8,9],[8,10],[8,11]
		for(int i = a+1; i <= n; i++) {
			count += b-i-1;
		}
		System.out.println(count);
		
	} // 9 : 3개 10 : 2개
}
