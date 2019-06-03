package highchapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {

	public static void charClient() {
		// 创建客户端套接字
		Socket client=null;
		try {
			client=new Socket("localhost", 50000);
			
			SocketAddress address=client.getRemoteSocketAddress();
			
			System.out.println(address.toString());
			
			//客户端先打招呼
			try(PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
					BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream())))
			{
				pw.println("8,3,2,1,9,7,5,4,6,a");//向服务端发送信息
				String serverMessage=br.readLine();//接收服务端信息
				System.out.println("this is server message");
				System.out.println("server:"+serverMessage);
			}catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		charClient();
	}
}
