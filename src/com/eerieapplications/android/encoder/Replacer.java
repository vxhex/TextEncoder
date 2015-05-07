package com.eerieapplications.android.encoder;

public class Replacer extends DefaultFactory {

private String find;
private String replace;
	
	public String encode(String input) {
		String output = "";
		if (validate(input) && validateFindReplace()) {
			output = input.replace(find, replace);
		}
		return output;
	}
	
	public void setFindReplace(String inFind, String inReplace) {
		find = inFind;
		replace = inReplace;
	}
	
	private boolean validateFindReplace() {
		boolean output = true;
		if ((find == null)||(replace == null)||("".equals(find))) {
			output = false;
		}
		return output;
	}
	
}
