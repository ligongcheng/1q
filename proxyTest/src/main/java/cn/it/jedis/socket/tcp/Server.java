package cn.it.jedis.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(12345);

		Socket socket = s.accept();

		InputStream inputStream = socket.getInputStream();

		BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));

		String st = null;

		while ((st = buf.readLine()) != null) {
			System.out.println(st);
		}
		System.out.println("----------打印完毕-------------");
		buf.close();
		s.close();
	}
}
