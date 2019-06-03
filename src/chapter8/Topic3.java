package chapter8;

public class Topic3 extends Exception{
	/*
	 * 3. 编写一个方法，比较两个字符串。假如其中一个字符串为空，
	 * 会产生NullPointerException异常，在方法声明中通告该异常，
	 * 并在适当时候触发异常， 然后编写一个程序捕获该异常。
	 */
	
	public static void testString(String string1,String string2) {
		if(string1 == null || string2 == null)
		{
			try {
				throw new NullPointerException();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String string1 = "aaa";
		String string2 = null;
		testString(string1, string2);
	}

}
