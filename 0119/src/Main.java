import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1���� 10������ ���� ���غ�����
//		int sum = 0, num = 0;
//		
//		while(num < 10) {
//			num = num + 1;
//			sum = sum + num;
//		}
//		System.out.println(sum);
		
//		------------------------------------------
		
//		int num = 0;
//		int evenSum = 0, oddSum = 0;
//		String strEven = "", strOdd = "";
//		
//		while(num < 10) {
//			num = num + 1;
//			if(num % 2 == 0) {
//				evenSum = evenSum + num;
//				if(num < 10) {
//					strEven = strEven + num + " + ";
//				}else {
//					strEven = strEven + num + " = ";
//				}
//			}else {
//				oddSum = oddSum + num;
//				if(num < 9) {
//					strOdd = strOdd + num + " + ";
//				}else {
//					strOdd = strOdd + num + " = ";
//				}
//			}
//		}
//		System.out.println(strEven + evenSum);
//		System.out.println(strOdd + oddSum);
		
//		2 + 4 + 6 + 8 + 10 = 30
//		1 + 3 + 5 + 7 + 9 = 25

		
//		------------------------------------------
		
		//������ �Է¹ް�
		//1���� �Է� ���� �� ������ Ȧ���� ������ ����غ�����
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		
//		int target = sc.nextInt();
//		int start = 0;
//		int oddCount = 0;
//		
//		while(start < target) {
//			start++;
//			if(start % 2 != 0) {
//				oddCount++;
//			}
//		}
//		System.out.println("1���� " + target + "������ Ȧ���� ���� : " + oddCount);
		
//		------------------------------------------
		
		//������ �Է� �޾Ƽ�
		//�Է� ���� ���� �������� ����غ�����
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է� : ");
//		int num = sc.nextInt();
//		int result = 0;
//		int start = 0;
//		
//		while(start < 9) {
//			start++;
//			result = start * num;
//			System.out.println(num + " * " + start + " = " + result);
//		}
		
//		------------------------------------------
		
		//2�ܺ��� 9�ܱ��� ����غ�����
		
//		int start = 1;
//		int num = 0;
//		int result = 0;
		
//		while(num < 9) {
//			num++;
//			start = 0;
//			while(start < 9) {
//				start++;
//				result = num * start;
//				System.out.print(num + " * " + start + " = " + result + " \n");
//			}
//		}
//		System.out.println();
		
//		------------------------------------------
		
//		��ǻ�Ͱ� 1���� 100������ ������ ���� �������� ������ ������
//		����ڰ�  ������ ������ ���� �˾� ���纸����
//		
//		[��]   : ����ڰ� ���亸�� ���� ���� �Է��� ���
//		[�ٿ�] : ����ڰ� ���亸�� ���� ���� �Է��� ���
//		[����] : ����ڰ� ������ ������ ���
//		[Ƚ��] : ����ڰ� ���� ��ģ Ƚ��
		
//		Scanner sc = new Scanner(System.in);
//		int answer = (int)(Math.random() *  100 + 1);
//		boolean flag = true;
//		int num, totalcount = 0, upcount = 0, downcount = 0;
		
//		while(flag) {
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt();
			
//			if(answer < num) {
//				System.out.println("[�ٿ�]");
//				downcount++;				
//			}else if(answer > num) {
//				System.out.println("[��]");
//				upcount++;
//			}else {
//				System.out.println("[����]");
//				flag = false;
//			}
//		}
		
//		totalcount = upcount + downcount;

//		System.out.println("�� : " + upcount + "ȸ");
//		System.out.println("�ٿ� : " + downcount + "ȸ");
//		System.out.println("�� : " + totalcount + "ȸ");
		
//		------------------------------------------
		
		//2�� ���� 19�� ���� ������ ������ ������ ���� �ϰ�,
		//����ڰ� ������ ���߱� ���α׷�
		
		//���� 
		//���� : 10�� ȹ��
		//���� : 5�� ����		
		//11�� ���ʹ� ���ʽ����� 10�� ȹ��
		//������ 3�� Ʋ���� ���� ����
		//������ ����� ������
		
		Scanner sc = new Scanner(System.in);
		
		int first = (int)(Math.random() * 18 + 1);
		int second = (int)(Math.random() * 8 + 1);
		int result = first * second;
		int count = 0;
		int score = 100;
		boolean flag = true;
		
		while(flag || count == 3) {
			System.out.print(first + " * " + second + " = ");
			int answer = sc.nextInt();
			
			if(result != answer) {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ 5�� �����Ǿ����ϴ�.");
				count++;
				score = score - 5;
			}else if(result == answer) {
				System.out.println("�����Դϴ�. 10���� ȹ���ϼ̽��ϴ�.");
				score = score + 10;
				
				if(first > 10) {
					System.out.println("11�� �̻��� �������� ������ ���߼����Ƿ� ���ʽ� ���� 10���� ȹ���ϼ̽��ϴ�.");
					score = score + 10;
				}
				
				flag = false;
			}
		}
		
		System.out.println("���� : " + score);
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
�ݺ� �б⹮
���� ���� {
	����1;
	����2;
	����3;
}

while
for
*/