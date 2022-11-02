package polymorphism;

public class Customer {
	//멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//생성자
	public Customer() {
		initCustomer();		
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//get()
	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	//set()
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	//메서드
	private void initCustomer() {	//생성자에서만 호출하므로 private으로 선언
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 포인트는 " + bonusPoint + "입니다.";
	}
	
	
	
}







