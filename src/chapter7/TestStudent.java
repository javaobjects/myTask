package chapter7;


public class TestStudent {

	public static void main(String[] args) {
		
//		6.3定义一个可容纳5个学生的学生类数组，
//		使用随机数给该数组装入各系学生的对象，
//		然后按如下格式输出数组中的信息：
//		学号:XXXXXXXX 姓名：XXX 性别：X 年龄：XX 综合成绩：XX
		
		Student[] stu_prototype = {
				new EnglishStu(10, "english" + Math.round(10 * Math.random()), '0', 20, 
						Math.round(100 * Math.random()), Math.floor(100 * Math.random()),
						Math.round(100 * Math.random())),
				new ComputerStu(11, "computer" + Math.round(10 * Math.random()), '1',20,
						Math.round(100 * Math.random()), Math.round(100 * Math.random()),
						Math.round(100 * Math.random()), Math.round(100 * Math.random())),
				new LiteratureStu(12, "liter" + Math.round(10 * Math.random()), '0', 20, 
						Math.round(100 * Math.random()), Math.round(100 * Math.random()),
						Math.round(100 * Math.random()), Math.round(100 * Math.random()))
		};
		
		Student[] stu = new Student[5];
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = stu_prototype[(int) Math.round(Math.random() * stu_prototype.length)];
		}
		for (int j = 0; j < stu.length; j++) {
			System.out.println(stu[j].toString());
		}
		
//		Student [stuNo=10, stuName=english2, stuSex=0, stuAge=20, stuScore=71.5]
//		Student [stuNo=11, stuName=computer5, stuSex=1, stuAge=20, stuScore=59.6]
//		Student [stuNo=10, stuName=english2, stuSex=0, stuAge=20, stuScore=71.5]
//		Student [stuNo=10, stuName=english2, stuSex=0, stuAge=20, stuScore=71.5]
//		Student [stuNo=12, stuName=liter8, stuSex=0, stuAge=20, stuScore=49.15]
	}
}
