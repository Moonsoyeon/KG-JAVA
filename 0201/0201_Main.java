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

�� : Buyer
�Ӽ� : money, bonusPoint

��ǰ : Tv, Computer, Audio
	

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