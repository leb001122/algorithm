package january8;

import java.util.Scanner;

public class EscapeRectangular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//현재 위치 (x,y)
		//오른쪽 위 꼭짓점 (w,h)
		//가로 = a, 세로 = b
		int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt()
			,horizontal, vertical, min; 
		if(x > w-x) {
			horizontal = w-x;
			if(y > h-y) {
				vertical = h-y;
				if(horizontal > vertical) {
					min = vertical;
				}	
				else {
					min = horizontal;		
				}
			}	
			else { 
				vertical = y;
				if(horizontal > vertical) {
					min = vertical;
				}
				else {
					min = horizontal;
				} 
			}
		}
		else {
			horizontal = x;
			if(y > h-y) {
				vertical = h-y;
				if(horizontal > vertical)
					min = vertical;
				else 
					min = horizontal;
			}
			else {
				vertical = y;
				if(horizontal > vertical)
					min = vertical;
				else 
					min = horizontal;
			}
		}	
		System.out.println(min);
	}
}
