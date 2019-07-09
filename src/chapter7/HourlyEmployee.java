package chapter7;

public class HourlyEmployee extends ColaEmployee {
	
//	4.3  HourlyEmployee ：ColaEmployee 的子类，
//	按小时拿工资的员工，每月工作超出160 小时的部分按照
//	1.5 倍工资发放。属性：每小时的工资、每月工作的小时数
	
	private int hourSalary;//时薪
	private int hourNum;//每月工作的小时数
	
	public HourlyEmployee(String name, int month,int hourSalary,int hourNum) {
		super(name, month);
		this.hourSalary = hourSalary;
		this.hourNum = hourNum;
	}
	
	public double getSalary(int month) {
		
		if(super.month == month) {
			if(hourNum > 160) {
				return hourSalary * 160 + 
						hourSalary * (hourNum - 160) * 1.5
						+ 100;
			}else {
				return hourSalary * hourNum + 100;
			}
		}else {
			if(hourNum > 160) {
				return hourSalary * 160 + 
						hourSalary * (hourNum - 160) * 1.5;
			}else {
				return hourSalary * hourNum;
			}
		}
	}
}
