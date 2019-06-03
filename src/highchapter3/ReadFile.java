package highchapter3;

import java.io.File;

public class ReadFile {
	/*
	 * 1、在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，
	 * 列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：
	 * 路径是xxx的文件夹内的文件有：
	 * 
	 */
	static int totol = 0;
	static int dirTotol = 0;
	static String showFile(String path) {
		File file = new File(path);
		String [] fileArr = file.list();
		for(int i=0;i<fileArr.length;i++) {
			String nowPath = path+"\\"+fileArr[i];
			File file1 = new File(nowPath);
			if(file1.isDirectory()) {
				showFile(nowPath);
				dirTotol++;
			}
			else {
				System.out.println("文件名:"+file1.getName());
				System.out.println("路径名:"+nowPath);
				totol++;
				System.out.println("-------------------------------------");
			}
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println("列出该文件夹中的所有文件的文件名和文件的路径");
		showFile("D:\\\\Sublime");
		System.out.println("总共有"+totol+"个文件,文件夹有"+dirTotol+"个");
	}
}
