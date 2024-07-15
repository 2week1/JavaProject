package com.kh.practice.chat;

import java.io.IOException;
import java.net.Socket;

import com.kh.practice.chat.thread.ClientReceiver;
import com.kh.practice.chat.thread.ClientSender;

public class ChatClient {

	public static void main(String[] args) {
		String ip = "localhost";
		int port = 3000;
		try {
			Socket socket = new Socket(ip, port);
			
			ClientReceiver receiver = new ClientReceiver(socket);
			Thread task1 = new Thread(receiver);
			task1.start();
			
			ClientSender sender = new ClientSender(socket);
			Thread task2 = new Thread(sender);
			task2.start();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
