 import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int i = 10;
//		char c = 'A';
//		float f = 1.234f;
//		String str = "Hello World!!!";
//		
//		System.out.println(i);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.print(str);
//		System.out.println("Hello Java");
//		
//		System.out.println("\n");
		/* 
		'\' : Escape Sequence Character
		\n  : new line
		\t  : 다음 tab의 위치로 커서 이동
		\\  : 단순한 '\' 문자로 변경
		\'  : 단순한 ' 문자로 변경
		\"  : 단순한 " 문자로 변경
		*/
//		
//		System.out.println("Hello World!!! \nProgram is my life");
//		System.out.println("Hello\tWorld!!! \nProgram\tis\tmy\tlife");
//		System.out.println("1234567812345678123456781234567812345678");
//		System.out.println("a\tHello\tworld\tjava sam\tb\t");
		
		/*
		서식을 제어하는 문자
		% : 서식 명령 기능을 수행하는 문자
		%d(decimal) : 정수
		%f(floating poing) : 실수
		%c(character) : 문자
		%s(String) : 문자열
		*/
//		
//		int i = 10;
//		char c = 'A';
//		float f = 1.234f;
//		String str = "Hello World!!!";
//		
//		System.out.printf("i = %d\n", i);
//		System.out.printf("c = %c\n", c);
//		System.out.printf("f = %f\n", f);
//		System.out.printf("str = %s\n", str);
		/*
		 System.in
		  -표준 입력 스트림
		 System.in.read()
		  -키보드로 부터 입력 받은 값을 byte단위로 읽어 와서 저장
		 System.in.readLine()
		  -키보드로 부터 입력 받은 값을 line단위로 읽어 와서 저장
		 */
//		
//		int i = 10;
//		
//		System.out.print("입력 : ");
//		i = System.in.read();
//		System.out.printf("출력 : %c", i);
//		i = System.in.read();
//		System.out.printf("출력 : %c", i);
		
		/*
		 Scanner 객체
		  -next() : 문자열
		  -nextLine() : 한 줄을 읽어 온다
		  -nextInt() : 정수형 읽어 온다
		  -nextFloat() : 실수형 읽어온다
		 사용법
		 Scanner str = new Scanner();
		 */
//		String message = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("메시지 입력 : ");
//		message = sc.nextLine();
//		System.out.println(message);
		
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.print("이름 입력 : ");
//		String name = sc.nextLine();
//		
//		
//		System.out.print("몸무게 : ");
//		float weight = sc.nextFloat();
//		
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : "+age);
//		System.out.println("몸무게 : "+weight);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자바 점수 : ");
		int javascore = sc.nextInt();
		System.out.print("JSP 점수 : ");
		int jspscore = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("[" + name + "님의 성적]");
		System.out.println("자바 : " + javascore);
		System.out.println("JSP : " + jspscore);
		System.out.println("합계 : " + (javascore + jspscore));
		System.out.println("평균 : " + ((javascore + jspscore)/2));
		
//		자바 점수 :
//		JSP 점수: 
//		이름 입력 :
//		=====================
//		[이름님의 성적]
//		자바 : ___점
//		JSP : ___점
//		합계 : ___점
//		평균 : ___점

	}

}
