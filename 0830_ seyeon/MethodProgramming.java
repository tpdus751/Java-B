package friday_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MethodProgramming {

	public static void main(String[] args) throws IOException {
		
		boolean isRewind = true; 
		
		while(isRewind) {
			
			System.out.println("------------------처음------------------");
			System.out.println();
		
			int num = getInput("배열의 크기(숫자)를 입력하세요 : ");
			
			int[] numArr = inputToArray("배열에 넣을 숫자를 입력하세요(공백 단위) : ", num);
			
			boolean isMenuRewind = true;
			
			boolean isThree = false;
			
			while (isMenuRewind) {
				
				int menuNum = showMenu();
				
				if (menuNum == 1) {
					System.out.println(">> 배열에 저장된 총 합 : " + sumArr(numArr));
	
				} else if (menuNum == 2) {
					System.out.println(">> 배열에 저장된 숫자 중 가장 큰 수 : " + maxValueOfArr(numArr));
					
				} else if (menuNum == 3) {
					int cnt = getFindHigherValuesCnt(numArr);
					System.out.println(">> 배열에 들어있는 값 중 입력된 숫자보다 큰 수의 개수 : " + cnt);
					
				} else if (menuNum == 4) {
					int[] oppositeArr = getOppositeArr(numArr);
					showOppositeArr(oppositeArr);
					
				}
			
				System.out.println("--------------------------------------");
				System.out.println();
				
				int endMenuNum = showEndMenu();
						
				switch (endMenuNum) {
					case 1:
						isMenuRewind = false;
						break;
					case 2:
						break;
					case 3:
						isMenuRewind = false;
						isThree = true;
						break;
				}
			
			}
			
			if (isThree) {
				break;
			}
		}

	}

	private static int showEndMenu() {
		
		Scanner input = new Scanner(System.in);
		
		int endMenuNum = 0;
		
		do {
			System.out.print
			(""" 
				1. 처음으로 돌아가기
				2. 메뉴로 돌아가기
				3. 종료
					
				메뉴를 입력하세요 : """);
			
			try {
				endMenuNum = input.nextInt();
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자를 입력하세요");
				System.out.println("--------------------------------------");
				System.out.println();
				return showEndMenu();
			} 
			System.out.println();
			
			if (!(endMenuNum >= 1 && endMenuNum <= 3)) {
				System.out.println("1 ~ 3까지의 숫자를 입력하세요.");
				System.out.println("--------------------------------------");
				System.out.println();
			}
			
		} while (!(endMenuNum >= 1 && endMenuNum <= 3));
		
		return endMenuNum;
		
		
		
	}

	private static void showOppositeArr(int[] arr) {
		System.out.print("배열에 저장된 값을 역순 출력 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i == arr.length - 1) {
				System.out.println();
			}
		}
		
	}
	
	private static int[] getOppositeArr(int[] numArr) {
		for (int i = 0; i < (numArr.length / 2); i++) {
			int temp = numArr[i];
			numArr[i] = numArr[numArr.length - (i + 1)];
			numArr[numArr.length - (i + 1)] = temp; 
		}
		
		return numArr;
	}

	private static int getFindHigherValuesCnt(int[] numArr) {
		System.out.print(">> 숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int cnt = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > num) {
				cnt += 1;
			}
		}
		
		return cnt;
	}

	private static int maxValueOfArr(int[] numArr) {
		int max = numArr[0];
		
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		
		return max;
	}

	private static int sumArr(int[] numArr) {
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		return sum;
	}

	private static int showMenu() {
		Scanner input = new Scanner(System.in);
		
		int menuNum = 0;
		
		do {
			System.out.print
			(""" 
				--------------------------------------
				1. 정수형 배열에 저장된 모든 값 더하여 반환
				2. 정수형 배열에 저장된 숫자 중 가장 큰 숫자 출력
				3. 배열에 저장된 숫자 중 입력된 숫자보다 큰 수가 몇 개 있는지 구하기
				4. 배열에 저장된 숫자를 역순으로 저장하여 출력 	
					
				메뉴를 입력하세요 : """);
			
			try {
				menuNum = input.nextInt();
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자를 입력하세요");
				System.out.println("--------------------------------------");
				System.out.println();
				return showMenu();
			} 
			System.out.println();
			
			if (!(menuNum >= 1 && menuNum <= 4)) {
				System.out.println("1 ~ 4까지의 숫자를 입력하세요.");
				System.out.println("--------------------------------------");
				System.out.println();
			}
			
		} while (!(menuNum >= 1 && menuNum <= 4));
		
		return menuNum;
		
	}

	private static int[] inputToArray(String string, int num) throws IOException {
		
		System.out.print(string);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] scores = new int[num];
		
		for (int i = 0; i < num; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		return scores;
	}

	private static int getInput(String string) {
		System.out.print(string);
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		return num;
	}

}
