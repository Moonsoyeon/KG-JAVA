import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		double dNum = 12345.6789;
		
//		DecimalFormat df = new DecimalFormat("0");
		//������ �Ҽ������� ����������
//		String result = df.format(dNum);
//		System.out.println(result);

//		df = new DecimalFormat("0.0");
		//������ �Ҽ��� ù��° ������
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("000000.00000");
		//������ ���� ���ں��� �ϳ��� ũ�� -> �յڷ� 0�� ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("#");
		//���ڸ� ���� ������
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####");
		//���ڸ� ���� ������, 0���� ä������ ����, ��ȿ�� �����͸��� ���
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("###,###.#####");
		//���ڸ� �� ���� , ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		df = new DecimalFormat("######.#####%");
		//������ ���ڿ� 100�� ����
//		result = df.format(dNum);
//		System.out.println(result);
		
//		------------------------------------------
		
		Date today = new Date();
		System.out.println(today);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//�빮�� M�� ��, �ҹ��� m�� ��
		String strDay = sdf.format(today);
		System.out.println(strDay);

		sdf = new SimpleDateFormat("MM/dd/yy");
		//�빮�� M�� ��, �ҹ��� m�� ��
		strDay = sdf.format(today);
		System.out.println(strDay);
		
		long mSec = System.currentTimeMillis();
		strDay = sdf.format(mSec);
		System.out.println(strDay);

	}

}













