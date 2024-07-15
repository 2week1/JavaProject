package com.kh.practice.chat.thread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender implements Runnable {
	private Socket socket;
	
	public ClientSender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try(PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				
				String message = sc.nextLine();
				pw.println(message);
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
