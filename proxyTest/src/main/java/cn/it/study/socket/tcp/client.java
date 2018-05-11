package cn.it.study.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("192.168.1.106", 12345);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		InputStream inputStream = socket.getInputStream();
		BufferedReader serverMsg = new BufferedReader(new InputStreamReader(inputStream));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream,true);
		while (true) {
			String line = reader.readLine();
			printWriter.println(line);
			System.out.println(serverMsg.readLine());
			if ("off".equals(line)) {
				break;
			}
		}
		printWriter.close();
		outputStream.close();
		reader.close();
		socket.close();
	}
}
