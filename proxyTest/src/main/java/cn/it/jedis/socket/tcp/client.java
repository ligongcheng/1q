package cn.it.jedis.socket.tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("192.168.1.106", 12345);

		OutputStream outputStream = socket.getOutputStream();

		InputStream inputStream = new FileInputStream("a.txt");
		int len = 0;
		byte[] b = new byte[1024];

		while ((len = inputStream.read(b)) != -1) {
			outputStream.write(b, 0, len);
		}

		inputStream.close();

		socket.close();
	}
}
