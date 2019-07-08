package chapter7;

public class TestShape {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,20,"black");
		rect.showAll();
		
		Circle circle = new Circle(10,"red");
		circle.showAll();
	}

}
