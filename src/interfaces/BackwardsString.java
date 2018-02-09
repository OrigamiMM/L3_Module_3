package interfaces;

import java.util.ArrayList;

public class BackwardsString extends SpecialString {
	ArrayList<String> letter = new ArrayList<String>();
	String BackS = "";

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub

	}

	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i++) {
			String w = String.valueOf(s.indexOf(i));
			letter.add(w);
		}
		for (int i = s.length(); i < 0; i--) {
			BackS += letter.get(i);
		}
		return BackS;
	}
}
