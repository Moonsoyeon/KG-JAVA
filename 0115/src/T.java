import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
//		
//		DecimalFormat df = new DecimalFormat("0");		
//		String result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("0.0");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("000000.00000");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("#");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("######.#####");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("###,###.#####");
//		result = df.format(dNum);
//		System.out.println(result);
//		
//		df = new DecimalFormat("######.#####%");
//		result = df.format(dNum);
//		System.out.println(result);
		
//		long mSec = System.currentTimeMillis();
//		Date today = new Date();
//		System.out.println(today);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");		
//		String strDay = sdf.format(today);
//		//System.out.println(strDay);
//		
//		
//		
//		strDay = sdf.format(mSec);
//		System.out.println(strDay);
		
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("�湮 Ƚ�� : ");
//		int visitCount = sc.nextInt();
//		
//		if(visitCount<2) {
//			System.out.println("ó�� ���̱���. �湮�� �ּż� �����մϴ�.");
//		}else {			
//			if(visitCount>=10) {
//				System.out.println("���� �޾ư�����.");
//			}else{
//				System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
//			}
//		}		
//		visitCount++;

//		double rNum = Math.random();
//		char rChar = (char)(Math.random()*26 + 97);
//		System.out.println(rChar);	
		
//		�ֻ����� 2�� ������
//		�հ谡 ¦�� �� �� : ¦! ���
//		�հ谡 Ȧ�� �� �� : Ȧ! ���
//		�� �ֻ����� ���� ���� �� : ����! ���
		
//		int fSpot = (int)(Math.random()*6 + 1);
//		int sSpot = (int)(Math.random()*6 + 1);
//		int rSpot = fSpot + sSpot;
//		
//		System.out.println("ù ��° �ֻ��� : " + fSpot);
//		System.out.println("�� ��° �ֻ��� : " + sSpot);
//		
//		if(rSpot%2 == 0) {
//			if(fSpot == sSpot) {
//				System.out.println("��� : ����!");
//			}else {
//				System.out.println("��� : ¦!");
//			}
//		}else {
//			System.out.println("��� : Ȧ!");
//		}
//
//		������ ������ ������(2�� ���� 15��) ����Ͻð�
//		����ڷ� ���� ������ �Է� �޾� ������
//		�⺻ ���� : 100
//		���� : 10�� ȹ��
//		���� : 5�� ����
//		10�� �̻� ���� : 10�� ���ʽ� ���� ȹ��
//		Scanner sc  = new Scanner(System.in);
//		
//		int resCom, fNum, sNum;
//		int resUser;
//		int rScore=10, wScore=5, bScore=10, tScore=100;
//		
//		fNum = (int)(Math.random()*14 + 2);
//		sNum = (int)(Math.random()*9 + 1);
//		resCom = fNum * sNum;
//		
//		System.out.print(fNum+"*"+sNum+" = ");
//		resUser = sc.nextInt();
//		
//		if(resCom == resUser) {
//			System.out.println("�����Դϴ�."+rScore+"�� ȹ�� �ϼ̽��ϴ�.");
//			tScore += 10;
//			
//			if(fNum>=10) {
//				System.out.println("���ʽ� "+rScore+"�� �߰� ȹ�� �ϼ̽��ϴ�.");
//				tScore += 10;
//			}
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�. "+wScore+"�����Դϴ�.");
//			tScore -= wScore;
//		}
//		
//		System.out.println("���� ���� : "+tScore+"��");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		int score = sc.nextInt();
//		
//		char grade = ' ';
//		
//		if(score >= 90)
//			grade = 'A';
//		else if(score >= 80)
//			grade = 'B';
//		else if(score >= 70)
//			grade = 'C';
//		else if(score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
//		System.out.println("���� : "+score+"��");
//		System.out.println("��� : "+grade+"���");
		
//		�߱��� �ֹ��� �ۼ� ���α׷�
//		¥��� : 5000��
//		«�͸� : 6000��
//		���� :
//			5�׸� �̻� �ֹ� : 3õ�� ����
//			10�׸� �̻� �ֹ� : ��ü ������ 10%����
//		Scanner sc = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("##,###");
//		int jjPrice = 5000;
//		int jbPrice = 6000;
//		int dcPrice = 3000;
//		float dcRate = 0.1F;
//		
//		System.out.print("����� �ֹ�: ");
//		int jjCount = sc.nextInt();
//		int jjCost = jjCount * jjPrice;
//		
//		System.out.print("«�͸� �ֹ�: ");
//		int jbCount = sc.nextInt();
//		int jbCost = jbCount * jbPrice;
//		
//		int tCount = jjCount + jbCount;
//		int tCost = jjCost + jbCost;
//		
//		if(tCount >= 5) {
//			if(tCount >= 10) {
//				tCost -= (int)(tCost * dcRate);
//			}else {
//				tCost -= dcPrice; 
//			}
//		}
//
//		System.out.println("\n***�ֹ� ����***"); call 400000
//		System.out.println("[¥���]");
//		System.out.println("���� : " +df.format(jjPrice)+ "��");
//		System.out.println("�ֹ� : " +df.format(jjCount)+ "�׸�");
//		System.out.println("\n[«�͸�]");
//		System.out.println("���� : " +df.format(jbPrice)+ "��");
//		System.out.println("�ֹ� : " +df.format(jbCount)+ "�׸�");
//				
//		System.out.println("\n���� �ݾ� : " +df.format(tCost)+ "��");

	}

}





