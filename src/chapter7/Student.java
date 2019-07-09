package chapter7;

public class Student {

	int stuNo;//学生学号
	String stuName;//学生姓名
	char stuSex;//学生性别
	int stuAge;//学生年龄
	double stuScore;//学生成绩
	public Student(int stuNo, String stuName, char stuSex, int stuAge, double stuScore) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuScore = stuScore;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuScore=" + stuScore + "]";
	}
}
