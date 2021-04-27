package lab.sam;

public class Main {

	public static void main(String[] args) {
//		FireCar fc = new FireCar();
//		Ambulance ac = new Ambulance();
		
		//ac = (Ambulance)fc;
		//fc = (FireCar)ac;
		
//		Car car = null;
//		car = fc;
//		
//		System.out.println("car.door : "+car.door);
//		System.out.print("car.method : " );
//		car.method();
//		FireCar fc2 = null;
//		fc2 = (FireCar)car;
		
		//car.drive();
		//car.water();
		//fc2.drive();
		//fc2.water();
//		fc2.drive(fc2);
//		ac.drive(ac);
		
		Buyer b = new Buyer(1000, 0);
		Product p [] = new Product[3];
		
		p[0] = new Tv(100);
		p[1] = new Computer(200);
		p[2] = new Audio(300);
		
		b.buy(p[0]);
		b.buy(p[1]);
		b.buy(p[2]);
		
		System.out.println();
		b.showList();
		
		
	}

}

class Buyer{
	int money;
	int bonusPoint;
	
	Product [] item = new Product[10];
	int idx=0;
	
	Buyer(){
		
	}	
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint; 
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}	
	
	public void buy(Product p) {
		if(getMoney() < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ��ǰ�� ������ �� �����ϴ�.");
			return ;
		}
		money = money - p.getPrice();
		bonusPoint = bonusPoint + p.getBonusPoint();
		
		item[idx++] = p;
		
		System.out.println(p+"��(��) ���� �ϼ̽��ϴ�.");
	}	
	
	public void showList() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) {
				break;
			}
			sum += item[i].getPrice();
			itemList += item[i] + " / ";
		}
		
		System.out.println("���� ����Ʈ : " +itemList);
		System.out.println("�ѱ��� ��� : " +sum+ "����");
		System.out.println("���ʽ�����  : " + getBonusPoint()+ "��");
		System.out.println("���� �ڱ� : " +getMoney()+ "����");
	}
}


class Product{
	int price;
	int bonusPoint;
	
	Product(){
		
	}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}	
}
class Tv extends Product{
	Tv(){		
	}
	Tv(int price){
		super(price);
	}
	
	public String toString() {
		return "Tv";
	}
}
class Audio extends Product{
	Audio(){
		
	}
	Audio(int price){
		super(price);
	}
	
	public String toString() {
		return "Audio";
	}
}
class Computer extends Product{
	Computer(){
		
	}
	Computer(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}
	

class Ambulance extends Car{
	int door = 5;
	
	void method() {
		System.out.println("Ambulance");
	}
	
	void hospital() {
		System.out.println("[�ں深��]");
	}
}

class FireCar extends Car{
	int door = 8;
	
	void method() {
		System.out.println("FireCar");
	}
	
	void water() {
		System.out.println("[�ҹ���]");
	}
}

class Car{
	int door= 4;
	String color;
	
	void method() {
		System.out.println("Car");
	}
	
	void drive(Car c) {
		if( c instanceof Ambulance ) {
			Ambulance ac = (Ambulance)c;
			ac.hospital();
		}else if( c instanceof FireCar) {
			FireCar fc = (FireCar)c;
			fc.water();
		}
		System.out.println("���");
	}
	void park() {
		System.out.println("����");
	}
}