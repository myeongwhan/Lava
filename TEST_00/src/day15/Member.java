package day15;

/**
 * �� Ŭ������ ȸ���� ������ ������ VOŬ����
 * @author �̸�ȯ
 * @since 2020.03.27
 * @version v.1.0
 *
 */

public class Member {
	private int mno, avtNo;
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	private String mail;
	private String birth;
	private String gen;
	private String avatar;
	private String sDate;
	private String sTime;
// �Լ� �߿� ��¥�� �ð��� ���� �������� �Լ��� ����. �׷��� DB���� ������ �� ��¥ ����, �ð� ����
	private String isShow;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAvtNo() {
		return avtNo;
	}
	public void setAvtNo(int avtNo) {
		this.avtNo = avtNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getISSHOW() {
		return isShow;
	}
	public void setISSHOW(String isShow) {
		this.isShow = isShow;
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("ȸ����ȣ: ");
		buff.append(mno);
		buff.append("\n");
		buff.append("ȸ���̸�: ");
		buff.append(name);
		buff.append("\n");
		buff.append("ȸ��ID: ");
		buff.append(id);
		buff.append("\n");
		buff.append("ȸ������: ");
		buff.append(mail);
		return buff.toString();
	}
}

