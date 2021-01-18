import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
		
//		DecimalFormat df = new DecimalFormat("0");
		//강제로 소숫점빼기 정수까지만
//		String result = df.format(dNum);
//		System.out.println(result);

//		df = new DecimalFormat("0.0");
		//강제로 소숫점 첫번째 까지만
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("000000.00000");
		//강제로 원래 숫자보다 하나씩 크게 -> 앞뒤로 0이 붙음
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("#");
		//숫자를 보고 정수만
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####");
		//숫자를 보고 정수만, 0으로 채워지지 않음, 유효한 데이터만을 출력
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("###,###.#####");
		//세자리 수 마다 , 찍힘
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####%");
		//원래의 숫자에 100을 곱함
//		result = df.format(dNum);
//		System.out.println(result);
		
//		------------------------------------------
		
//		Date today = new Date();
//		System.out.println(today);
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//대문자 M은 월, 소문자 m은 분
//		String strDay = sdf.format(today);
//		System.out.println(strDay);

//		sdf = new SimpleDateFormat("MM/dd/yy");
		//대문자 M은 월, 소문자 m은 분
//		strDay = sdf.format(today);
//		System.out.println(strDay);
		
//		long mSec = System.currentTimeMillis();
//		strDay = sdf.format(mSec);
//		System.out.println(strDay);

//		------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("방문 횟수 : ");
//		int visitCount = sc.nextInt();
//		
//		if(visitCount < 2) {
//			System.out.println("처음 오셨군요. 방문해 주셔서 감삼다.");
//		}
//		else {
//			if(visitCount >= 10) {
//				System.out.println("닭죽 받아가숑");
//			}
//			else {
//				System.out.println("다시 방문해 주셔서 감사용");
//			}
//		}
//		
//		visitCount++;
		
//		------------------------------------------
		
//		double rNum = Math.random();
		//a = 97 ...
//		char rChar = (char)(Math.random() * 26 + 97);
//		System.out.println(rChar);
		
//		------------------------------------------
		
//		주사위를 2개 던져서
//		합계가 짝수 일 때 : 짝! 출력
//		합계가 홀수 일 때 : 홀! 출력
//		두 주사위의 값이 같을 때 : 더블! 출력
		
		//내 풀이
//		int first = (int) (Math.random() * 6 + 1);
//		int second = (int) (Math.random() * 6 + 1);
//		int sum = first + second;
//		
//		System.out.println("첫 번째 : " + first + ", 두 번째 : " + second + ", 합 : " + sum);
//		
//		if(first == second) {
//			System.out.println("더블!");
//		}
//		
//		if(sum % 2 == 0) {
//			System.out.println("짝!");
//		}else
//		{
//			System.out.println("홀!");			
//		}
		
		
		//강사님 풀이
//		if(sum%2 == 0) {
//		if(first == second) {
//			System.out.println("결과 : 더블!");
//		}else {
//			System.out.println("결과 : 짝!");
//		}
//		}else {
//		System.out.println("결과 : 홀!");
//		}
		
//		------------------------------------------
		
//		임의의 구구단 문제를(2단 부터 15단) 출력하시고
//		사용자로 부터 정답을 입력 받아 보세요
//		기본 점수 : 100
//		정답 : 10점 획득
//		오답 : 5점 감점
//		10단 이상 정답 : 10점 보너스 점수 획득
		
//		Scanner sc = new Scanner(System.in);
//		
//		int baseScore = 100;
//		
//		int first = (int)(Math.random() * 14 + 2);
//		int second = (int)(Math.random() * 9 + 1);
//		
//		int a = first * second;
//		
//		System.out.print(first + " * " + second + " = ");
//		int aUser = sc.nextInt();
//		
//		if(a == aUser) {
//			baseScore = baseScore + 10;
//			System.out.println("정답입니다. 10점 획득하셨습니다.");
//			
//			if(first >= 10) {
//				baseScore = baseScore + 10;
//				System.out.println("10단 이상 문제의 정답을 맞추셔서 보너스 점수 10점을 추가 획득하셨습니다.");
//			}
//		}else {
//			baseScore = baseScore - 5;
//			System.out.println("오답입니다. 5점 감점입니다.");
//		}
//		
//		System.out.println("현재 점수 : " + baseScore);
		
//		------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		
//		char grade = ' ';
//		if(score >= 90)
//			grade = 'A';
//		else {
//			if(score >= 80)
//				grade = 'B';
//			else {
//				if(score >= 70)
//					grade = 'C';
//				else {
//					if(score >= 60)
//						grade = 'D';
//					else
//						grade = 'F';
//				}
//			}
//		}
//		System.out.println("점수 : " + score + "점");
//		System.out.println("등급 : " + grade + "등급");
		
//		------------------------------------------
		
//		중국집 주문서 작성 프로그램
//		짜장면 : 5000원
//		짬뽕면 : 6000원
//		조건 :
//			5그릇 이상 주문 : 3천원 할인
//			10그릇 이상 주문 : 전체 가격의 10%할인
		
		//내 풀이
		Scanner sc = new Scanner(System.in);
		
		int jja = 5000;
		int jjam = 6000;
		
		System.out.print("짜장면 : ");
		int jjaCount = sc.nextInt();
		int jjaSum = jjaCount * jja;
		
		System.out.print("짬뽕 : ");
		int jjamCount = sc.nextInt();
		int jjamSum = jjamCount * jjam;
		
		float cost = jjaSum + jjamSum;
		
		System.out.println("\n***주문 내용***\n");
		System.out.println("[짜장면]\n가격 : 5000원\n주문 : " + jjaCount + "그릇\n");
		System.out.println("[짬뽕]\n가격 : 6000원\n주문 : " + jjamCount + "그릇");
	
		if((jjaCount + jjamCount) >= 5) {
			if((jjaCount + jjamCount) >= 10) {
				cost = cost - (cost  * 0.1f); 
			} else {
			cost = cost - 3000;
			}
		}
		
		System.out.println("\n지불 금액 : " + (int)cost + "원");
		
		
		//강사님 풀이
//		Scanner sc = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("##,###");
//		
//		int jja = 5000;
//		int jjam = 6000;
//		
//		System.out.print("자장면 주문: ");
//		int jjaCount = sc.nextInt();
//		int jjaSum = jjaCount * jja;
//		
//		System.out.print("짬뽕면 주문: ");
//		int jjamCount = sc.nextInt();
//		int jjamSum = jjamCount * jjam;
//		
//		int cost = jjaSum + jjamSum;
//		
//		if(jjaCount + jjamCount >= 5) {
//			if(jjaCount + jjamCount >= 10) {
//				cost -= (int)(cost * 0.1F);
//			}else {
//				cost -= 3000; 
//			}
//		}
//
//		System.out.println("\n***주문 내용***");
//		System.out.println("[짜장면]");
//		System.out.println("가격 : " +df.format(jja)+ "원");
//		System.out.println("주문 : " +df.format(jjaCount)+ "그릇");
//		System.out.println("\n[짬뽕면]");
//		System.out.println("가격 : " +df.format(jjam)+ "원");
//		System.out.println("주문 : " +df.format(jjamCount)+ "그릇");
//				
//		System.out.println("\n지불 금액 : " +df.format(cost)+ "원");
		
	}

}













