package array;

import java.io.*;
import java.util.*;

public class Calendar {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int [] array = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) throws Exception {
		int month = Integer.parseInt(br.readLine());
		findDays(array, month);
	
	}
	public static void findDays(int [] arr, int mon) {
		System.out.println(mon+"월은 "+arr[mon-1]+"일까지 있습니다.");
	}
	
}
