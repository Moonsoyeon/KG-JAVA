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
		\t  : ���� tab�� ��ġ�� Ŀ�� �̵�
		\\  : �ܼ��� '\' ���ڷ� ����
		\'  : �ܼ��� ' ���ڷ� ����
		\"  : �ܼ��� " ���ڷ� ����
		*/
//		
//		System.out.println("Hello World!!! \nProgram is my life");
//		System.out.println("Hello\tWorld!!! \nProgram\tis\tmy\tlife");
//		System.out.println("1234567812345678123456781234567812345678");
//		System.out.println("a\tHello\tworld\tjava sam\tb\t");
		
		/*
		������ �����ϴ� ����
		% : ���� ��� ����� �����ϴ� ����
		%d(decimal) : ����
		%f(floating poing) : �Ǽ�
		%c(character) : ����
		%s(String) : ���ڿ�
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
		  -ǥ�� �Է� ��Ʈ��
		 System.in.read()
		  -Ű����� ���� �Է� ���� ���� byte������ �о� �ͼ� ����
		 System.in.readLine()
		  -Ű����� ���� �Է� ���� ���� line������ �о� �ͼ� ����
		 */
//		
//		int i = 10;
//		
//		System.out.print("�Է� : ");
//		i = System.in.read();
//		System.out.printf("��� : %c", i);
//		i = System.in.read();
//		System.out.printf("��� : %c", i);
		
		/*
		 Scanner ��ü
		  -next() : ���ڿ�
		  -nextLine() : �� ���� �о� �´�
		  -nextInt() : ������ �о� �´�
		  -nextFloat() : �Ǽ��� �о�´�
		 ����
		 Scanner str = new Scanner();
		 */
//		String message = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�޽��� �Է� : ");
//		message = sc.nextLine();
//		System.out.println(message);
		
//		System.out.print("���� �Է� : ");
//		int age = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.print("�̸� �Է� : ");
//		String name = sc.nextLine();
//		
//		
//		System.out.print("������ : ");
//		float weight = sc.nextFloat();
//		
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : "+age);
//		System.out.println("������ : "+weight);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڹ� ���� : ");
		int javascore = sc.nextInt();
		System.out.print("JSP ���� : ");
		int jspscore = sc.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		
		System.out.println("[" + name + "���� ����]");
		System.out.println("�ڹ� : " + javascore);
		System.out.println("JSP : " + jspscore);
		System.out.println("�հ� : " + (javascore + jspscore));
		System.out.println("��� : " + ((javascore + jspscore)/2));
		
//		�ڹ� ���� :
//		JSP ����: 
//		�̸� �Է� :
//		=====================
//		[�̸����� ����]
//		�ڹ� : ___��
//		JSP : ___��
//		�հ� : ___��
//		��� : ___��

	}

}
