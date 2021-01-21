
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
		
		//주사위를 10번 던진 결과를 짝수와 홀수로 구분하여 출력해보세요
		//짝수 : 2, 4, 4, 4
		//홀수 : 1, 1, 1, 3, 5, 5
		
		//내 풀이
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
//		System.out.print("짝수 : ");
//		for(int i = 0; i < ovenArr.length; i++) {
//			System.out.println(ovenArr[i] + ", ");
//		}
//		
//		System.out.println("\n홀수 : ");
//		for(int i = 0; i < oddArr.length; i++) {
//			System.out.println(oddArr[i] + ", ");
//		}
		
//		------------------------------------------
		
		//강사님 풀이		
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
//					System.out.print("짝수 주사위 : ");
//				}
//			if(dice[i] % 2 == 0) {
//				System.out.print(dice[i] + " ");
//			}
//		}
//		
//		System.out.println();
//		for(int i = 0; i < dice.length; i++) {
//			if(i == 0) {
//					System.out.print("홀수 주사위 : ");
//				}
//			if(dice[i] % 2 != 0) {
//				System.out.print(dice[i] + " ");
//			}
//		}
		
//		------------------------------------------
		
		//사용자가 여러 옵션을 설정해 놓으면
		//자동으로 선택이 되는 프로그램
		
		//옵션 개수 : 5

		//항목 : 김밥
		//항목 : 라면
		//항목 : 떡볶이
		//항목 : 자장면
		//항목 : 순대
		
		//선택된 메뉴는 떡볶이 입니다.
		
		String[] food = {"김밥", "라면", "떡볶이", "자장면", "순대"};
		
		int i = (int)(Math.random() * 5);
		
		System.out.println("선택된 메뉴는 " + food[i] + " 입니다.");
				
	}

}
