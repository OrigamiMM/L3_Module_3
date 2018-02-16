package interfaces;

import java.util.ArrayList;

public class MixedCapsString extends SpecialString {
ArrayList<String> ch = new ArrayList<String>(); 
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub

	}
@Override
public String funkifyText(String s) {
	String caps = "";
	// TODO Auto-generated method stub
	for (int i = 0; i < s.length()-1; i++) {
		String l = String.valueOf(s.charAt(i));
		ch.add(l);
		}
	for (int i = 1; i < s.length(); i++) {
		if (i%2 == 0) {
			String h = ch.get(i);
			caps += h.toUpperCase();
			//String g = ch.get(i);
			//caps += g.toLowerCase();
		}else{ 
			String g = ch.get(i);
			caps += g.toLowerCase();
			//String h = ch.get(i);
			//caps += h.toUpperCase();
		}
	}
	System.out.println(caps);
	return caps;
}
}
