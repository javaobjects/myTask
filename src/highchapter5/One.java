package highchapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class One implements Runnable {

	@Override
	public void run() {
		Socket s = Server2.list.get(Server2.list.size() - 1);
		String str = "";
		SendAll sendAll = new SendAll();
		Thread t1 = new Thread(sendAll);
		t1.start();
		try {
			while(true) {
				BufferedReader br = new BufferedReader
						(new InputStreamReader(s.getInputStream()));
				str = br.readLine();
				System.out.println("客户端" + s.getInetAddress() + "说: " +str);
			}
		} catch (IOException e) {
			System.out.println(s.getInetAddress() + "用户下线");
			Server2.list.remove(s);
		}
	}
}
