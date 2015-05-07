package com.eerieapplications.android.encoder;

import java.net.URLDecoder;

public class URLDecode extends DefaultFactory{

	public String encode(String input) {
		String output = "";
		if (validate(input)) {
			output = URLDecoder.decode(input);
		}
		return output;
	}
}
