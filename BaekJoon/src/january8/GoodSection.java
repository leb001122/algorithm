package january8;

import java.util.*;
public class GoodSection {

	public static void main(String[] args) {
		// �Է�
		// 1. ������ ũ�� L
		// 2. ������ ����
		// 3. n
		// ��� : n�� �����ϴ� ���� ������ ����
		// ���� �����̶� : ����[A, B], A,B�� ���� ����, A < B, ���� S�� ���Ե� ������ ������ ������ ����

		// �Է�
		Scanner sc = new Scanner(System.in);
		int [] set = new int[sc.nextInt()];
		
		for(int i=0; i < set.length; i++) {
			set[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		
		// n�� ������ ��� �� ���� ���̿� ���ϴ� ������ ���ϱ� 
		// ex) ������ ���Ұ� 1, 4, 6, 12, 13�̰� n = 7�̶�� n�� 6�� 12 ���̿� ���Ѵ�. a = 6, b = 12 ����
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
		// a = 6, b = 12; n = 7 �̶��
		// i�� 7�̶�� ������ ������ 12-7-1�� because [7,8],[7,9][7,10][7,11] 
		// i�� 8�̶�� ������ ������ 12-8-1�� because [8,9],[8,10],[8,11]
		for(int i = a+1; i <= n; i++) {
			count += b-i-1;
		}
		System.out.println(count);
		
	} // 9 : 3�� 10 : 2��
}
