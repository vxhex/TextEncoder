package com.eerieapplications.android.encoder;

import java.net.URLEncoder;

public class URLEncode extends DefaultFactory {
	
	public String encode(String input) {
		String output = "";
		if (validate(input)) {
			output = URLEncoder.encode(input);
			//Charset.defaultCharset().name();
		}
		return output;
	}
}
