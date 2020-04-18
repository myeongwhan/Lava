package net_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class Jjokji {
	// �̸��� �˷��ָ� �ּҸ� ã�Ƴ��� ��
	// �ּҸ� �˷��ָ� �̸��� ã�Ƴ��� ��
	Properties nameToIp, ipToName;
	JList list;
	JButton sendB;
	JFrame frame;
	
	DatagramSocket sSocket, rSocket;
	/*
	 	������ �ϳ��� ������ ������� �ޱ⸦ �� �� �ִ�
	 	�׷��� ������, ������ ��쿡�� ������ ���߿� �ޱ�� �� �Ѵ�
	 	���� ������ ����� ���ؼ�
	 	������ ���ϰ� �޴� ������ �����ؼ� ó���ϴ� ���� ����
	 */
	public Jjokji() {
		setMap();
		// â���� �����
		frame = new JFrame("���� ���α׷�");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("##########");
				close();
			}
		});
		
		Set tmp = nameToIp.keySet();
		Vector v = new Vector(tmp);
		list = new JList(v);
		JScrollPane sp = new JScrollPane(list);
		sendB = new JButton("���� ����");
		
		// �̺�Ʈ �߰��ϰ�
		sendB.addActionListener(new ButtonEvent());
		
		frame.add("Center", sp);
		frame.add("South", sendB);
		
		frame.setSize(200, 300);
		frame.setVisible(true);
		
		/* ----------------�� ����� �ڵ�------------------ */
		
		/* --------------���� ��Ʈ��ũ ���� ����-------------- */
		// UDP ����̹Ƿ� DatagramSocket�� �̿��Ѵ�
		
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(9999);
			// ��Ʈ��ũ ȸ������ ������ �� ���°� �ȴ�
			// ��, ��Ʈ��ũ�� �����ϵ��ϸ� ���� ����
			
			// ���� ��Ʈ��ũ�� ������ �Ϸ�Ǿ����Ƿ�
			// ������ ������ ���� �� �ִ�
			// ������ ���� ���� ���� ���� �𸣹Ƿ�, �޴� ���α׷��� �������ش�
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		} catch(Exception e) {
			/*
				�� ���α׷��� ����� �Ϸ��� �ݵ�� ������ �ʿ��ϰ�
				������ ����� �������� ������ �߻��ϸ� �� �̻� �� ���α׷���
				�����Ű�� �ǹ̰� ��������
				���� ���α׷��� �������ش�
			 */
			close();
		}
	}
	
	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = (String)list.getSelectedValue();
			if(name == null || name.length() == 0) {
				return;
			}
			// ������ ���� ��ȭ���ڸ� new ��Ų��
			SendDlg dlg = new SendDlg(Jjokji.this);
			// �ؽ�Ʈ �ʵ忡 �޴� ����� �̸��� ���ְ�
			dlg.field.setText(name);
			// ȭ�鿡 ���̰� �ϰ�
			dlg.frame.setVisible(true);
		}
	}
	
	// socket �ݾ��ִ� �Լ�
	public void close() {
		/*
		try {
			sSocket.close();
			rSocket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
		System.exit(0);
	}
	
	public void toTest() {
		System.out.println("������ IP : " + nameToIp.get("������"));
		System.out.println("������ IP : " + nameToIp.get("������"));		
	}
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		// �츮�� �����͸� ���Ͽ� ������ �߰�
		// ������ �ܺ� ��ġ�̴� ��Ʈ���� �ʿ��ϰڴ�
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/net_test/ip_ko.properties");
			fin2 = new FileInputStream("src/net_test/name_ko.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin1.close();
				fin2.close();
			} catch (IOException e) {}
		}
	}

	public static void main(String[] args) {
		new Jjokji();
	}

}
