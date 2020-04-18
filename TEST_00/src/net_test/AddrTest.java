package net_test;

import java.net.*;

public class AddrTest {

	public AddrTest() {
		InetAddress inet = null;
		InetAddress naver = null;
		try {
			inet = InetAddress.getLocalHost();
			naver = InetAddress.getByName("www.naver.com");
			/*
		 	InetAddress 클래스는 정보를 관리하는 클래스이므로
		 	정보를 꺼내는 함수고 중요함수다
		 	
		 		1. IP주소
		 			getHostAddress()
		 			
		 		2. 도메인 주소(장비에 부여된 이름)
		 			getHostName()
			 */
			
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			System.out.println("내 컴퓨터 IP : " + ip);
			System.out.println("내 컴퓨터 이름 : " + name);
			
			System.out.println();
			
			String ip1 = naver.getHostAddress();
			String name1 = naver.getHostName();
			
			System.out.println("naver IP : " + ip1);
			System.out.println("naver 이름 : " + name1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new AddrTest();
	}
	

}
