package BackJoonQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		int cnt = 1;
		
		sb.append("<");
		
		while(true) {
			int num = 0;
			if (cnt % K == 0) {
				if (cnt == N * K) {
					sb.append(queue.poll());
				} else {
					sb.append(queue.poll() + ", ");
				}
			} else {
				num = queue.poll();
				queue.add(num);
			}
			cnt++;
			if (cnt > N * K) {
				break;
			}
		}
		sb.append(">");
		
		System.out.println(sb.toString());
		
	}

}
