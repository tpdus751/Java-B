package BackJoonQuiz;

import java.util.Scanner;

public class BOJ9012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		input.nextLine();
		
		for (int i = 0; i < N; i++) {
			int count = 0;
			char[] vps = input.nextLine().toCharArray();
			
			boolean isVps = true;
			
			
			
			for (int j = 0; j < vps.length; j++) {

				if (vps[j] == '(') {
					count += 1;
				}
				else {
					count -= 1;
					if (count < 0) {
						isVps = false;
					}
				}	
				if (j == vps.length - 1) {
					if (count != 0) {
						isVps = false;
					}
				}
			}
			
			
			if (isVps) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
		}

	}

}
