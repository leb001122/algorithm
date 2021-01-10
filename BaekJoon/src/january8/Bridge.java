package january8;
import java.util.*;
public class Bridge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcaset = sc.nextInt(), n, m;
		double bridge, div, temp;
		for(int i=0; i<testcaset; i++) {
			n = sc.nextInt(); // 서쪽
			m = sc.nextInt(); // 동쪽
			if(n > m-n)
				n = m-n;
			bridge = 1; 
			div = 1;
			temp = n;
			for(int j=0; j<temp; j++, m--, n--) {
				bridge *= m;
				div *= n;
			}	
			bridge /= div;
			System.out.println((int)bridge);
		}
	}
}
