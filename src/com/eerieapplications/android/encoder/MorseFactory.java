package com.eerieapplications.android.encoder;

import java.util.ArrayList;

public class MorseFactory extends DefaultFactory {
	
	protected class MorsePair {
		private String key;
		private String value;
		public String getKey() { return key; }
		public String getValue() { return value; }
		public MorsePair(String k, String v) {
			key = k;
			value = v;
		}
	}

	protected ArrayList<MorsePair> encodeList = new ArrayList<MorsePair>(); 
	protected ArrayList<MorsePair> decodeList = new ArrayList<MorsePair>();
	
	public MorseFactory() {
		encodeList.add(new MorsePair(" ", "|"));
		encodeList.add(new MorsePair("A", ".-"));
		encodeList.add(new MorsePair("B", "-..."));
		encodeList.add(new MorsePair("C", "-.-."));
		encodeList.add(new MorsePair("D", "-.."));
		encodeList.add(new MorsePair("E", "."));
		encodeList.add(new MorsePair("F", "..-."));
		encodeList.add(new MorsePair("G", "--."));
		encodeList.add(new MorsePair("H", "...."));
		encodeList.add(new MorsePair("I", ".."));
		encodeList.add(new MorsePair("J", ".---"));
		encodeList.add(new MorsePair("K", "-.-"));
		encodeList.add(new MorsePair("L", ".-.."));
		encodeList.add(new MorsePair("M", "--"));
		encodeList.add(new MorsePair("N", "-."));
		encodeList.add(new MorsePair("O", "---"));
		encodeList.add(new MorsePair("P", ".--."));
		encodeList.add(new MorsePair("Q", "--.-"));
		encodeList.add(new MorsePair("R", ".-."));
		encodeList.add(new MorsePair("S", "..."));
		encodeList.add(new MorsePair("T", "-"));
		encodeList.add(new MorsePair("U", "..-"));
		encodeList.add(new MorsePair("V", "...-"));
		encodeList.add(new MorsePair("W", ".--"));
		encodeList.add(new MorsePair("X", "-..-"));
		encodeList.add(new MorsePair("Y", "-.--"));
		encodeList.add(new MorsePair("Z", "--.."));
		encodeList.add(new MorsePair("0", "-----"));
		encodeList.add(new MorsePair("1", ".----"));
		encodeList.add(new MorsePair("2", "..---"));
		encodeList.add(new MorsePair("3", "...--"));
		encodeList.add(new MorsePair("4", "....-"));
		encodeList.add(new MorsePair("5", "....."));
		encodeList.add(new MorsePair("6", "-...."));
		encodeList.add(new MorsePair("7", "--..."));
		encodeList.add(new MorsePair("8", "---.."));
		encodeList.add(new MorsePair("9", "----."));
		encodeList.add(new MorsePair(".", ".-.-.-"));
		encodeList.add(new MorsePair(",", "--..--"));
		encodeList.add(new MorsePair("?", "..--.."));
		encodeList.add(new MorsePair("'", ".----."));
		encodeList.add(new MorsePair("!", "-.-.--"));
		encodeList.add(new MorsePair("/", "-..-."));
		encodeList.add(new MorsePair("(", "-.--."));
		encodeList.add(new MorsePair(")", "-.--.-"));
		encodeList.add(new MorsePair("&", ".-..."));
		encodeList.add(new MorsePair(":", "---..."));
		encodeList.add(new MorsePair(";", "-.-.-."));
		encodeList.add(new MorsePair("=", "-...-"));
		encodeList.add(new MorsePair("+", ".-.-."));
		encodeList.add(new MorsePair("-", "-....-"));
		encodeList.add(new MorsePair("_", "..--.-"));
		encodeList.add(new MorsePair("\"", ".-..-."));
		encodeList.add(new MorsePair("$", "...-..-"));
		encodeList.add(new MorsePair("@", ".--.-."));
		encodeList.add(new MorsePair("[ERROR]", "........"));

		//The following symbols aren't used by our encoder, but may be used by others.
		decodeList.add(new MorsePair("!", "---."));
		decodeList.add(new MorsePair(" ", "/"));
		decodeList.add(new MorsePair(" ", "\\"));
		decodeList.add(new MorsePair(" ", ","));
		decodeList.add(new MorsePair(" ", ""));
		//decodeList.add(new MorsePair("[WAIT]", ".-..."));
		//decodeList.add(new MorsePair("[TRANSMIT]", "-.-"));
		decodeList.add(new MorsePair("[END OF WORK]", "...-.-"));
		decodeList.add(new MorsePair("[UNDERSTOOD]", "...-."));
		decodeList.add(new MorsePair("[START SIGNAL]", "-.-.-"));
	}
}
