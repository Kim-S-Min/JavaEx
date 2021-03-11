package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		printLocalIp();
		printServerIp("www.naver.com");
		printServerIp("www.google.com");
		
	}
	private static void printServerIp(String hostname) {
		try {
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for (InetAddress remote: adrs) {
				System.out.println(hostname + ": Ip:" + remote.getHostAddress());	//	naver와 google의 ip주소가 출력된다
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	//	내 컴퓨터가 할당 받은 ip 확인하기(localhost)
	private static void printLocalIp() {
		try {
			//	내 Ip 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local Ip: " + local.getHostAddress());	//	cmd - ipconfig - ip가 출력된다
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
