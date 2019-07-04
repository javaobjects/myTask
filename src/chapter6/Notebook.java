package chapter6;

public class Notebook {
//	3、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 [必做题]
//	3.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
//	3.2  输出笔记本信息的方法
//	3.3  然后编写一个测试类，测试笔记本类的各个方法。
	private char color;//颜色
	private int cpuModel;//cpu型号
	public Notebook() {
		super();
	}
	public Notebook(char color, int cpuModel) {
		super();
		this.color = color;
		this.cpuModel = cpuModel;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getCpuModel() {
		return cpuModel;
	}
	public void setCpuModel(int cpuModel) {
		this.cpuModel = cpuModel;
	}
	@Override
	public String toString() {
		return "Notebook [color=" + color + ", cpuModel=" + cpuModel + "]";
	}
	
	public static void main(String[] args) {
		Notebook notebook = new Notebook('a',20);
		System.out.println(notebook);
	}
}
