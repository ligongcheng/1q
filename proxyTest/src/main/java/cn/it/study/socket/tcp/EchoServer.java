package cn.it.study.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(12345);
		System.out.println("sever start");
		while(true){
		Socket socket = s.accept();
		new socketThread(socket).start();
		}
	}
}

class socketThread extends Thread {
	
	Socket socket = null;
	
	public socketThread(final Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {

		//System.out.println(Thread.currentThread().getName());
		BufferedReader buf = null;
		PrintWriter printWriter = null;
		try {
			InputStream inputStream = socket.getInputStream();
			OutputStream serverOut = socket.getOutputStream();
			printWriter = new PrintWriter(serverOut,true);
			buf = new BufferedReader(new InputStreamReader(inputStream));


			String st = null;

			while ((st = buf.readLine()) != null) {
				printWriter.println(Thread.currentThread().getName() + " : " + st);
				if("off".equals(st)){
					break;
				}
			}
			
		} catch (IOException e) {
			System.out.println("----------error-------------");
			e.printStackTrace();
		} finally {
				try {
					
					buf.close();
					printWriter.close();
					socket.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}