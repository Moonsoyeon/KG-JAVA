
public class Main {

	public static void main(String[] args) {
//		int [] score = new int[5];
//		
//		for(int i = 0; i < score.length; i++) {
//			score[i] = i + 1;
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println("score[" + i + "] = " + score[i]);
//		}
//		System.out.println();
//		
//		score[0] += 10;
//		score[1] += 20;
//		score[2] += 30;
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println("score[" + i + "] = " + score[i]);
//		}
		
//		------------------------------------------
		
//		int [] card = new int[52];
//		
//		for(int i = 0; i < card.length; i++) {
//			card[i] = i + 1;
//		}
//		
//		int temp = 0;
//		int idx = 0;
//		for(int i = 0; i < 100; i++) {
//			idx = (int)(Math.random() * 52);
//			
//			temp = card[0];
//			card[0] = card[idx];
//			card[idx] = temp;
//		}
//		
//		for(int i = 0; i < card.length; i++) {
//			System.out.print(card[i] + " ");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(card[i] + " ");
//		}
//		System.out.println();
		
//		------------------------------------------
		
		//�ֻ����� 10�� ���� ����� ¦���� Ȧ���� �����Ͽ� ����غ�����
		//¦�� : 2, 4, 4, 4
		//Ȧ�� : 1, 1, 1, 3, 5, 5
		
		//�� Ǯ��
//		int oven = 0, odd = 0;
//		int ovenArr[] = null;
//		int oddArr[] = null;
//			
//		for(int i = 1; i <= 10; i++) {
//			int dice = (int)(Math.random() * 6 + 1);
//			
//			if(dice % 2 == 0) {
//				oven++;
//				ovenArr[oven - 1] = dice;
//			} else {
//				odd++;
//				oddArr[odd - 1] = dice;
//			}
//		}
//		
//		System.out.print("¦�� : ");
//		for(int i = 0; i < ovenArr.length; i++) {
//			System.out.println(ovenArr[i] + ", ");
//		}
//		
//		System.out.println("\nȦ�� : ");
//		for(int i = 0; i < oddArr.length; i++) {
//			System.out.println(oddArr[i] + ", ");
//		}
		
//		------------------------------------------
		
		//����� Ǯ��		
//		int [] dice = new int[10];
//		
//		for(int i = 0; i < dice.length; i++) {
//			int rNum = (int)(Math.random() * 6 + 1);
//			dice[i] = rNum;
//			System.out.print(rNum + " ");
//		}
//		
//		System.out.println("\n");
//		for(int i = 0; i < dice.length; i++) {
//			if(i == 0) {
//					System.out.print("¦�� �ֻ��� : ");
//				}
//			if(dice[i] % 2 == 0) {
//				System.out.print(dice[i] + " ");
//			}
//		}
//		
//		System.out.println();
//		for(int i = 0; i < dice.length; i++) {
//			if(i == 0) {
//					System.out.print("Ȧ�� �ֻ��� : ");
//				}
//			if(dice[i] % 2 != 0) {
//				System.out.print(dice[i] + " ");
//			}
//		}
		
//		------------------------------------------
		
		//����ڰ� ���� �ɼ��� ������ ������
		//�ڵ����� ������ �Ǵ� ���α׷�
		
		//�ɼ� ���� : 5

		//�׸� : ���
		//�׸� : ���
		//�׸� : ������
		//�׸� : �����
		//�׸� : ����
		
		//���õ� �޴��� ������ �Դϴ�.
		
		String[] food = {"���", "���", "������", "�����", "����"};
		
		int i = (int)(Math.random() * 5);
		
		System.out.println("���õ� �޴��� " + food[i] + " �Դϴ�.");
				
	}

}
