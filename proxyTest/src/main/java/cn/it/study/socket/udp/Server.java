package cn.it.study.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);

		while (true) {
			byte[] by = new byte[1024];

			DatagramPacket dp = new DatagramPacket(by, by.length);

			ds.receive(dp);

			byte[] data = dp.getData();

			String s = new String(data, 0, data.length);

			System.out.println(s);
		}

	}
}
