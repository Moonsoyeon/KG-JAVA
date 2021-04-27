package lab.sam;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Car c1 = new Car("����", "Manual", 2);
//		Car c2 = new Car("����", "auto", 4);
//		
//		System.out.println("[car1�� ����]");
//		c1.disp();
//		
//		System.out.println();
//		System.out.println("[car2�� ����]");
//		c2.disp();
//		
//		c1.setColor("�Ķ���");
//		c2.setColor("���ֻ�");
		
//		KimKangSa kks = new KimKangSa("�谭��");
//		
//		kks.setName("�谭��");
//		kks.setAge(28);
//		kks.disp();
//		System.out.println();
//		
//		KimKangSa kj = new KimKangSa("�谭��", 15);
//		kj.setName("�谭��");
//		//kj.setAge(18);
//		kj.disp();
		
//		����Ʈ�� Ŭ������ ����� �Ʒ� ������ ����� �ּ���
//			Name	Telecom	Price
//		[1] G8		LG		80����
//		[2] ������8	KT		85����
//		[3] Note10	SKT		95����
		
//		Mobile m1 = new Mobile("G8", "LG", 80);
//		Mobile m2 = new Mobile("������8", "KT", 85);
//		Mobile m3 = new Mobile("Note10", "SKT", 95);
//	
//		m1.disp();
//		System.out.println();
//		m2.disp();
//		System.out.println();
//		m3.disp();
//		System.out.println();
//		
//		Mobile [] marr = new Mobile[] {m1, m2, m3};
//		System.out.println("\tName\tTelecom\tPrice");
//		for(int i=0; i<marr.length; i++) {
//			marr[i].disp(i+1);
//		}
		
//		InitEx ie1 = new InitEx();		
//		System.out.println("main().staticVal : "+ie1.staticVal);
//		System.out.println("main().instanceVal : "+ie1.instanceVal);
//		System.out.println("main().arr : "+Arrays.toString(ie1.arr) );
//		System.out.println();
//		
//		InitEx ie2 = new InitEx();		
//		System.out.println("main().staticVal : "+ie2.staticVal);
//		System.out.println("main().instanceVal : "+ie2.instanceVal);
//		System.out.println("main().arr : "+Arrays.toString(ie2.arr) );
//		System.out.println();
//
//		System.out.println("main().staticVal : "+ie1.staticVal);
//		System.out.println("main().instanceVal : "+ie1.instanceVal);
//		System.out.println("main().arr : "+Arrays.toString(ie1.arr) );
//		System.out.println();
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		Product [] pArr = {p1, p2, p3, p4};
		
		Product.disp(pArr);
		
	}
}

class Product{
	private int serialNum;
	private static int count;
	
	static {
		count = 100000;
	}
	{
		count++;
		serialNum = count;
	}
	
	Product(){
		
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}
	
	public static void disp(Product [] pArr) {
		for(int i=0; i<pArr.length; i++) {
			System.out.print("[Product " +(i+1)+ "]�� ��ǰ��ȣ :");
			System.out.println(pArr[i].getSerialNum());
		}
		
		System.out.println("\n[ �� ��ǰ �� : "+ (Product.getCount()-100000) +"]");
	}
	
}

class InitEx{
	int instanceVal = 1;
	static int staticVal = 1;
	int [] arr = new int[10];
	
	static{
		staticVal = 10000;
		System.out.println("static{}.staticVal : "+staticVal);
	}
	{
		instanceVal += 10;
		staticVal++;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10 +1);
		}
		
		System.out.println("Instance{}.staticVal : "+staticVal);
		System.out.println("Instance{}.instanceVal : "+instanceVal);
	}
	
	InitEx(){
		instanceVal += 100;
		staticVal++;		
		System.out.println("InitEx().staticVal : "+staticVal);
		System.out.println("InitEx().instanceVal : "+instanceVal);
	}
}

class Mobile{
	private String name;
	private String tel;
	private int price;
	
	Mobile(){
		
	}
	Mobile(String name){
		this.name = name;
	}
	Mobile(String name, String tel, int price){
		this.name = name;
		this.tel = tel;
		this.price = price;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public String getTel() {
		return this.tel;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void disp() {
		System.out.println("�̸� : " + getName());
		System.out.println("��Ż� : " + getTel());
		System.out.println("���� : " + getPrice()+"����");
	}
	public void disp(int i) {
		System.out.print("["+i+"]\t"+getName()+"\t"+getTel());
		System.out.println("\t"+getPrice()+"����");
	}
	
}

class KimKangSa{
	private String name;
	private int age;
	
	KimKangSa(String name){
		System.out.println(name+"�� �����մϴ�.");
	}
	KimKangSa(String name, int age){
		System.out.println(name+"�� �����մϴ�.");
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void disp() {
		System.out.println("�̸� : "+getName());
		System.out.println("���� : "+getAge());
	}
}

class Car{
	private String color;
	private String gearType;
	private int door;
	
	Car(String color1, String gearType1, int door1){
		color = color1;
		gearType = gearType1;
		door = door1;
	}
	
	public void setColor(String color1) {
		this.color = color1;	
	}
	public void setGearType(String gearType1) {
		this.gearType = gearType1;
	}
	public void setDoor(int door1) {
		this.door = door1;
	}
	
	public String getColor() {
		return color;
	}
	public String getGearType() {
		return gearType;
	}
	public int getDoor() {
		return door;
	}
	
	public void disp() {
		System.out.println("���� : "+getColor());
		System.out.println("���Ÿ�� : "+getGearType());
		System.out.println("����Ÿ�� : "+getDoor());
	}
	
	
}









