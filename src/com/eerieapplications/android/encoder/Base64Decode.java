package com.eerieapplications.android.encoder;

import android.util.Base64;

public class Base64Decode extends DefaultFactory {
	
	public String encode(String input) {
		String output = "";
		if (validate(input)) {
			output = new String( Base64.decode(input, Base64.DEFAULT) );
		}
		return output;
	}
}
