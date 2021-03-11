package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//	서버 소켓 만들기
		ServerSocket serverSocket = null;
		
		try {
			//	bind - IP연결
			serverSocket = new ServerSocket();
			InetServerAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			//	시작메세지
			System.out.println("<서버 시작>");
			System.out.println("SEVER: [연결을 기다립니다.]");
			
			//	연결대기
			Socket socket = serverSocket.accept();
			//	접속이 허용이 되면 서버소켓으로 부터 클라이언트 정보를 받을 수 있다
			InetSocketAddress socketAddress =
					(InetSocketAddress)socket.getRemoteSocketAddress();	//	원격지 소켓의 주소
			System.out.println("SERVER: [클라이언트가 연결되었습니다]");
			System.out.println("    클라이언트: " + socketAddress.getAddress() + ":" + socketAddress.getPort());
			
			//	후처리
			System.out.println("SEVER: [서버를 종료합니다.]");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
