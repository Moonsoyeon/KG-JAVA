
public class Main {

	public static void main(String[] args) {
//		boolean boolVar;
//		
//		boolVar = false;
//		System.out.println(boolVar);
//		
//		boolVar = true;
//		System.out.println(boolVar);
//		
//		boolVar = 10>5;
//		System.out.println(boolVar);
		
//		System.out.println(10);
//		
//		int fNum = 10, sNum;
//		
//		sNum = fNum;
//		
//		System.out.println(fNum);
//		System.out.println(sNum);
//		
//		int tNum=10, fthNum=3;
//		
//		System.out.println(tNum=10);
//		
//		byte b = 127;
//		System.out.println(b);
//		
//		b++;
//		System.out.println(b);
//		
//		short s = 32767;
//		System.out.println(s);
//		
//		long l = 0x7fffffffffffffffL;
//		System.out.println(l);
//		
//		l = l+1;
//		System.out.println(l);
//	
//		System.out.println(123.456);
//		
//		float f = 123.456F;
//		double d = 234.567;
//		
//		System.out.println("f=" + f);
//		System.out.println("d=" + d);
		
//		char ch = 'A';
//		char code = '\u0041';
//		
//		System.out.println("ch=" + ch);
//		System.out.println("code=" + code);
//
//		ch = '��';
//		System.out.println("ch=" + ch);
//		
//		ch = '1' + '1';
//		System.out.println("ch=" + ch);
//		
//		String name = "�谭��";
//		System.out.println(name);
//		
//		String str = "����ִ� �ڹ�";
//		System.out.println(str);
//		
//		System.out.println(name+"�� �Բ��ϴ� "+ str);
//		
//		final double pi = 3.141592;
//		double area;
//		int radian = 5;
//		
//		String name = "�谭��";
//		
//		area = radian * radian * pi;
//		
//		System.out.println("������ : " + radian);
//		System.out.println("���� ���� : " + area);
//		
//		int a = 5;
//		int b = 3;
//		
//		System.out.println(a*b/2);
//		System.out.println(a*b/2.0);
//		System.out.println((double)a*(float)b/2);
		//float�� double�� ���� �Ұ���
		//�� ū ���� double�� ��ȯ
		
		byte b = 10;
		int i = b;
		
		System.out.println("b = " + b);
		System.out.println("i = " + i);
		
		i = 1024;
		b = (byte)i;
		//i�� 4byte b�� 1byte
		
		System.out.println("b = " + b);
		// => 1byte�� ���� ©������ (1024 = 10 0000 0000)
		System.out.println("i = " + i);
	}

}