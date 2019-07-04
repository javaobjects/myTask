package chapter6;

public class Person {
//	5、定义两个类，描述如下： [必做题]
//	5.1定义一个人类Person：
//	5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
//	5.1.2有三个属性：名字、身高、体重
//	5.2定义一个PersonCreate类：
//	5.2.1创建两个对象，分别是zhangsan，33岁，1.73；
	//lishi，44，1.74
//	5.2.2分别调用对象的sayHello()方法。
	
	private String name;//名字
	private Double height;//身高
	private Integer weight;//体重
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Person(String name, Double height, Integer weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	public void sayHello() {
		System.out.println("hello,my name is " +name);
	}

}
