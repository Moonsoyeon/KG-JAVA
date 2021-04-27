package lab.sam;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ExceptionEx eex = new ExceptionEx();
		
		eex.method();
		System.out.println("프로그램 종료");
	}

}

class ExceptionEx{
	void method() {
		try {
			method10();
		}catch( Exception e) {
			String msg;
			msg = e.getMessage();
			System.out.println(msg);
			System.out.println("method()에서 처리");
		}
	}
	void method10() throws Exception {
		method9();
	}
	void method9() throws Exception {
		try {
			throw new Exception("method9()에서 예외 발생");
		}catch( Exception e) {
			String msg;
			msg = e.getMessage();
			System.out.println(msg);
			System.out.println("method9()에서 처리");
			
			throw e;
		}
	}
	void method8() {
		try {
			System.out.println("method()실행");
			return;
			//throw new RuntimeException();
			
		}catch(Exception e) {
			System.out.println("method().catch{}실행");
		}finally {
			System.out.println("method().finally{}실행");
		}
	}
	void method7() {
		method6();
	}
	void method6() {
		try {
			//throw new ArithmeticException();
			System.out.println(0/0);
		}catch( Exception ae) {
			//ae.printStackTrace();
			String msg = ae.getMessage();
			System.out.println(msg);
		}
	}
	void method5() {
		try {
			IOException ioe = new IOException("사용자 예외 발생");
			throw ioe;
		}catch( IOException ioe) {
			System.out.println("사용자 예외 처리");
		}
		
		throw new RuntimeException();
		
	}
	void method4() {
		try {
			Exception e = new Exception("사용자 예외 발생");
			throw e;
		}catch( Exception e) {
			System.out.println("사용자 예외 처리");
		}
	}
	void method3() {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		}catch(ArithmeticException ae) {
			System.out.println(4);			
		}catch( Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
	void method2() {
		int number = 100;
		int result = 0;
		
		int i=0;
		while(i<10) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println( (i+1)+ " : " + result);
			}catch(ArithmeticException ae) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			i++;
		}		
	}
	void method1() {
		try {
			
		}catch(Exception e) {
			
		}
		
		try {
			try {
				
			}catch(Exception e) {
				
			}
		}catch( Exception e) {
			try {
				
			}catch( Exception ee) {
			
			}
		}
	}
}











