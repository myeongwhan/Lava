package exam;

/*
 	문제 2]
"President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion."
 		단어 단위로 문자열을 잘라서
 		단어길이가 제일 긴 단어의 글자 수와 단어를 출력하세요
 		단, , . - 그리고 ? 는 단어에서 제외
 */
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." + 
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
