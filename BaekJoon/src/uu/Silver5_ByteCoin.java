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
		// 현재 날에서 다음날이 될 때, 가격이 오를때만 확인
		// 현재금액 + 코인을 사고 팔아서 번돈
		// 추가된 돈 : 살수있는 코인의 개수 * 가격 상승
		for(int i=0; i<days-1; i++) {
			if(price[i] < price[i+1]) {
				cash += (cash / price[i]) * (price[i+1]-price[i]);
			}
		}
		System.out.println(cash);
	}
}
