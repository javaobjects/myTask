package chapter7;

public class SalariedEmployee extends ColaEmployee {
//	4.2  SalariedEmployee ：	ColaEmployee 的子类，
	//拿固定工资的员工。属性：月薪
	
	double monSalary;//月薪
	public SalariedEmployee(String name,int month,double monsalary) {
		super(name,month);
		this.monSalary = monsalary;
	}
	public double getSalary(int month) {
		if(super.month == month) {//过生日
			return monSalary + 100;
		}else {
			return monSalary;
		}
	}
}
