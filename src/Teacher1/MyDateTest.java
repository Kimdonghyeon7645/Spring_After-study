package Teacher1;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		
//		date.setYear(2019); // private�����Ϳ� ���� ����
//		date.setMonth(77);
//		date.setDay(100);
//		
		date.showDate();
		System.out.println(date);   //***
		
		MyDate m = date.getSelf();
		System.out.println(m);  //***
		
		MyDate date2 = new MyDate();
		date2.setMonth(20); //���� ������ ����
		
		date2.showDate();
	}   

}