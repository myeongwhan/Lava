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
		 	InetAddress Ŭ������ ������ �����ϴ� Ŭ�����̹Ƿ�
		 	������ ������ �Լ��� �߿��Լ���
		 	
		 		1. IP�ּ�
		 			getHostAddress()
		 			
		 		2. ������ �ּ�(��� �ο��� �̸�)
		 			getHostName()
			 */
			
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			System.out.println("�� ��ǻ�� IP : " + ip);
			System.out.println("�� ��ǻ�� �̸� : " + name);
			
			System.out.println();
			
			String ip1 = naver.getHostAddress();
			String name1 = naver.getHostName();
			
			System.out.println("naver IP : " + ip1);
			System.out.println("naver �̸� : " + name1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new AddrTest();
	}
	

}
