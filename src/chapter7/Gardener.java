package chapter7;

public class Gardener {
	public Fruit create(String fruitName) {
		
		Fruit f = null;
		switch (fruitName) {
		case "apple":
			f = new Apple();
			break;
		case "pear":
			f = new Pear(); 
		case "oranges":
			f = new Oranges();
		default:
			System.out.println(fruitName);
			break;
		}
		return f;
	}
}
