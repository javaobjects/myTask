package highchapter3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 4、在程序中创建一个Student类型的对象，并把对象信息保存到d:/io/student.txt文件中，
	 * 然后再从文件中把Student对象的信息读出显示在控制台上，Student类的描述如下：
	 * 
	 */
	private Integer id;
	private String name;
	private Date birth;
	
	public Student(Integer id, String name, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}
	
	//测试类
	public static void main(String[] args) {
		String birth = "1999-09-12";
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Date dateBirth = null;
		try {
			dateBirth=sf.parse(birth);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Student stu = new Student(100,"suwukong",dateBirth);
		File file = new File("file","stu.txt");
	
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File readFile = new File("file","stu.txt");
		try (
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
				ObjectInput is = new ObjectInputStream(new FileInputStream(readFile));
				)
		{
			os.writeObject(stu);//写入
			Student stu2 = (Student) is.readObject();//读取
			System.out.println(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
