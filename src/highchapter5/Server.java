package highchapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
	
	//求出字符串的ASCII码之和
	/*0-9对应Ascii 48-57
	 *A-Z 65-90
	 *a-z 97-122
	 *第33～126号(共94个)是字符，其中第48～57号为0～9十个阿拉伯数字
	 */
	public static SumStrAscii(String str) {
//		byte[] bytestr = str.getBytes();
//		int sum = 0;
//		for(int i=0;i<bytestr.length;i++){
//			sum += bytestr[i];
//		}
//		return sum;
		StringBuffer sbu = new StringBuffer();  
	    char[] chars = str.toCharArray();   
	    for (int i = 0; i < chars.length; i++) {  
	        if(i != chars.length - 1)  
	        {  
	            sbu.append((int)chars[i]).append(",");  
	        }  
	        else {  
	            sbu.append((int)chars[i]);  
	        }  
	    }  
	    return sbu;  
	}

	public static void charServer() {
		// 创建服务端套接字
		ServerSocket server = null;
		try {
			server = new ServerSocket(50000);
			//获取客户端的套接字实例
			Socket client=server.accept();
			System.out.println(client);
			
			try(
					BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw=new PrintWriter(new OutputStreamWriter(client.getOutputStream()),true)
							)
			{
				String clientMessage=br.readLine();//接收客户端信息
				/**
				 * 首先得判定数据格式是否正确
				 * 
				 * 此处需要把这个String类型转换成int数组类型
				 */
				System.out.println("client:"+clientMessage);
				String[] strArray = clientMessage.split(",");//将String类型的数字转换成数组
				boolean bl = false;
				//此处可以将元素转换成asii码 数字有专门的asii码范围
				for(int i = 0;i < strArray.length;i++) {
//					System.out.println(strArray[i]);
					if(SumStrAscii(strArray[i])<48 && SumStrAscii(strArray[i]) > 57) {
						bl = true;
						break;
					}
				}
				if(!bl) {
					//此处需要将数组转成字符串
					Arrays.sort(strArray);
					String sortArrayMs = "";
					for(String i:strArray) {
						sortArrayMs += i;
					}
					pw.println(sortArrayMs);
				}else {
					pw.println("数据格式不正确");
				}
				/* pw.flush(); */
			}catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		charServer();
	}
}
