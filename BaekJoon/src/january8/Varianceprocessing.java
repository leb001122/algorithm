package january8;

import java.util.*;
import java.io.*;

public class Varianceprocessing {

	public static void main(String[] args) throws Exception{
		BufferedReader Varianceprocessing = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(Varianceprocessing.readLine())
		 , a, b;
		for(int i=0; i<testcase; i++){
			StringTokenizer st = new StringTokenizer(Varianceprocessing.readLine());
			a = Integer.parseInt(st.nextToken())%10; 
			b = Integer.parseInt(st.nextToken());
			int data = 1;
			for(int j=0; j<b; j++) {
				data *= a;  
				data %= 10;
			}
			if(data == 0) 
				data = 10;
			
			System.out.println(data);
		}	
	}
}
