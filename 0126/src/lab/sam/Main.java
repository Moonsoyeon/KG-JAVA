package lab.sam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		MethodEx mex = new MethodEx();
		
//		int result = mex.add(3, 4);
//		System.out.println(result);
		
//		int [] resArr = {0, 0, 0};
//		System.out.println(Arrays.toString(resArr));
		
//		mex.addArr(3, 4, resArr);
		
//		System.out.println(resArr);
//		System.out.println(Arrays.toString(resArr));
		
//		------------------------------------------
		
//		Calc calc = new Calc();
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
		
//		System.out.print("a = ");
//		int a = sc.nextInt();
//		System.out.print("b = ");
//		int b = sc.nextInt();
//		System.out.print("연산자 = ");
//		String c = sc.next();
		
//		result = calc.operator(a, c, b);
//		System.out.printf("%d %s %d = %d", a, c, b, result);
		
//		if(c == "+") {
//			int result = calc.add(a, b);
//			System.out.println(a + " + " + b + " = " + result);
//		}else if(c == "-") {
//			int result = calc.sub(a, b);
//			System.out.println(a + " - " + b + " = " + result);
//		}else if(c == "*") {
//			int result = calc.mul(a, b);
//			System.out.println(a + " * " + b + " = " + result);
//		}else if(c == "/") {
//			float result = calc.div(a, b);
//			System.out.println(a + " / " + b + " = " + result);
//		}
		
//		------------------------------------------
		
//		Kim kks = new Kim();
//		kks.age = 38;
//		kks.name = "이강사";
//		kks.setAge(35);
//		kks.getAge();
		
//		System.out.println("이름 : " + kks.name);
//		System.out.println("나이 : " + kks.age);
	}

}

class Kim{
	private int age = 28;
	private String name = "김강사";
	
	public void setAge(int age1) {
		age = age1;
	}
	
	public int getAge() {
		return age;
	}
}

//------------------------------------------

class Calc{
	int operator(int a, String c, int b) {
		int result = 0;
		switch(c) {
		case "+" :
			result = add(a, b);
			break;
		case "-" :
			result = sub(a, b);
			break;
		case "*" :
			result = mul(a, b);
			break;
		case "/" :
			result = div(a, b);
			break;
		default:
			result = -1;
		}
		
		return result;
	}
	
	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
	
}

//------------------------------------------

//class MethodEx{
//	int add(int a, int b) {
//		int sum = 0;		
//		sum = a + b;	
//		return sum;
//	}
	
//	void addArr(int a, int b, int [] result) {
//		result[2] = add(a, b) + 100;
//		result[0] = a + b;
//		result[1] = result[0] + 10;
//	}
//}