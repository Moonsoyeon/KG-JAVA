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
			System.out.println("잔액이 부족하여 상품을 구매할 수 없습니다.");
			return ;
		}
		money = money - p.getPrice();
		bonusPoint = bonusPoint + p.getBonusPoint();
		
		item[idx++] = p;
		
		System.out.println(p+"을(를) 구매 하셨습니다.");
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
		
		System.out.println("구매 리스트 : " +itemList);
		System.out.println("총구매 비용 : " +sum+ "만원");
		System.out.println("보너스점수  : " + getBonusPoint()+ "점");
		System.out.println("여유 자금 : " +getMoney()+ "만원");
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
		System.out.println("[앰뷸런스]");
	}
}

class FireCar extends Car{
	int door = 8;
	
	void method() {
		System.out.println("FireCar");
	}
	
	void water() {
		System.out.println("[소방차]");
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
		System.out.println("출발");
	}
	void park() {
		System.out.println("정지");
	}
}