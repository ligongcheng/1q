package cn.it.jedis.socket.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(12345);

		Socket socket = s.accept();

		InputStream inputStream = socket.getInputStream();

		BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));

		BufferedWriter writer = new BufferedWriter(new FileWriter("b.txt"));

		String st = null;

		while ((st = buf.readLine()) != null) {
			writer.write(st);
			writer.newLine();
			writer.flush();
		}
		System.out.println("----------打印完毕-------------");
		writer.close();
		buf.close();
		s.close();
	}
}
