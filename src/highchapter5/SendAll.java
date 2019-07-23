package highchapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendAll implements Runnable {

	Scanner in = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void run() {
		PrintWriter out = null;
		try {
			while(true) {
				String str = br.readLine();
				for(Socket s:Server2.list) {
					out = new PrintWriter
							(new OutputStreamWriter(s.getOutputStream()), true);
					out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}
}
