package uu;

import java.io.*;

public class Bronze2_WordNumber {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String input = br.readLine();
		input = input.trim();
		
		String [] wordArray;
		wordArray = input.split(" ");
		
		if(wordArray[0].matches(""))
			System.out.println("0");
		else {
			System.out.println(wordArray.length);
		}
		

	}

}
