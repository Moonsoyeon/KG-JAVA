import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int visitCount = 1;
		
//		if(visitCount < 1) {
//			System.out.println("ó�� ���̱���. �湮�� �ּż� �����մϴ�.");
//		}
		
//		visitCount++;
//		System.out.println("�ȳ��� ������.");
		
//		-------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Java[1] / JSP[2] : ");
//		int select = sc.nextInt();
		
//		if(select == 1) {
//			System.out.println("Java ���� ���� ��û �Ǿ����ϴ�.");
//		}
//		if(select == 2) {
//			System.out.println("JSP ���� ���� ��û �Ǿ����ϴ�.");
//		}
		
//		-------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("����[����/����] : ");
//		String gender = sc.next();
		
//		if(gender.contentEquals("����")) {
//			System.out.println("������ �ڳʴ� 1�� �Դϴ�.");
//		} else {
//			System.out.println("������ �ڳʴ� 2�� �Դϴ�.");
//		}
		
//		-------------------------------------------------
		
//		long time = System.currentTimeMillis();
//		long sec = time / 1000;
//		long min = sec / 60;
//		int hour = (int)(min / 60);
//		int day = hour / 24;
//		int year = day / 365;
//		System.out.println(year);
		
//		-------------------------------------------------
		
//		�̸� :
//		����⵵ : 
				
//		���̰� 20�� �̻��̸� => ___���� �����Դϴ�.
//		���̰� 20�� �̸��̸� => ___���� �̼����Դϴ�.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("����⵵ : ");
		int birth = sc.nextInt();

		int hour = (int)((((System.currentTimeMillis() / 1000) / 60)/ 60) + 9);
		int pyear = hour / 365 / 24 + 1970;
		int age = pyear - birth;
		
		if(age >= 20) {
			System.out.println(name + "���� �����Դϴ�.");
		} else {
			System.out.println(name + "���� �̼����Դϴ�.");
		}
		
		
	}

}
