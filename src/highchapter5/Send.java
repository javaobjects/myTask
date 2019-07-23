package highchapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Send implements Runnable {
	
	Socket s;
	Scanner in = new Scanner(System.in);
	BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in));

	public Send(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		PrintWriter out = null;
		try {
			while(true) {
				out = new PrintWriter
						(new OutputStreamWriter(s.getOutputStream()),true);
				String str = br.readLine();
				out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}
}
