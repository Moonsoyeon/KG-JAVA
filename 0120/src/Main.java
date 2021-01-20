import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int sum = 0;
//		int num = 1;
		
//		for(int start = 1; start <= 10; start++) {
//			System.out.printf("%d + %d = %d\n", sum, start, sum + start);
//			sum = sum + start;
//		}
		
//		------------------------------------------
		
//		int sum = 0;
//		int target = 100;
//		int lineCount = 1;
//		
//		for(int start = 3; start <= target; start = start + 3) {
//			System.out.print(start + " ");
//			
//			//10개 넘으면 다음 줄로
//			if(lineCount % 10 == 0) {
//				System.out.println();
//			}
//			lineCount++;
//			sum += start;
//		}
//		System.out.println("\n\n1부터 100까지의 3의 배수의 합 : " + sum);
		
//		------------------------------------------
		
		//1부터 100까지 정수 출력
		
//		int target = 100;
		
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i + " ");
//		}
//		System.out.println();
		
//		------------------------------------------
		
		//53부터 25까지 정수 출력
		
//		int target = 25;
		
//		for(int i = 53; i >= target; i--) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//30부터 60까지 홀수 출력
		
//		for(int i = 30; i <= 60; i = i + 2) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//100부터 0까지 5의 배수 출력
		
//		for(int i = 100; i >= 0; i = i - 5) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//A부터 Z까지 출력해 보세요
		
//		for(char i = 'A'; i <= 'Z'; i++) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//1.0부터 3.0까지 0.5단위로 출력해 보세요
		
//		for(float i = 1.0F; i <= 3.0F; i = i + 0.5F) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//은행에 예금을 합니다.
		//첫 날에 1원을 예금하고, 매일 어제 금액의 2배를 예금할 예정 입니다.
		//30일 동안 저축된 예금액은 얼마나 될까요?
		//40일 동안 저축된 예금액은 얼마나 될까요?
		
//		DecimalFormat df = new DecimalFormat("#,###");
//		long bae = 1, account = 1;
//		String strAccount = "";
		
//		for(int i = 2; i <= 40; i++) {
//			bae = bae * 2;
//			account = account + bae;
//			strAccount = df.format(account);
//			System.out.println(i + "저축 금액 : " + bae + "원\t\t저축액 : " + strAccount);
			
//			if(i == 30) {
//				System.out.println(i + "저축 금액 : " + bae + "원\t\t저축액 : " + strAccount);
//			}
//		}
//		System.out.println("40일 저축 금액 : " + strAccount + "원");	
		
//		------------------------------------------
		
		//사용자로 부터 값을 입력 받아서
		//입력받은 수의 구구단을 출력해 보세요
		
//		Scanner sc = new Scanner(System.in);
		
//		int first, second;
//		int result = 0;
		
//		System.out.print("정수 입력 : ");
//		first = sc.nextInt();
		
//		for(second = 1; second <= 9; second++) {
//			result = first * second;
//			System.out.printf("%d * %d = %d\n", first, second, result);
//		}
//		System.out.println();
		
//		------------------------------------------
		
		//2단부터 9단까지 출력해 보세요
		
//		int first, second, result = 0;
		
//		for(first = 2; first <= 9; first++) {
//			for(second = 1; second <= 9; second++) {
//				result = first * second;
//				System.out.printf("%d * %d = %d\n", first, second, result);
//			}
//		}
		
//		------------------------------------------
		
		//사용자로부터 분을 입력 받으세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		int second; 
		
		System.out.printf("%d분 0초\n", minute);
		for(int i = minute - 1; i >= 0; i--) {
			for(second = 59; second >= 0; second--) {
				System.out.printf("%d분 %d초\n", i, second);
			}
		}
		System.out.println("분 세기 끝!!! JAVA!!!");

	}

}

/*


for(int start = 1; start<=10; start++ ){
	명령1;
	명령2;
	명령3;
	
}

*/
