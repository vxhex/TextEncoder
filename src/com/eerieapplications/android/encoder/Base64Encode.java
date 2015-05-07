package com.eerieapplications.android.encoder;

import android.util.Base64;

public class Base64Encode extends DefaultFactory {

	public String encode(String input) {
		String output = "";
		if (validate(input)) {
			output = new String( Base64.encode(input.getBytes(), Base64.DEFAULT) );
		}
		return output;
	}
}
