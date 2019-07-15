package highchapter2;

import java.util.ArrayList;
import java.util.Iterator;

public class Topic2 {
//	 2、假设顺序列表ArrayList中存储的元素是整型数字1~5，
//	遍历每个元素，将每个元素顺序输出。 
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//第一种：
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list for: " + list.get(i));
		}
		//第二种：
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("list iterator: " + it.next());
		}
	}
}
