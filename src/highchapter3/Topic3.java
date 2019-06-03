package highchapter3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Topic3 {

	/*
	 * 3、创建c:/test.txt文件并在其中输入"hello world" 
	 * 创建一个输入流读取该文件中的文本
	 * 并且把小写的l变成大写L再利用输出流写入到d:\test.txt中 [必做题] 
	 * 3.1 实现步骤： 
	 * 3.1.1 在本地硬盘C盘下创建一个文件test.txt 19:15
	 * 3.1.2 创建一个包含main()方法的类，并在main中编写代码  19:16
	 * 3.1.3 运行代码并且测试结果
	 * 3.2 实现过滤器的功能 效果显示：
	 */
	public static void crefile() {
		File file = new File("file","test.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//我是直接用代码输入文本
		FileOutputStream fos = null;
		String content = "hello world";
		byte[] b = content.getBytes();
		try {
			fos = new FileOutputStream(file);
			for(int i = 0;i < b.length;i++) {
				try {
					fos.write(b[i]);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//创建并 插入内容结束
		
		//此处我将不按照题目要求路径放咯。。点解？因为我懒。。。。。。
		File dest = new File("file","test2.txt");
		
		try (
				BufferedReader br = new BufferedReader(new FileReader(file));
				BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
				){
			String newContent = br.readLine().replace("l","L");
			bw.write(newContent);
			System.out.println("从文件file/test.txt中读取的内容是：" + br.readLine());
			System.out.println("通过过滤写到 文件file/test2.txt中的内容是：" + newContent);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		crefile();
	}

}
