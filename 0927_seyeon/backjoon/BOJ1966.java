package BackJoonQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		// 테스트케이스 만큼 반복
		for (int i = 0; i < total; i++) {
			st = new StringTokenizer(br.readLine());
			// 문서의 갯수
			int cnt = Integer.parseInt(st.nextToken());
			// 프린터에서 출력되고자 하는 문서의 인덱스
			int want_idx = Integer.parseInt(st.nextToken());
			
			// 인덱스, 우선순위를 받는 배열을 이루고 있는 Queue생성
			Queue<int[]> queue = new LinkedList<>();
			// 우선순위가 숫자가 높은 순으로 정렬
			PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
			
			st = new StringTokenizer(br.readLine());
			// 문서의 개수 만큼 반복
			for (int j = 0; j < cnt; j++) {
				// 우선순위
				int priority = Integer.parseInt(st.nextToken());
				// queue에 현재 문서의 idx, 우선순위를 삽입
				queue.add(new int[]{j, priority});
				// PriorityQueue에 우선순위를 삽입 -> 알아서 우선순위가 높은순으로 정렬 
				pQ.add(priority);
			}
			// 우선순위에 따라 print될 때 += 1하기 위해 0으로 초기화
			int printOrder = 0;
			
			// queue의 사이즈가 0이 될 때까지 반복
			while(queue.size() != 0) {
				// 비교하기위해 queue에서 빼기(queue는 선입선출)
				int[] current = queue.poll();
				// 현재 idx 구하기
				int current_idx = current[0];
				// 현재 우선순위 구하기
				int current_priority = current[1];
				
				// 만약 현재 우선순위가 PriorityQueue의 가장 높은 우선순위와 같다면
				if (current_priority == pQ.peek()) {
					// 출력되므로 출력 수 + 1
					printOrder += 1;
					// PriorityQueue에서 우선순위 제거
					pQ.poll();
					
					// 만약 현재의 문서 인덱스와 원하는 문서의 인덱스가 같다면
					if (current_idx == want_idx) {
						// 현재의 출력 순위를 출력
						System.out.println(printOrder);
						break;
					}
					// 만약 현재의 우선 순위가 PriorityQueue의 우선순위가 아니라면
				} else {
					// 현재의 idx, priority 배열을 queue의 맨 뒤에 삽입
					queue.add(current);
				}
			}
		}
		
		
			
			
		
	}

}
