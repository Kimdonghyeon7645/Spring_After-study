package Teacher1;

public class MyDate {
    private String MyName;
	
	private int day; // ���� ������ ���� private ���
	private int month;
	private int year;
	
	private boolean isValid = true;
	
	public MyDate() {
		//this("����", 29, 2, 2019); 
		this("����", 28, 2, 2019); 
		//this("����", 30, 2, 2020); //2) ==============>�����ڿ��� �ٸ� �����ڸ� ȣ����, first statement���� ��
	}
	
	public MyDate(String Myname, int day, int month, int year) {
		this.MyName =Myname; //1)========================> this: �ڽ��� �޸𸮸� ����Ŵ
		setYear(year);
		setMonth(month);
		setDay(day);
			}
	
	public String getMyName() { //Myname�� ��ȣ�Ǿ�� �� ����, �� ������ �ȵǵ��� setter�Լ� �������� ����
		return MyName;
	}
	
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if ( day < 1 || day > 31) {
					isValid = false;
				}
				else {
					this.day = day; //1)==========================> this: �ڽ��� �޸𸮸� ����Ŵ
				}
			break;
			
			case 4: case 6: case 9: case 11:
				if(day < 1 || day > 30) {
					isValid = false;
				}
				else {
					this.day = day; //1)==========================> this: �ڽ��� �޸𸮸� ����Ŵ
				}
			break;
			
			case 2:
				if(( (year % 4 == 0 && year % 100 !=0) || year % 400 == 0)) { //����:1�� 366��
					if(day < 1 || day > 29) {
						isValid = false;
					}
					else {
						this.day = day; //1)==========================> this: �ڽ��� �޸𸮸� ����Ŵ
					}
				}
				else {
						if(day < 1 || day > 28) {
								isValid = false;
						}
						else {
							this.day = day; //1)==========================> this: �ڽ��� �޸𸮸� ����Ŵ
						}
				break;
					
				}
		}
		
		
		
		}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {  //��ȿ ������ üũ
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else 
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {		
		if ( isValid) {
			System.out.println( MyName+ "�� ź������ "+ year + "�� " + month + "�� " + day + "�� �Դϴ�."  );
		}
		else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�");
		}
	}
	
	public MyDate getSelf() {
		return this; //3)====================> �ν��Ͻ� �ڽ��� �ּҸ� ��ȯ
	}
}