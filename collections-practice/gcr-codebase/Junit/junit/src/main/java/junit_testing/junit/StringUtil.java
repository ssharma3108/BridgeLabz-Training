package junit_testing.junit;

import java.security.PublicKey;
import java.text.BreakIterator;
import java.util.Iterator;

public class StringUtil {	
		public String reverse(String s) {
			String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		return str;
		}
		
		public boolean isPalindrome(String s) {
			boolean isPal=false;
			
			if(s.equals(reverse(s))) {
				isPal=true;
			}
			return isPal;
			
		}
		
		public String toUppaercase(String s) {
			return s.toUpperCase();
			}

}
