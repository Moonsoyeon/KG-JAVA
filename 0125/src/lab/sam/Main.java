package lab.sam;

public class Main {

	public static void main(String[] args) {
//		String name = "김강사";
//		int age = 28;
//		
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : "+age);
//
//		Info in = new Info();
//		
//		in.name = "김강사";
//		in.age = 28;
//		
//		System.out.println("이름 : "+in.name);
//		System.out.println("나이 : "+in.age);
		
//		Info in = new Info();
//		
//		in.setData("김강오", 38);
//		in.disp();
		
		Tv t = new Tv();
		Tv tt = new Tv();
		
		t.powerOn();
		t.setColor("빨강");
		t.setChannel(117);
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		
		t.channelDown();
		t.channelDown();
		t.channelDown();
		t.channelDown();
		
		t.powerOn();
		
		t.disp();

		t.channelDown();
		t.channelDown();
		
		t.disp();
		tt.disp();
	}
}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void setColor(String color1) {
		if(power) {
			color = color1;
			System.out.println(color+"색으로 변경 되었습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	void powerOn() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
			System.out.println("현재 채널 : "+ channel);
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	void setChannel(int channel1) {
		if(power) {
			if(channel<0 || channel>120) {
				channel1 = channel;
			}
			channel = channel1;
			System.out.println("현재 채널 :"+channel);
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	void channelUp() {
		if(power) {
			channel++;
			if(channel>120) {
				channel = 0;
			}
			System.out.println("현재 채널 : "+channel);
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	void channelDown() {
		if(power) {
			channel--;
			if(channel<0) {
				channel = 120;
			}
			System.out.println("현재 채널 : "+channel);
			
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	void disp() {
		System.out.println("색상 : "+color);
		System.out.println("채널 : "+channel);
		
		if(power) {
			System.out.println("전원이 켜져있습니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
}

class Info{
	String name;
	int age;
	
	void setData(String name1, int age1) {
		name = name1;
		age = age1;
	}
	
	void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
	}

}














