package com.eerieapplications.android.encoder;

public class MorseEncode extends MorseFactory {
	
	public String encode(String input) {
		StringBuilder output = new StringBuilder();
		
		if (validate(input)) {
			for(int i = 0; i < input.length(); i++) {
				String letter = Character.toString( input.charAt(i) );
				
				boolean found = false;
				for(int j = 0; j < encodeList.size(); j++) {
					if(letter.equalsIgnoreCase( encodeList.get(j).getKey() )) {
						output.append( encodeList.get(j).getValue() + " " );
						found = true;
						break;
					}
				}
				
				if(!found) {
					output.append("........ ");
				}
			}
			
		}
		return new String(output).trim();
	}
}
