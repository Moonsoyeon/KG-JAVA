package lab.sam;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Scanner sc = new Scanner(System.in);
//		Time tm = new Time();
//		
//		System.out.print("시간 입력 : "); 
//		int hour = sc.nextInt();
//		
//		System.out.print("분 입력 : "); 
//		int minute = sc.nextInt();
//		minute = hour*60 + minute;
//		
//		System.out.print("초 입력 : "); 
//		int second = sc.nextInt();
//		second = minute*60 + second;
//		
//		for(int i=hour; i>=0; i--) {
//			tm.setHour(i);
//			
//			for(int j=minute%60; j>=0; j--) {
//				tm.setMinute(j);
//				
//				for(int k=second%60; k>=0; k--) {
//					tm.setSecond(k);
//					tm.dispTime();
//					
//					Thread.sleep(1000);
//					second--;
//				}
//				minute--;
//			}
//		}
//		
//		System.out.println("즐거운 자바!!!코로나 끝내자!!!");
		
//		MethodOverLoading mol = new MethodOverLoading();
//		long result=0;
//		
//		result = mol.add(3, 4);		
//		System.out.println(result);
//		
//		result = mol.add(3L, 4);		
//		System.out.println(result);
//		
//		result = mol.add(3, 4L);		
//		System.out.println(result);
//		
//		result = mol.add(3L, 4L);		
//		System.out.println(result);
//		
//		int [] a = {1,2,3,4,5};
//		result = mol.add(a);
//		System.out.println(result);
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
		System.out.println("d1.value : "+d1.value);
		System.out.println("d2.value : "+d2.value);
	}

}

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2() {
		System.out.println("Data2()");
		value= 10;
	}
}

class MethodOverLoading{
	long add(int a, int b) {
		System.out.println("add(int a, int b)");
		return a+b;
	}
	long add(long a, int b) {
		System.out.println("add(long a, int b)");
		return a+b;
	}
	long add(int a, long b) {
		System.out.println("add(int a, long b)");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("add(long a, long b)");
		return a+b;
	}
	
	int add(int [] a) {
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		System.out.println("add(int [] a)");
		
		return result;
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour1) {
		hour = hour1;
	}
	public void setMinute(int minute1) {
		minute = minute1;
	}
	public void setSecond(int second1) {
		second = second1;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void dispTime() {
		System.out.print(getHour()+"시간 ");
		System.out.print(getMinute()+"분 ");
		System.out.println(getSecond()+"초");
	}
}





















