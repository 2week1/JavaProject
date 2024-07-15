package com.kh.practice.chat.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiver implements Runnable {
	
	private Socket socket;
	
	public ServerReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try(BufferedReader br = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			
			while(true) {
				String message = br.readLine();
				if (message != null)
					System.out.println(socket.getInetAddress().getHostAddress() + " : " + message);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
