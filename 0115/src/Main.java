import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
		
//		DecimalFormat df = new DecimalFormat("0");
		//������ �Ҽ������� ����������
//		String result = df.format(dNum);
//		System.out.println(result);

//		df = new DecimalFormat("0.0");
		//������ �Ҽ��� ù��° ������
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("000000.00000");
		//������ ���� ���ں��� �ϳ��� ũ�� -> �յڷ� 0�� ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("#");
		//���ڸ� ���� ������
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####");
		//���ڸ� ���� ������, 0���� ä������ ����, ��ȿ�� �����͸��� ���
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("###,###.#####");
		//���ڸ� �� ���� , ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####%");
		//������ ���ڿ� 100�� ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		------------------------------------------
		
//		Date today = new Date();
//		System.out.println(today);
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//�빮�� M�� ��, �ҹ��� m�� ��
//		String strDay = sdf.format(today);
//		System.out.println(strDay);

//		sdf = new SimpleDateFormat("MM/dd/yy");
		//�빮�� M�� ��, �ҹ��� m�� ��
//		strDay = sdf.format(today);
//		System.out.println(strDay);
		
//		long mSec = System.currentTimeMillis();
//		strDay = sdf.format(mSec);
//		System.out.println(strDay);

//		------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�湮 Ƚ�� : ");
//		int visitCount = sc.nextInt();
//		
//		if(visitCount < 2) {
//			System.out.println("ó�� ���̱���. �湮�� �ּż� �����.");
//		}
//		else {
//			if(visitCount >= 10) {
//				System.out.println("���� �޾ư���");
//			}
//			else {
//				System.out.println("�ٽ� �湮�� �ּż� �����");
//			}
//		}
//		
//		visitCount++;
		
//		------------------------------------------
		
//		double rNum = Math.random();
		//a = 97 ...
//		char rChar = (char)(Math.random() * 26 + 97);
//		System.out.println(rChar);
		
//		------------------------------------------
		
//		�ֻ����� 2�� ������
//		�հ谡 ¦�� �� �� : ¦! ���
//		�հ谡 Ȧ�� �� �� : Ȧ! ���
//		�� �ֻ����� ���� ���� �� : ����! ���
		
		//�� Ǯ��
//		int first = (int) (Math.random() * 6 + 1);
//		int second = (int) (Math.random() * 6 + 1);
//		int sum = first + second;
//		
//		System.out.println("ù ��° : " + first + ", �� ��° : " + second + ", �� : " + sum);
//		
//		if(first == second) {
//			System.out.println("����!");
//		}
//		
//		if(sum % 2 == 0) {
//			System.out.println("¦!");
//		}else
//		{
//			System.out.println("Ȧ!");			
//		}
		
		
		//����� Ǯ��
//		if(sum%2 == 0) {
//		if(first == second) {
//			System.out.println("��� : ����!");
//		}else {
//			System.out.println("��� : ¦!");
//		}
//		}else {
//		System.out.println("��� : Ȧ!");
//		}
		
//		------------------------------------------
		
//		������ ������ ������(2�� ���� 15��) ����Ͻð�
//		����ڷ� ���� ������ �Է� �޾� ������
//		�⺻ ���� : 100
//		���� : 10�� ȹ��
//		���� : 5�� ����
//		10�� �̻� ���� : 10�� ���ʽ� ���� ȹ��
		
//		Scanner sc = new Scanner(System.in);
//		
//		int baseScore = 100;
//		
//		int first = (int)(Math.random() * 14 + 2);
//		int second = (int)(Math.random() * 9 + 1);
//		
//		int a = first * second;
//		
//		System.out.print(first + " * " + second + " = ");
//		int aUser = sc.nextInt();
//		
//		if(a == aUser) {
//			baseScore = baseScore + 10;
//			System.out.println("�����Դϴ�. 10�� ȹ���ϼ̽��ϴ�.");
//			
//			if(first >= 10) {
//				baseScore = baseScore + 10;
//				System.out.println("10�� �̻� ������ ������ ���߼ż� ���ʽ� ���� 10���� �߰� ȹ���ϼ̽��ϴ�.");
//			}
//		}else {
//			baseScore = baseScore - 5;
//			System.out.println("�����Դϴ�. 5�� �����Դϴ�.");
//		}
//		
//		System.out.println("���� ���� : " + baseScore);
		
//		------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		int score = sc.nextInt();
//		
//		char grade = ' ';
//		if(score >= 90)
//			grade = 'A';
//		else {
//			if(score >= 80)
//				grade = 'B';
//			else {
//				if(score >= 70)
//					grade = 'C';
//				else {
//					if(score >= 60)
//						grade = 'D';
//					else
//						grade = 'F';
//				}
//			}
//		}
//		System.out.println("���� : " + score + "��");
//		System.out.println("��� : " + grade + "���");
		
//		------------------------------------------
		
//		�߱��� �ֹ��� �ۼ� ���α׷�
//		¥��� : 5000��
//		«�͸� : 6000��
//		���� :
//			5�׸� �̻� �ֹ� : 3õ�� ����
//			10�׸� �̻� �ֹ� : ��ü ������ 10%����
		
		//�� Ǯ��
		Scanner sc = new Scanner(System.in);
		
		int jja = 5000;
		int jjam = 6000;
		
		System.out.print("¥��� : ");
		int jjaCount = sc.nextInt();
		int jjaSum = jjaCount * jja;
		
		System.out.print("«�� : ");
		int jjamCount = sc.nextInt();
		int jjamSum = jjamCount * jjam;
		
		float cost = jjaSum + jjamSum;
		
		System.out.println("\n***�ֹ� ����***\n");
		System.out.println("[¥���]\n���� : 5000��\n�ֹ� : " + jjaCount + "�׸�\n");
		System.out.println("[«��]\n���� : 6000��\n�ֹ� : " + jjamCount + "�׸�");
	
		if((jjaCount + jjamCount) >= 5) {
			if((jjaCount + jjamCount) >= 10) {
				cost = cost - (cost  * 0.1f); 
			} else {
			cost = cost - 3000;
			}
		}
		
		System.out.println("\n���� �ݾ� : " + (int)cost + "��");
		
		
		//����� Ǯ��
//		Scanner sc = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("##,###");
//		
//		int jja = 5000;
//		int jjam = 6000;
//		
//		System.out.print("����� �ֹ�: ");
//		int jjaCount = sc.nextInt();
//		int jjaSum = jjaCount * jja;
//		
//		System.out.print("«�͸� �ֹ�: ");
//		int jjamCount = sc.nextInt();
//		int jjamSum = jjamCount * jjam;
//		
//		int cost = jjaSum + jjamSum;
//		
//		if(jjaCount + jjamCount >= 5) {
//			if(jjaCount + jjamCount >= 10) {
//				cost -= (int)(cost * 0.1F);
//			}else {
//				cost -= 3000; 
//			}
//		}
//
//		System.out.println("\n***�ֹ� ����***");
//		System.out.println("[¥���]");
//		System.out.println("���� : " +df.format(jja)+ "��");
//		System.out.println("�ֹ� : " +df.format(jjaCount)+ "�׸�");
//		System.out.println("\n[«�͸�]");
//		System.out.println("���� : " +df.format(jjam)+ "��");
//		System.out.println("�ֹ� : " +df.format(jjamCount)+ "�׸�");
//				
//		System.out.println("\n���� �ݾ� : " +df.format(cost)+ "��");
		
	}

}













