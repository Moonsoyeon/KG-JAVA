
public class Main {

	public static void main(String[] args) {
//		byte a = 10;
//		byte b = 10;
//		byte c = (byte)(a + b);
//		System.out.println(a + " + " + b + " = "+ c);
		
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a*b;
//		System.out.println(a + " + " + b + " = " + c);
		
//		long a = 1000000L * 1000000;
//		long b = 1000000 * 1000000L;
		
//		long a = 1000000 * 1000000 / 1000000;
//		long b = 1000000 * 1000000 / 1000000;	
//		System.out.println("a = " + a + ", " + "b = " + b);

//		char c1 = 'a';
//		char c2 = c1;
//		char c3 = ' ';
		
//		int i = c1 + 1; //a 아스키코드 97
//		c3 = (char)(c1 + 1);
		
//		char c4 = 'a' + 1;
//		char c5 = 'a';
//		System.out.println("i = " + i);
//		System.out.println("c3 = " + c3);
//		System.out.println("c4 = " + c4);
	
//		char lower = 'a';
//		char upper = (char)(lower - 32);
		
//		System.out.println(lower + " = " + upper);'
		
//		float pi = 3.141592F;
//		float sPi = (int)(pi * 1000) / 1000F;
		
//		System.out.println(sPi);
		
//		int share = 10 / 8;
//		int remain = 10 % 8;
//		System.out.println("10 / 8 = " + share);
//		System.out.println("10 % 8 = " + remain);
		
//		System.out.println("10 < 5 : " + (10 < 5));
//		System.out.println("'0 != 0 : " + ('0' != 5));
//		System.out.println("'A' == 65 : " + ('A' == 65));
		
//		int num = 5;
//		System.out.println("num > 0 : " + (num > 0));
		
//		String str = "Hello World";
//		String str1 = "Hello Java";
//		String str2 = new String("Hello world");
		
//		System.out.println("str == str1 : " + (str == str1));
//		System.out.println("str.equal(str1) : " + (str.equals(str1)));
		
//		System.out.println("str == str2 : " + (str == str2));
//		System.out.println("str.equal(str2) : " + (str.equals(str2)));
	
//		int a = 10;
//		int b = 20;
		
//		System.out.print(a);
//		a = a + b;
//		System.out.println(" + " + b + " = " + a);걍 ㅎ
		
//		a = 10;
//		b = 20;
//		System.out.print(a);
//		a += b;
//		System.out.println(" + " + b + " = " + a);
		
//		char ch = 'a';
//		System.out.println(ch > 'b' || ch > 96);
//		System.out.println(ch > 'b' && ch > 96);
//		System.out.println(!(ch > 'b' && ch > 96));
//		
//		System.out.println((char)(Math.random() * 127 + 1));
		
//		int fNum;
//		float sNum;
		
//		fNum = 5;
//		++fNum;
//		System.out.println("++fNum = " + fNum);
		
//		fNum = 5;
//		fNum++;
//		System.out.println("fNum++=" + fNum);
		
//		sNum=12.34f;
//		System.out.println("++sNum = " + (++sNum));
		
//		sNum=12.34f;
//		System.out.println("sNum++ = " + (sNum++));
//		System.out.println("sNum = " + (sNum));
		
		int fNum = 10;
		int sNum = -10;
		
		int absFN;
		int absSN;
		
		absFN = (fNum>=0) ? fNum : -fNum;
		absSN = (sNum>=0) ? sNum : -sNum;
		
		System.out.println( fNum+" =|"+absFN+"|");
		System.out.println( sNum+"=|"+absSN+"|");
		
	}
}
