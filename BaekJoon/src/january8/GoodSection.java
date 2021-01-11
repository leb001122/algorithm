package january8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class GoodSection {
	static int [] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	static int getIdx(int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target)
				return -1;
			else if (arr[i] > target) // arr[0]이 target보다 큰 경우 index i 반환
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		
		int size = Integer.parseInt(br.readLine());
		arr = new int[size];
		String[] input = br.readLine().split(" ");
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int n = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int bIdx = getIdx(n); 
		int aIdx = bIdx - 1;
	
		if(bIdx == -1){
			System.out.println(0);
		}
		else if(bIdx > 0) {
			System.out.println((n-arr[aIdx])*(arr[bIdx]-n)-1);
		}else {
			System.out.println((n-1)*(arr[bIdx]-n)+(arr[bIdx]-n-1));
		}
		

	} 
}










