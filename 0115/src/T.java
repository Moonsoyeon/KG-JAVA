import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
//		
//		DecimalFormat df = new DecimalFormat("0");		
//		String result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("0.0");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("000000.00000");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("#");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("######.#####");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("###,###.#####");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("######.#####%");
//		result = df.format(dNum);
//		System.out.println(result);
		
//		long mSec = System.currentTimeMillis();
//		Date today = new Date();
//		System.out.println(today);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");		
//		String strDay = sdf.format(today);
//		//System.out.println(strDay);
//		
//		
//		
//		strDay = sdf.format(mSec);
//		System.out.println(strDay);
		
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("방문 횟수 : ");
//		int visitCount = sc.nextInt();
//		
//		if(visitCount<2) {
//			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
//		}else {			
//			if(visitCount>=10) {
//				System.out.println("닭죽 받아가세요.");
//			}else{
//				System.out.println("다시 방문해 주셔서 감사합니다.");
//			}
//		}		
//		visitCount++;

//		double rNum = Math.random();
//		char rChar = (char)(Math.random()*26 + 97);
//		System.out.println(rChar);	
		
//		주사위를 2개 던져서
//		합계가 짝수 일 때 : 짝! 출력
//		합계가 홀수 일 때 : 홀! 출력
//		두 주사위의 값이 같을 때 : 더블! 출력
		
//		int fSpot = (int)(Math.random()*6 + 1);
//		int sSpot = (int)(Math.random()*6 + 1);
//		int rSpot = fSpot + sSpot;
//		
//		System.out.println("첫 번째 주사위 : " + fSpot);
//		System.out.println("두 번째 주사위 : " + sSpot);
//		
//		if(rSpot%2 == 0) {
//			if(fSpot == sSpot) {
//				System.out.println("결과 : 더블!");
//			}else {
//				System.out.println("결과 : 짝!");
//			}
//		}else {
//			System.out.println("결과 : 홀!");
//		}
//
//		임의의 구구단 문제를(2단 부터 15단) 출력하시고
//		사용자로 부터 정답을 입력 받아 보세요
//		기본 점수 : 100
//		정답 : 10점 획득
//		오답 : 5점 감점
//		10단 이상 정답 : 10점 보너스 점수 획득
//		Scanner sc  = new Scanner(System.in);
//		
//		int resCom, fNum, sNum;
//		int resUser;
//		int rScore=10, wScore=5, bScore=10, tScore=100;
//		
//		fNum = (int)(Math.random()*14 + 2);
//		sNum = (int)(Math.random()*9 + 1);
//		resCom = fNum * sNum;
//		
//		System.out.print(fNum+"*"+sNum+" = ");
//		resUser = sc.nextInt();
//		
//		if(resCom == resUser) {
//			System.out.println("정답입니다."+rScore+"점 획득 하셨습니다.");
//			tScore += 10;
//			
//			if(fNum>=10) {
//				System.out.println("보너스 "+rScore+"점 추가 획득 하셨습니다.");
//				tScore += 10;
//			}
//		}else {
//			System.out.println("틀렸습니다. "+wScore+"감점입니다.");
//			tScore -= wScore;
//		}
//		
//		System.out.println("현재 점수 : "+tScore+"점");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		
//		char grade = ' ';
//		
//		if(score >= 90)
//			grade = 'A';
//		else if(score >= 80)
//			grade = 'B';
//		else if(score >= 70)
//			grade = 'C';
//		else if(score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
//		System.out.println("점수 : "+score+"점");
//		System.out.println("등급 : "+grade+"등급");
		
//		중국집 주문서 작성 프로그램
//		짜장면 : 5000원
//		짬뽕면 : 6000원
//		조건 :
//			5그릇 이상 주문 : 3천원 할인
//			10그릇 이상 주문 : 전체 가격의 10%할인
//		Scanner sc = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("##,###");
//		int jjPrice = 5000;
//		int jbPrice = 6000;
//		int dcPrice = 3000;
//		float dcRate = 0.1F;
//		
//		System.out.print("자장면 주문: ");
//		int jjCount = sc.nextInt();
//		int jjCost = jjCount * jjPrice;
//		
//		System.out.print("짬뽕면 주문: ");
//		int jbCount = sc.nextInt();
//		int jbCost = jbCount * jbPrice;
//		
//		int tCount = jjCount + jbCount;
//		int tCost = jjCost + jbCost;
//		
//		if(tCount >= 5) {
//			if(tCount >= 10) {
//				tCost -= (int)(tCost * dcRate);
//			}else {
//				tCost -= dcPrice; 
//			}
//		}
//
//		System.out.println("\n***주문 내용***"); call 400000
//		System.out.println("[짜장면]");
//		System.out.println("가격 : " +df.format(jjPrice)+ "원");
//		System.out.println("주문 : " +df.format(jjCount)+ "그릇");
//		System.out.println("\n[짬뽕면]");
//		System.out.println("가격 : " +df.format(jbPrice)+ "원");
//		System.out.println("주문 : " +df.format(jbCount)+ "그릇");
//				
//		System.out.println("\n지불 금액 : " +df.format(tCost)+ "원");

	}

}





