package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class MixedCapsString extends SpecialString {
ArrayList<String> ch = new ArrayList<String>(); 
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub

	}
@Override
public String funkifyText(String s) {
	String Random = "";
	// TODO Auto-generated method stub
	for (int i = 0; i < s.length(); i++) {
		String l = String.valueOf(s.charAt(i));
		ch.add(l);
	}
	for (int i = 0; i < s.length(); i++) {
		if (i%2 == 0) {
			String h = ch.get(i);
			Random += h.toUpperCase();
		}else{ 
			String g = ch.get(i);
			Random += g.toLowerCase();
		}
	}
	return Random;
}
}
