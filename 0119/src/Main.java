import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1부터 10까지의 합을 구해보세요
//		int sum = 0, num = 0;
//		
//		while(num < 10) {
//			num = num + 1;
//			sum = sum + num;
//		}
//		System.out.println(sum);
		
//		------------------------------------------
		
//		int num = 0;
//		int evenSum = 0, oddSum = 0;
//		String strEven = "", strOdd = "";
//		
//		while(num < 10) {
//			num = num + 1;
//			if(num % 2 == 0) {
//				evenSum = evenSum + num;
//				if(num < 10) {
//					strEven = strEven + num + " + ";
//				}else {
//					strEven = strEven + num + " = ";
//				}
//			}else {
//				oddSum = oddSum + num;
//				if(num < 9) {
//					strOdd = strOdd + num + " + ";
//				}else {
//					strOdd = strOdd + num + " = ";
//				}
//			}
//		}
//		System.out.println(strEven + evenSum);
//		System.out.println(strOdd + oddSum);
		
//		2 + 4 + 6 + 8 + 10 = 30
//		1 + 3 + 5 + 7 + 9 = 25

		
//		------------------------------------------
		
		//정수를 입력받고
		//1부터 입력 받은 수 까지의 홀수의 갯수를 출력해보세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		
//		int target = sc.nextInt();
//		int start = 0;
//		int oddCount = 0;
//		
//		while(start < target) {
//			start++;
//			if(start % 2 != 0) {
//				oddCount++;
//			}
//		}
//		System.out.println("1부터 " + target + "까지의 홀수의 갯수 : " + oddCount);
		
//		------------------------------------------
		
		//정수를 입력 받아서
		//입력 받은 수의 구구단을 출력해보세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력 : ");
//		int num = sc.nextInt();
//		int result = 0;
//		int start = 0;
//		
//		while(start < 9) {
//			start++;
//			result = start * num;
//			System.out.println(num + " * " + start + " = " + result);
//		}
		
//		------------------------------------------
		
		//2단부터 9단까지 출력해보세요
		
//		int start = 1;
//		int num = 0;
//		int result = 0;
		
//		while(num < 9) {
//			num++;
//			start = 0;
//			while(start < 9) {
//				start++;
//				result = num * start;
//				System.out.print(num + " * " + start + " = " + result + " \n");
//			}
//		}
//		System.out.println();
		
//		------------------------------------------
		
//		컴퓨터가 1부터 100사이의 임의의 수를 랜덤으로 생성해 놓으면
//		사용자가  생성된 랜덤의 수를 알아 맞춰보세요
//		
//		[업]   : 사용자가 정답보다 낮은 값을 입력한 경우
//		[다운] : 사용자가 정답보다 높은 값을 입력한 경우
//		[정답] : 사용자가 정답을 맞췄을 경우
//		[횟수] : 사용자가 답을 외친 횟수
		
//		Scanner sc = new Scanner(System.in);
//		int answer = (int)(Math.random() *  100 + 1);
//		boolean flag = true;
//		int num, totalcount = 0, upcount = 0, downcount = 0;
		
//		while(flag) {
//			System.out.print("정답 입력 : ");
//			num = sc.nextInt();
			
//			if(answer < num) {
//				System.out.println("[다운]");
//				downcount++;				
//			}else if(answer > num) {
//				System.out.println("[업]");
//				upcount++;
//			}else {
//				System.out.println("[정답]");
//				flag = false;
//			}
//		}
		
//		totalcount = upcount + downcount;

//		System.out.println("업 : " + upcount + "회");
//		System.out.println("다운 : " + downcount + "회");
//		System.out.println("총 : " + totalcount + "회");
		
//		------------------------------------------
		
		//2단 부터 19단 까지 임의의 구구단 문제를 생성 하고,
		//사용자가 정답을 맞추기 프로그램
		
		//조건 
		//정답 : 10점 획득
		//오답 : 5점 감점		
		//11단 부터는 보너스점수 10점 획득
		//문제를 3번 틀리면 게임 종료
		//총점을 출력해 보세요
		
		//내 풀이
		//나는 한 구구단 문제에 세 번 이상 틀리면 게임 종료인 줄 알았음
		//문제 자체를 3문제 이상 틀리면 종료임
//		Scanner sc = new Scanner(System.in);
		
//		int first = (int)(Math.random() * 18 + 1);
//		int second = (int)(Math.random() * 8 + 1);
		//즉, 이렇게 while문 밖에서 할 필요 없음
//		int result = first * second;
//		int count = 0;
//		int score = 100;
//		boolean flag = true;
//		
//		while(flag || count == 3) {
//			System.out.print(first + " * " + second + " = ");
//			int answer = sc.nextInt();
//			
//			if(result != answer) {
//				System.out.println("틀렸습니다. 점수가 5점 감점되었습니다.");
//				count++;
//				score = score - 5;
//			}else if(result == answer) {
//				System.out.println("정답입니다. 10점을 획득하셨습니다.");
//				score = score + 10;
//				
//				if(first > 10) {
//					System.out.println("11단 이상의 문제에서 정답을 맞추셨으므로 보너스 점수 10점을 획득하셨습니다.");
//					score = score + 10;
//				}
//				
//				flag = false;
//			}
//		}
//		
//		System.out.println("총점 : " + score);
		
//		------------------------------------------
		
		 //강사님 풀이
//		 Scanner sc = new Scanner(System.in);
		 
		 //  정답                      보너스                    틀림                    총
//		 int rScore = 10, bScore = 10, wScore = 5, tScore = 0;
		 //  정답 횟수             틀린 횐수
//		 int rCount = 0, wCount = 0;
//		 int answer, result;
		 
//		 int fNum, sNum;
//		 boolean flag = true;
		 
//		 while(flag) {
//			 fNum = (int)(Math.random() * 18 + 2);
//			 sNum = (int)(Math.random() * 9 + 1);
//			 result = fNum* sNum;
			 
//			 System.out.println("[정답을 입력하세요]");
//			 System.out.print(fNum + " * " + sNum + " = ");
//			 answer = sc.nextInt();
			 
//			 if(result == answer) {
//				 System.out.println("정답 입니다." + rScore + "점 획득했습니다.");
//				 tScore += rScore;
//				 rCount++;
				 
//				 if(fNum >= 11) {
//					 System.out.println("추가점수" + bScore + "점 획득했습니다.");
//					 tScore += 10;
//				 }
//			 } else {
//				 System.out.println("틀렸습니다.");
//				 tScore -= wScore;
//				 wCount++;
				 
//				 if(wCount >= 3) {
//					 System.out.println(wCount + "번 틀려 게임을 종료합니다.");
//					 flag = false;
//				 }
//			 }
//		 }
		 
//		 System.out.println("정답 횟수 : " + rCount);
//		 System.out.println("현재 점수 : " + tScore);
		
//		------------------------------------------
		
//		int num = 0, sum = 0;
		
//		do {
//			System.out.println("while 반복 수행 중입니다.");
//			num++;
//			sum = sum + num;
//		}while(num > 10);

//		System.out.println(sum);
		
//		------------------------------------------
		
		int num = 0, sum = 0;
		String eSum = "";
		
		boolean flag = true;
		do {
			num++;
			
			if(num > 10) {
				break;
			}
			if(num % 2 != 0) {
				continue;
			}
			
			sum = sum + num;
			if(num < 10) {
				eSum += num + " + ";
			}else {
				eSum += num + " = ";
			}
		}while(flag);
		
		System.out.println(eSum + sum);
		
		
	}

}

/*
반복 분기문
명령 조건 {
	명령1;
	명령2;
	명령3;
}

while
for

분기 명령
break    : 현재의 반복 블럭 밖으로 분기
continue : 현재의 반복 블럭 처음으로 분기
*/
