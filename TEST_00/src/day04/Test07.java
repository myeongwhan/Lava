package day04;

/*
 	label �� ���� for ���
 		: �ݺ����� ��ø�� �� ���
 			������ �ݺ������� ���ǿ� ���� �ٱ��� �ݺ����� �����ؾ� �� ��찡 �����
 			�� �� �ش� �ݺ����� �������� �뵵�� ���̴� �ݺ���
 			���� ����� break�� continue�� �� �� �ִ�
 			
 		����]
 			���̸�:
 			for(;;){ -(1)
 			
 				for(;;){ -(2)
 				
 					break ���̸�;
 				}
 			}
 			
 		***
 		����]
 			�󺧿� ���� ó���� ���Ӱ��迡 ���ؼ��� ����ȴ�
 			
 			label1:
 			for(){
 			
 				��:
 				for(){
 				
 				}
 				
 				for(){
 					break ��;			==> X
 					continue label1;	==> O
 				}
 			}
 */
public class Test07 {

	public static void main(String[] args) {
		// �������� ����ϴµ� 3���� 5�� �̻��� ��µ��� �ʰ� �ǳʶٰ� �ϼ���
		t1:
		for(int dan=2; dan<=9; dan++) {
			for(int gop=1; gop<=9; gop++) {
				if(dan == 3 && gop >= 5) {
					continue t1;
				}
				System.out.println(dan + " x " + gop + " = " + (dan*gop));
			}
		}

	}

}
