import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int sum = 0;
//		int num = 1;
		
//		for(int start = 1; start <= 10; start++) {
//			System.out.printf("%d + %d = %d\n", sum, start, sum + start);
//			sum = sum + start;
//		}
		
//		------------------------------------------
		
//		int sum = 0;
//		int target = 100;
//		int lineCount = 1;
//		
//		for(int start = 3; start <= target; start = start + 3) {
//			System.out.print(start + " ");
//			
//			//10�� ������ ���� �ٷ�
//			if(lineCount % 10 == 0) {
//				System.out.println();
//			}
//			lineCount++;
//			sum += start;
//		}
//		System.out.println("\n\n1���� 100������ 3�� ����� �� : " + sum);
		
//		------------------------------------------
		
		//1���� 100���� ���� ���
		
//		int target = 100;
		
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i + " ");
//		}
//		System.out.println();
		
//		------------------------------------------
		
		//53���� 25���� ���� ���
		
//		int target = 25;
		
//		for(int i = 53; i >= target; i--) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//30���� 60���� Ȧ�� ���
		
//		for(int i = 30; i <= 60; i = i + 2) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//100���� 0���� 5�� ��� ���
		
//		for(int i = 100; i >= 0; i = i - 5) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//A���� Z���� ����� ������
		
//		for(char i = 'A'; i <= 'Z'; i++) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//1.0���� 3.0���� 0.5������ ����� ������
		
//		for(float i = 1.0F; i <= 3.0F; i = i + 0.5F) {
//			System.out.println(i + " ");
//		}
		
//		------------------------------------------
		
		//���࿡ ������ �մϴ�.
		//ù ���� 1���� �����ϰ�, ���� ���� �ݾ��� 2�踦 ������ ���� �Դϴ�.
		//30�� ���� ����� ���ݾ��� �󸶳� �ɱ��?
		//40�� ���� ����� ���ݾ��� �󸶳� �ɱ��?
		
//		DecimalFormat df = new DecimalFormat("#,###");
//		long bae = 1, account = 1;
//		String strAccount = "";
		
//		for(int i = 2; i <= 40; i++) {
//			bae = bae * 2;
//			account = account + bae;
//			strAccount = df.format(account);
//			System.out.println(i + "���� �ݾ� : " + bae + "��\t\t����� : " + strAccount);
			
//			if(i == 30) {
//				System.out.println(i + "���� �ݾ� : " + bae + "��\t\t����� : " + strAccount);
//			}
//		}
//		System.out.println("40�� ���� �ݾ� : " + strAccount + "��");	
		
//		------------------------------------------
		
		//����ڷ� ���� ���� �Է� �޾Ƽ�
		//�Է¹��� ���� �������� ����� ������
		
//		Scanner sc = new Scanner(System.in);
		
//		int first, second;
//		int result = 0;
		
//		System.out.print("���� �Է� : ");
//		first = sc.nextInt();
		
//		for(second = 1; second <= 9; second++) {
//			result = first * second;
//			System.out.printf("%d * %d = %d\n", first, second, result);
//		}
//		System.out.println();
		
//		------------------------------------------
		
		//2�ܺ��� 9�ܱ��� ����� ������
		
//		int first, second, result = 0;
		
//		for(first = 2; first <= 9; first++) {
//			for(second = 1; second <= 9; second++) {
//				result = first * second;
//				System.out.printf("%d * %d = %d\n", first, second, result);
//			}
//		}
		
//		------------------------------------------
		
		//����ڷκ��� ���� �Է� ��������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int minute = sc.nextInt();
		int second; 
		
		System.out.printf("%d�� 0��\n", minute);
		for(int i = minute - 1; i >= 0; i--) {
			for(second = 59; second >= 0; second--) {
				System.out.printf("%d�� %d��\n", i, second);
			}
		}
		System.out.println("�� ���� ��!!! JAVA!!!");

	}

}

/*


for(int start = 1; start<=10; start++ ){
	���1;
	���2;
	���3;
	
}

*/
