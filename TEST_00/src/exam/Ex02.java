package exam;

/*
 	���� 2]
"President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion."
 		�ܾ� ������ ���ڿ��� �߶�
 		�ܾ���̰� ���� �� �ܾ��� ���� ���� �ܾ ����ϼ���
 		��, , . - �׸��� ? �� �ܾ�� ����
 */
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." + 
				"He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.";
		
		String[] arr = new String[str.length()];
		
		String tmp = str;
		
		for(int i=0; i<str.length(); i++) {
//			if(str.indexOf(0) == null) {
//				
//			}
			arr[i] = str.substring(0, tmp.indexOf(' '));
			tmp = str.substring(str.indexOf(' ')+1);
			str = tmp;
		}
		
	}
	
	public String getArr(String...a) {
		
		
		return "a";
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
