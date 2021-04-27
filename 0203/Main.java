import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
//		ListEx lex = new ListEx();
//		
//		lex.method();
		
//		Buyer b = new Buyer(1000, 0);
//		ArrayList list = new ArrayList();
//		
//		list.add(new Tv());
//		Tv t = (Tv)list.get(0);
//		
//		b.buy((Tv)list.get(0));
//		b.showList();
//		Buyer b = new Buyer(1000, 0);
//		ArrayList<Tv> list = new ArrayList<Tv>();
//		
//		list.add(new Tv());
//		//list.add(new Computer());
//		Tv t = list.get(0);
//		
//		b.buy(list.get(0));
//		b.showList();
//		Buyer b = new Buyer(1000, 0);
//		ArrayList<Product> list = new ArrayList<Product>();
//		
//		list.add(new Product());
//		list.add(new Tv());
//		//list.add(new Computer());
//		Product p = list.get(0);
//		Tv t = (Tv)list.get(1);
//		
//		b.buy(list.get(1));
//		b.showList();
		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		
//		Iterator<String> it = list.iterator();
//		if(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		int ii = 10;
//		int jj = 20;
//		int k = ii+jj;
//		if(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);			
//		}
//		System.out.println("End of while");
//		if(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		System.out.println("프로그램 종료");
//		
//		Object [] objArr = {"1", new Integer(1), "2","2","3","3","4","4"};
//		System.out.println(Arrays.deepToString(objArr));
//		
//		Set set = new HashSet();
//		for(int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		System.out.println(set.toString());
//		System.out.println(set.size());
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		System.out.println();
//		
//		System.out.println(set.contains("2"));
//		
//		set.remove("2");
//		System.out.println(set.toString());
//		
//		set.clear();
//		System.out.println(set.toString());
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("kim kang sa", "1234");
		map.put("kks junior", "5678");
		map.put("kks junior", "6789");
		
	
		while(flag) {
			System.out.println("[아이디와 비밀번호를 입력해 주세요]");
			System.out.print("ID : ");
			String id = sc.nextLine().trim();
			String uid="";
			String mapPass="";
			
			System.out.print("Password : ");
			String password = sc.nextLine().trim();
			
			Set set = map.entrySet();
			Iterator it = set.iterator();
		
			while(it.hasNext()) {			
				Map.Entry me = (Map.Entry)it.next();
				uid = (String)me.getKey();
				
				if(uid.equals(id)) {
					mapPass = (String)me.getValue();
					break;
				}
			}
			if(!uid.equals(id)) {
				System.out.println(id+"가 존재하지 않습니다.");
			
				continue;
			}else {
				if(!mapPass.equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("다시 입력 하세요.");
				}else {
					System.out.println(uid +"님 환영합니다.");
					flag = false;
					break;
				}
			}
				
		}
			
			
//			if(!map.containsKey(id)) {
//				System.out.println(id+"가 존재하지 않습니다.");
//				continue;
//			}else {
//				String mapPass = map.get(id);
//				if(!mapPass.equals(password)) {
//					System.out.println("비밀번호가 일치하지 않습니다.");
//					System.out.println("다시 입력 하세요.");
//				}else {
//					String uid = (String)me.getKey();
//					System.out.println(map.getValue()+"님 환영합니다.");
//					break;
//				}
//			}
		
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


class ListEx{
	void method() {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		list1.add(new Integer(1));
		
		System.out.println("list1 : "+list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		System.out.println("list2 : "+list2);
		
		list2.set(3, "AA");
		System.out.println("list2 : "+list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			Object item = list2.get(i);
			if(list1.contains(item)) {
				list2.remove(i);
			}
		}
		System.out.println();
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		
		list2.clear();
		System.out.println("list2 : "+list2);
	}
}










