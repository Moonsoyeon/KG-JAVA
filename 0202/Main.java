package lab.sam;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ExceptionEx eex = new ExceptionEx();
		
		eex.method();
		System.out.println("���α׷� ����");
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
			System.out.println("method()���� ó��");
		}
	}
	void method10() throws Exception {
		method9();
	}
	void method9() throws Exception {
		try {
			throw new Exception("method9()���� ���� �߻�");
		}catch( Exception e) {
			String msg;
			msg = e.getMessage();
			System.out.println(msg);
			System.out.println("method9()���� ó��");
			
			throw e;
		}
	}
	void method8() {
		try {
			System.out.println("method()����");
			return;
			//throw new RuntimeException();
			
		}catch(Exception e) {
			System.out.println("method().catch{}����");
		}finally {
			System.out.println("method().finally{}����");
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
			IOException ioe = new IOException("����� ���� �߻�");
			throw ioe;
		}catch( IOException ioe) {
			System.out.println("����� ���� ó��");
		}
		
		throw new RuntimeException();
		
	}
	void method4() {
		try {
			Exception e = new Exception("����� ���� �߻�");
			throw e;
		}catch( Exception e) {
			System.out.println("����� ���� ó��");
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
				System.out.println("0���� ���� �� �����ϴ�.");
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











