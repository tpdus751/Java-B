package friday_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Student {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int numStudent = getNumberKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
		

	}
	
	
	private static void printSumAverage(int[] scores) {
		int sum = 0;
		int average = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println(">> 합계 : " + sum);
		System.out.println(">> 평균 : " + sum / scores.length);
		
	}
	

	private static int[] getScoresLine(int numStudent) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(numStudent + "명의 성적 : ");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[numStudent];
		
		for (int i = 0; i < numStudent; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		return arr;
	}
	

	static int getNumberKeyboard(String string) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(string);
		int num_stu = Integer.parseInt(br.readLine());

		return num_stu;
	}

}
