package lab.sam;

public class Main {

	public static void main(String[] args) {
		FireCar fc = new FireCar();
		Ambulance ac = new Ambulance();
		
		//ac = (Ambulance)fc;
		//fc = (FireCar)ac;
		
		Car car = null;
		car = fc;
		
		System.out.println("car.door : "+car.door);
		System.out.print("car.method : " );
		car.method();
//		FireCar fc2 = null;
//		fc2 = (FireCar)car;
		
		//car.drive();
		//car.water();
		//fc2.drive();
		//fc2.water();
//		fc2.drive(fc2);
//		ac.drive(ac);

	}

}

고객 : Buyer
속성 : money, bonusPoint

상품 : Tv, Computer, Audio
	

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