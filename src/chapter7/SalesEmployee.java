package chapter7;

public class SalesEmployee extends ColaEmployee {
//	4.4  SalesEmployee ：ColaEmployee 的子类，
//	销售人员，工资由月销售额和提成率决定。
//	属性：月销售额、提成率
	
	private int monthSales;//月销售额
	private double royaltyRate;//提成率
	
	public SalesEmployee(String name, int month,int monthSales,double royaltyRate) {
		super(name, month);
		this.monthSales = monthSales;
		this.royaltyRate = royaltyRate;
	}
	
	public double getSalary(int month) {
		if(super.month == month) {
			return monthSales * royaltyRate + 100;
		}else {
			return monthSales * royaltyRate;
		}
	}
}
