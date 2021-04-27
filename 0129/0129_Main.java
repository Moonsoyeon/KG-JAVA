package lab.sam;

public class Main {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.age = 38;
//		p.disp();
//		
//		
//		Child c1 = new Child();
//		c1.age = 28;
//		c1.disp();
//		
//		Child1 c2 = new Child1();
//		c2.age = 25;
//		c2.disp();
//		
//		GrandChile gc = new GrandChile();
//		gc.age = 18;
//		gc.disp();
		
		//Child c = new Child();
		//c.disp();
		
//		Student st = new Student("�谭��", 28, 2020, 3.14F);
//		Worker man = new Worker("��ȣ��", 25, "Project Manager", 7);
//		
//		st.disp();
//		System.out.println();
//		man.disp();
		
		AreaEx aex = new AreaEx(3, 4);
		aex.disp();
	}
}

abstract class AbsEx{
	int name;
	abstract void disp();
}

class CAbsEx extends AbsEx{
	int name;
	void disp() {
		System.out.println(name);
	}
}
 
class CCAbsEx  extends AbsEx{
	int name;
	void disp() {
		System.out.println(name);
	}
}
class CCCAbsEx  extends AbsEx{
	int name;
}
//class CAreaEx extends AreaEx{
//	int area;
//	
////	public void setArea(int height) {
////		int width = 100;
////			
////		area = width * height;		
////	}
//	
//}
final class AreaEx{
	final private int WIDTH;
	private int height;
	private int area;
	
	AreaEx(){
		WIDTH = 10;
	}

	AreaEx(int width, int height){
		this.WIDTH = width;
		this.height = height;
		this.area = width * height;
	}
	public int getWIDTH(){
		return WIDTH;
	}
//	public void setWidth(int width) {
//		this.width = width;
//	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	final public void setArea(int height) {
		this.area = this.WIDTH * height;
	}
	
	public void disp() {
		System.out.println("�ʺ� : " + getWIDTH());
		System.out.println("���� : " + getHeight());
		System.out.println("���� : " + getArea());		
	}
	
}


class Worker extends Person{
	String position;
	int salary;
	
	Worker(){
		
	}
	Worker(String name, int age, String position, int salary){
		super.name = name;
		super.age = age;
		this.position = position;
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void disp() {
		super.disp();
		System.out.println("��å : " + getPosition());
		System.out.println("���� : " + getSalary()+ "õ����");
	}
}

class Student extends Person{
	int hakbun;
	float hakjum;
	
	Student(){
		
	}
	Student(String name, int age, int hakbun, float hakjum){
		super(name, age);
		this.hakbun = hakbun;
		this.hakjum = hakjum;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public float getHakjum() {
		return hakjum;
	}
	public void setHakjum(float hakjum) {
		this.hakjum = hakjum;
	}
	
	public void disp() {
		super.disp();
		System.out.println("�й� : " + getHakbun());
		System.out.println("���� : " + getHakjum());
	}
}
class Person{
	String name;
	int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void disp() {
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
	}
	
}

class Parent{
	int age = 48;
	
	Parent(){
		
	}
	Parent(int age){
		System.out.println("Parent()");
	}
	void disp() {
		System.out.println("Parent.disp()");
		System.out.println("���� : " +age+ "��");
	}
}

class Child extends Parent{
	int age = 38;
	
	Child(){
		super(38);
		age=48;
	}
	void disp() {
		int age = 28;
		System.out.println("Child.disp()");
		System.out.println("age : " +age+ "��");	
		System.out.println("this.age : " +this.age+ "��");	
		System.out.println("super.age : " +super.age+ "��");	
		super.disp();
	}
}
class Child1 extends Parent{
	void disp() {
		System.out.println("Child1.disp()");
		System.out.println("���� : " +age+ "��");	
	}
	
}

class GrandChile extends Child{
	void disp() {
		System.out.println("GrandChile.disp()");
		System.out.println("���� : " +age+ "��");	
	}
	
}







