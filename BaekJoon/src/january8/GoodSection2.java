package january8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodSection2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int [] arr;
	
	public static int getBIdx(int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target)
				return -1;
			else if(arr[i] > target)
				return i;
		}
		return 0;
	}
	
	public static void main(String[] args) throws Exception  {
		// 입력 1
		int size = Integer.parseInt(br.readLine());
		arr = new int[size];
		// 입력 2
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		// 입력 3
		int N = Integer.parseInt(br.readLine());
		
		int bIdx = getBIdx(N);
		int aIdx = bIdx - 1;
		int count = 0;
		
		if(bIdx == -1)
			System.out.println("0");
		else if(bIdx > 0) {
			for(int i=arr[aIdx]+1; i<=N; i++) {
				for(int j=N; j<arr[bIdx]; j++) {
					count++;
				}
			}
			count--;
			System.out.println(count);
		}
		else if(bIdx == 0){
			for(int i=1; i<=N; i++) {
				for(int j=N; j<arr[bIdx]; j++) {
					count++;
				}
			}
			count--;
			System.out.println(count);
		}
		
	} 
}










