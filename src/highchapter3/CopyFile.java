package highchapter3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void cyfile() {
		File source = new File("file","abc.txt");
		//判断是否有源文件。如果没有则创建一个
		if(!source.exists()) {
			try {
				source.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//目标文件不用判断会自动创建
		File dest = new File("file","file.txt");
		try(
				BufferedReader br = new BufferedReader(new FileReader(source));
				BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
				) {
			String content = null;
			while((content = br.readLine()) != null) {
				bw.write(content);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		cyfile();
	}
}
