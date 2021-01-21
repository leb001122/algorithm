package uu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_ByteCoin {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String [] input;
	static int days;
	static long cash;
	static int coin = 0;
	static int [] price;
	
	public static void main(String[] args) throws IOException {
		
		input = br.readLine().split(" ");
		days = Integer.parseInt(input[0]);
		cash = Long.parseLong(input[1]);
		price = new int[days];
		
		for(int i=0; i<days; i++) {
			price[i] = Integer.parseInt(br.readLine());	
		}
		// ���� ������ �������� �� ��, ������ �������� Ȯ��
		// ����ݾ� + ������ ��� �ȾƼ� ����
		// �߰��� �� : ����ִ� ������ ���� * ���� ���
		for(int i=0; i<days-1; i++) {
			if(price[i] < price[i+1]) {
				cash += (cash / price[i]) * (price[i+1]-price[i]);
			}
		}
		System.out.println(cash);
	}
}
