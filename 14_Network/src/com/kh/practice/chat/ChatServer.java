package com.kh.practice.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.practice.chat.thread.ServerReceiver;
import com.kh.practice.chat.thread.ServerSender;

public class ChatServer {

	public static void main(String[] args) {
		
		// 포트 번호 설정
		int port = 3000;
		System.out.println("======= CHAT SERVER START ========");
		try(ServerSocket server = new ServerSocket(port)) {
			Socket socket = server.accept();
			String cliIP = socket.getInetAddress().getHostAddress();
			System.out.println("\t" + cliIP + ".. 연결 ...");
			
			// 클라이언트로부터 메시지를 받아줄 Thread
			ServerReceiver rcv = new ServerReceiver(socket);
			Thread receiveTask = new Thread(rcv);
			receiveTask.start();
			
			// 클라이언트에게 메시지를 보내줄 Thread
			ServerSender sender = new ServerSender(socket);
			Thread sendTask = new Thread(sender);
			sendTask.start();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
