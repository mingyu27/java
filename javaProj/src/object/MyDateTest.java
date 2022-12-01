package object;

class MyDate{
	//멤버변수
	int day;
	int month;
	int year;
	
	//생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if((this.day == date.day) && (this.month == date.month) && (this.year == date.year)) {
				return true;
			} else return false;
		} else return false;
	}

	@Override
	public int hashCode() {
		return day;
	}
	
	
	
	
	
	
}


public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2304);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
	}

}
