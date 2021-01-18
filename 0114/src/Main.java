import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int visitCount = 1;
		
//		if(visitCount < 1) {
//			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
//		}
		
//		visitCount++;
//		System.out.println("안녕히 가세요.");
		
//		-------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Java[1] / JSP[2] : ");
//		int select = sc.nextInt();
		
//		if(select == 1) {
//			System.out.println("Java 과목 수강 신청 되었습니다.");
//		}
//		if(select == 2) {
//			System.out.println("JSP 과목 수강 신청 되었습니다.");
//		}
		
//		-------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("성별[남자/여자] : ");
//		String gender = sc.next();
		
//		if(gender.contentEquals("남자")) {
//			System.out.println("남성복 코너는 1층 입니다.");
//		} else {
//			System.out.println("여성복 코너는 2층 입니다.");
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
		
//		이름 :
//		출생년도 : 
				
//		나이가 20살 이상이면 => ___님은 성인입니다.
//		나이가 20살 미만이면 => ___님은 미성년입니다.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("출생년도 : ");
		int birth = sc.nextInt();

		int hour = (int)((((System.currentTimeMillis() / 1000) / 60)/ 60) + 9);
		int pyear = hour / 365 / 24 + 1970;
		int age = pyear - birth;
		
		if(age >= 20) {
			System.out.println(name + "님은 성인입니다.");
		} else {
			System.out.println(name + "님은 미성년입니다.");
		}
		
		
	}

}
