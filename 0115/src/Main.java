import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
		
//		DecimalFormat df = new DecimalFormat("0");
		//강제로 소숫점빼기 정수까지만
//		String result = df.format(dNum);
//		System.out.println(result);

//		df = new DecimalFormat("0.0");
		//강제로 소숫점 첫번째 까지만
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("000000.00000");
		//강제로 원래 숫자보다 하나씩 크게 -> 앞뒤로 0이 붙음
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("#");
		//숫자를 보고 정수만
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####");
		//숫자를 보고 정수만, 0으로 채워지지 않음, 유효한 데이터만을 출력
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("###,###.#####");
		//세자리 수 마다 , 찍힘
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####%");
		//원래의 숫자에 100을 곱함
//		result = df.format(dNum);
//		System.out.println(result);
		
//		------------------------------------------
		
		Date today = new Date();
		System.out.println(today);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//대문자 M은 월, 소문자 m은 분
		String strDay = sdf.format(today);
		System.out.println(strDay);

		sdf = new SimpleDateFormat("MM/dd/yy");
		//대문자 M은 월, 소문자 m은 분
		strDay = sdf.format(today);
		System.out.println(strDay);
		
		long mSec = System.currentTimeMillis();
		strDay = sdf.format(mSec);
		System.out.println(strDay);

	}

}













