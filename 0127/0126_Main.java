package lab.sam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		MethodEx mex = new MethodEx();
//		
//		int result = mex.add(3, 4);		
//		System.out.println(result);
//		
//		int [] resArr= {0,0,0};
//		System.out.println(Arrays.toString(resArr));
//		
//		mex.addArr(3, 4, resArr);
//		
//		System.out.println(resArr);
//		System.out.println(Arrays.toString(resArr));
//		Scanner sc = new Scanner(System.in);
//		Calc clc = new Calc();
//		
//		int fNum, sNum;
//		int result=0;
//		String op="";
//		
//		System.out.print("입력 : ");
//		fNum = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.print("연산자 : ");
//		op = sc.nextLine();
//		
//		System.out.print("입력 : ");
//		sNum = sc.nextInt();
//		
//		
//		result = clc.operator(fNum, op, sNum);
//		System.out.printf("%d %s %d = %d", fNum, op, sNum, result);
		KimKangSa kks = new KimKangSa();
		kks.setAge(38);
		
		
		kks.setName("김강사");
		
		String name = kks.getName();
		int age = kks.getAge();
		
//		System.out.println("이름 : "+kks.name);
//		System.out.println("나이 : "+kks.age);
	}
}
class KimKangSa{
	private int age = 28;
	private String name = "김강사";
	
	public void setAge(int age1) {
		if(age1>30) {
			age1 = age;
		}
		age = age1;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name1) {
		name = name1;
	}
	public String getName() {
		return name;
	}
	
}

class Calc{
	int operator(int fNum, String op, int sNum) {
		int result=0;
		
		switch(op) {
		case "+" :
			result = add(fNum, sNum);
			break;
		case "-" :
			result = sub(fNum, sNum);
			break;
		case "*" :
			result = mul(fNum, sNum);
			break;
		case "/" :
			result = div(fNum, sNum);
			break;
		default :
			result = -1;
		}
		
		return result;
	}
	int add(int fNum, int sNum) {
		return fNum + sNum;
	}
	int sub(int fNum, int sNum) {
		return fNum - sNum;
	}
	int mul(int fNum, int sNum) {
		return fNum * sNum;
	}
	int div(int fNum, int sNum) {
		return fNum / sNum;
	}
}

//계산기 클래스
//+, -, *, /
//사용자로 부터 2개의 값과 연산자를 입력 받아
//계산기 클래스를 이용해서 연산된 결과를 출력해 보세요


class MethodEx{
	void addArr(int a, int b, int [] result) {
		result[2] = add(a, b) +100;
		result[0] = a+b;
		result[1] = result[0] + 10;
		
	}

	int add(int a, int b) {
		int sum=0;
		
		sum = a+b;
		
		return sum;
	}
	
}