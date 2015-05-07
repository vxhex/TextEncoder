package com.eerieapplications.android.encoder;

public class DefaultFactory implements Factory {
	public String encode(String input) {
		return "An error has occured in the factory builder.";
	}
	
	protected boolean validate(String input) {
		boolean output = true;
		if ( (input == null) || ("".equals(input.trim())) ) {
			output = false;
		}
		return output;
	}
}
