package net_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class SendDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton sendB, resetB, closeB;
	JFrame frame;
	
	public SendDlg() {}
	public SendDlg(Jjokji main) {
		this.main = main;
		frame = new JFrame("���� ����");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		sendB = new JButton("SEND");
		resetB = new JButton("RESET");
		closeB = new JButton("CLOSE");
		// ��ư �̺�Ʈ �߰�
		ButtonEvent evt = new ButtonEvent();
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JLabel label = new JLabel("�޴� ���");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel();
		p2.add(sendB);
		p2.add(resetB);
		p2.add(closeB);
		
		frame.add("North", p1);
		frame.add("Center", sp);
		frame.add("South", p2);
		frame.setSize(400, 300);
	}
	
	// ���� ������ �Լ�
	public void sendProc() {
		// ���� ������ �˾Ƴ���
		String msg = area.getText();
		byte[] buff = msg.getBytes();
		// ���� �ּҸ� �˾Ƴ���
		// ==> �̸��� �˸� �ּҸ� ���� �� �ֵ��� Map�� �غ��� ���Ҵ�
		// �̸� �˾Ƴ���
		String name = field.getText();
		// ip �˾Ƴ���
		String ip = (String) main.nameToIp.get(name);
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// �̰��� ��Ŷ���� ������ ��
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff, buff.length, inet, 9999);
			// ��Ʈ��ũ�� ���������
			main.sSocket.send(pack);
		} catch(Exception e) {
			e.printStackTrace();
		}
		// �����Ⱑ �Ϸ�Ǹ� ���� â�� �ݾ��ش�
		frame.setVisible(false);
		frame.dispose();
	}
	
	class ButtonEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton)e.getSource();
			if(target == sendB) {
				sendProc();
			} else if(target == resetB) {
				area.setText("");
			} else {
				frame.setVisible(false);
				frame.dispose();
				// �� �Լ��� �޸𸮿����� �����޶�� ���
			}
		}
	}
	class BtnEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String comm = e.getActionCommand();
			System.out.println(comm);
		}
	}

}
