package chapter6;

import java.util.Arrays;

public class Student {
//	4、设计一个类Student，该类包括姓名、学号和成绩。
//	设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。
	private String username;//姓名
	private String no;//学号
	private int score;//成绩
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
		super();
	}
	public Student(String username, String no, int score) {
		super();
		this.username = username;
		this.no = no;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", no=" + no + ", score=" + score + "]";
	}
	
	public static void main(String[] args) {
		//模拟多个学生
		Student[] stus = new Student[5];
		
		//为学生数组赋值
		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student("student" + i,i+"",(int)(Math.random()*100));
		}
		System.out.println(Arrays.toString(stus));
		//排序
		ascBubbleSort(stus);
		
		System.out.println(Arrays.toString(stus));
		
	}
	private static void ascBubbleSort(Student[] stus) {
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length -1 - i; j++) {
				if(stus[j].getScore() > stus[j + 1].getScore()) {
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j+1] = temp;
				}
			}
		}
	}
}
