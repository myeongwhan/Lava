package day15;

/*
 	¹®Á¦ 1]
 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­ 
 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö °Ë»çÇÏ¼¼¿ä
 		ÀÌ¸ŞÀÏ Çü½ÄÀº
 			¾ËÆÄºª°ú ¼ıÀÚ·Î 8±ÛÀÚ ÀÌ»ó + @ + µµ¸ŞÀÎÁÖ¼Ò
 		·Î Ã³¸®ÇÏ¼¼¿ä
 		
 		\w{8,]@\w{2.10}\.[a-z]{2,3}\.?[a-z]{0.2}
 		
 		Âü°í]
 			ÇÑ±Û Ã³¸² : [°¡-ÆR]	-	ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö ¸¶¼¼¿ä
 */
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String val = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏ ÀÔ·Â: ");
		
		Pattern pattern = Pattern.compile("\\w{8,]@\\w{2.10}\\.[a-z]{2,3}\\.?[a-z]{0.2}");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏÀÔ´Ï´Ù");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}

}
