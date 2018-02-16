package interfaces;

import java.util.Stack;

public class BackwardsString extends SpecialString {
	Stack<String> letter = new Stack<String>();
	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub

	}

	public String funkifyText(String s) {
		String BackS = "";
		for (int i = 0; i < s.length(); i++) {
			String w = String.valueOf(s.charAt(i));
			letter.push(w);
		}
		for (int i = 0; i < s.length(); i++) {
			BackS += letter.pop();
		}
		return BackS;
	}
}