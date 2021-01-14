package uu;

import java.io.*;
import java.util.*;

class Field{
	int x;
	int y;
	public Field(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Siver2_OrganicCabbage {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int T;
	static int M;
	static int N;
	static int K;
	static int [][] cabbage;
	static boolean [][] visited;
	static Queue<Field> queue = new LinkedList<>();
	static ArrayList<Field> list = new ArrayList<>();
	static int count;
	
	public static void main(String[] args) throws IOException {

		T = Integer.parseInt(br.readLine());

		for(int t=0; t<T; t++) {
			 count = 0;
			 st = new StringTokenizer(br.readLine());
			 M = Integer.parseInt(st.nextToken()); // 가로, 열의 개수
			 N = Integer.parseInt(st.nextToken()); // 세로, 행의 개수
			 K = Integer.parseInt(st.nextToken());
			 cabbage = new int[N][M];
			 visited = new boolean[N][M];
			 setField();
			 
			 for(int i=0; i<N; i++) {
				 for(int j=0; j<M; j++) {
					 if(cabbage[i][j] != 1 || visited[i][j]) {
						 continue;
					 }
					 Bfs(i, j);
				 }
			 }
			 System.out.println(count);
		}
}
	
	public static void setField() throws IOException {
		int x, y;
		// K줄만큼 배추의 위치(x,y) 입력
		 for(int i=0; i<K; i++) {
			 st = new StringTokenizer(br.readLine());
			 x = Integer.parseInt(st.nextToken());
			 y = Integer.parseInt(st.nextToken());
			 cabbage[y][x] = 1;
		 }
	}
	
	public static void Bfs(int y, int x) {
		queue.add(new Field(x, y));
		visited[y][x] = true;
		
		while(!queue.isEmpty()) {
			Field temp = queue.poll();
			addList(temp.x, temp.y);
			
			for(Field item : list) {
				if(cabbage[item.y][item.x] != 1 || visited[item.y][item.x])
					continue;
				queue.add(new Field(item.x, item.y));
				visited[item.y][item.x] = true;	
			}
			list.clear();
		}
		count++;
	}
	
	public static void addList(int x, int y) {
		if(x>0)
			list.add(new Field(x-1,y));
		if(y>0)
			list.add(new Field(x, y-1));
		if(x<M-1)
			list.add(new Field(x+1, y));
		if(y<N-1)
			list.add(new Field(x, y+1));
	}
}
