package highchapter5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server2 {
//	2、编写一个简单的socket通讯程序：
//	2.1 客户机程序，从控制台输入字符串，发送到服务器端，并将服务器返回的信息显示出来。
//	2.2 服务器端程序，从客户机接收数据并打印，同时将从标准输入获取的信息发送给客户机
//	2.3 满足一个服务器可以服务多个客户
	
	static List<Socket> list = new ArrayList<Socket>();
	
	public static void main(String[] args) {

		ServerSocket so;
		try {
			so = new ServerSocket(4001);
			System.out.println("服务器启动");
			while(true) {
				Socket s = so.accept();
				System.out.println(s.getInetAddress() + "发送请求");
				list.add(s);
				One o = new One();
				Thread t = new Thread(o);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
