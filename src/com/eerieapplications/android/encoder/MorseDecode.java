package com.eerieapplications.android.encoder;

public class MorseDecode extends MorseFactory {
	
	public String encode(String input) {
		StringBuilder output = new StringBuilder();
		
		if (validate(input)) {
			
			String[] morse = input.split(" ");
			
			for(int i = 0; i < morse.length; i++) {
				
				boolean found = false;
				for(int j = 0; j < encodeList.size(); j++) {
					if(morse[i].equalsIgnoreCase( encodeList.get(j).getValue() )) {
						output.append( encodeList.get(j).getKey() );
						found = true;
						break;
					}
				}
				for(int j = 0; j < decodeList.size(); j++) {
					if(morse[i].equalsIgnoreCase( decodeList.get(j).getValue() )) {
						output.append( decodeList.get(j).getKey() );
						found = true;
						break;
					}
				}
				
				if(!found) {
					output.append("[ERROR]");
				}
			}
			
		}
		return new String(output).replaceAll(" {2,}", " ").trim();
	}
}
