package com.eerieapplications.android.encoder;

public class ASCIIShift extends DefaultFactory {
	
	private String shiftOffset;
	
	public String encode(String input) {
		String output = "";
		if (validate(input) && isNumber()) {
			
			int offset = new Integer(shiftOffset);
			StringBuilder shiftedText = new StringBuilder(input);
			
			for(int i = 0; i < shiftedText.length(); i++) {
				int c = shiftedText.charAt(i) + offset;
				shiftedText.setCharAt(i, (char) c);
			}
			
			output = shiftedText.toString();
			
		} else {
			output = "Shift value must be a signed integer.";
		}
		return output;
	}
	
	public void setShift(String input) {
		shiftOffset = input;
	}
	
	private boolean isNumber() {
		boolean output = true;
		try {
			new Integer(shiftOffset);
		} catch (NumberFormatException e) {
			output = false;
		}
		return output;
	}

}
