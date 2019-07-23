package highchapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String clientStr = "";
		//建立通信端口，并向服务器端发送通信请求
		try {
			Socket s = new Socket("127.0.0.1",4001);
			System.out.println("与服务器端建立连接");
			Send send = new Send(s);
			Thread t1 = new Thread(send);
			t1.start();
			while(true) {
				//获取客户端通信的信息
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				clientStr = br.readLine();
				System.out.println("服务器端说：" + clientStr);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
