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
//		System.out.print("�Է� : ");
//		fNum = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.print("������ : ");
//		op = sc.nextLine();
//		
//		System.out.print("�Է� : ");
//		sNum = sc.nextInt();
//		
//		
//		result = clc.operator(fNum, op, sNum);
//		System.out.printf("%d %s %d = %d", fNum, op, sNum, result);
		KimKangSa kks = new KimKangSa();
		kks.setAge(38);
		
		
		kks.setName("�谭��");
		
		String name = kks.getName();
		int age = kks.getAge();
		
//		System.out.println("�̸� : "+kks.name);
//		System.out.println("���� : "+kks.age);
	}
}
class KimKangSa{
	private int age = 28;
	private String name = "�谭��";
	
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

//���� Ŭ����
//+, -, *, /
//����ڷ� ���� 2���� ���� �����ڸ� �Է� �޾�
//���� Ŭ������ �̿��ؼ� ����� ����� ����� ������


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