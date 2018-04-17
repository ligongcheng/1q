package cn.it.jedis.socket.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

	public static void main(String[] args) throws IOException {
		InetAddress laddr = InetAddress.getByName("192.168.1.106");
		// byte[] by = "大家好".getBytes();
		// 读取键盘数据
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		//客户端
		DatagramSocket ds = new DatagramSocket();

		String s = null;

		while ((s = buf.readLine()) != null) {
			if("byby".equals(s)){
				break;
			}
			byte[] by = s.getBytes();
			DatagramPacket dp = new DatagramPacket(by, by.length, laddr, 10086);

			ds.send(dp);
		}
		//封装数据包
		
		ds.close();
	}
}
