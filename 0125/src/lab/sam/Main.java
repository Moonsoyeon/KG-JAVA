package lab.sam;

public class Main {

	public static void main(String[] args) {
//		String name = "�谭��";
//		int age = 28;
//		
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : "+age);
//
//		Info in = new Info();
//		
//		in.name = "�谭��";
//		in.age = 28;
//		
//		System.out.println("�̸� : "+in.name);
//		System.out.println("���� : "+in.age);
		
//		Info in = new Info();
//		
//		in.setData("�谭��", 38);
//		in.disp();
		
		Tv t = new Tv();
		Tv tt = new Tv();
		
		t.powerOn();
		t.setColor("����");
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
			System.out.println(color+"������ ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	void powerOn() {
		power = !power;
		if(power) {
			System.out.println("������ �������ϴ�.");
			System.out.println("���� ä�� : "+ channel);
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	void setChannel(int channel1) {
		if(power) {
			if(channel<0 || channel>120) {
				channel1 = channel;
			}
			channel = channel1;
			System.out.println("���� ä�� :"+channel);
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	void channelUp() {
		if(power) {
			channel++;
			if(channel>120) {
				channel = 0;
			}
			System.out.println("���� ä�� : "+channel);
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	void channelDown() {
		if(power) {
			channel--;
			if(channel<0) {
				channel = 120;
			}
			System.out.println("���� ä�� : "+channel);
			
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	void disp() {
		System.out.println("���� : "+color);
		System.out.println("ä�� : "+channel);
		
		if(power) {
			System.out.println("������ �����ֽ��ϴ�.");
		}else {
			System.out.println("������ �����ֽ��ϴ�.");
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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		
	}

}














