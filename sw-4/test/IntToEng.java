import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Test;

public class IntToEng {

	@Test
	public void test() {
		fail("Not yet implemented");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
		 
		    // 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String[] num1= {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","eighteen","nineteen"};
		    		//if(n=0||n<11)
		    		return num1[n];
		    	}	


	}

