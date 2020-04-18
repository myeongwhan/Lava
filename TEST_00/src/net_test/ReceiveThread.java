package net_test;

/*
 	�� Ŭ������ ������ �ޱ� ���� Ŭ�����̴�
 	������ ���� �������� �𸣴� �����̴�
 	���� ���������� ������ �ޱ� ���� ���α׷��� ���� ���� ó���� �ؾ� �Ѵ�
 */
import java.net.*;
public class ReceiveThread extends Thread {
	Jjokji main;
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	
	public void receiveProc(DatagramPacket pack) {
		byte[] buff = pack.getData();	// byte[] ������
		String msg = new String(buff, 0, buff.length);	// ���ڿ��� ��ȯ�� ������
		InetAddress addr = pack.getAddress();
		String ip = addr.getHostAddress();
		
		// ���� ��� �̸� ���
		String name = (String) main.ipToName.get(ip);
		ReceiveDlg dlg = new ReceiveDlg(main);
		dlg.field.setText(name);
		dlg.area.setText(msg);
		
		// ���â ����ְ�
		dlg.frame.setVisible(true);
	}
	
	public void run() {
		try {
			// ������ �޾ƾ� �Ѵ�
			// ������ ������ ��Ŷ���� �����Ѵ�
			// ���� �ݵ�� ��Ŷ�� �غ��ؼ� �޾ƾ� �Ѵ�
			
			while(true) {
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				// �� �Լ��� ���ŷ �Լ��̴�
				// �� ���� ��Ŷ�� �����ϸ� ����Ǵ� �Լ���� ��
				// ������ ��Ŷ�� ��ȭ���ڸ� �̿��ؼ� ���
				receiveProc(pack);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
