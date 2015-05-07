/**
 * add decode list and [error] functionality to morse stuff
 */

package com.eerieapplications.android.encoder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class encoderActivity extends Activity {
	private EditText mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mText = (EditText) findViewById(R.id.editText1);
    }
    
    public void clickHandler(View view) {
    	Factory factory;
    	String input = mText.getText().toString();
    	
    	switch (view.getId()) {
    		case R.id.base64decode:
    			factory = new Base64Decode();
    			break;
    			
    		case R.id.base64encode:
    			factory = new Base64Encode();
    			break;
    			
    		case R.id.morseencode:
    			factory = new MorseEncode();
    			break;
    			
    		case R.id.morsedecode:
    			factory = new MorseDecode();
    			break;
    			
    		case R.id.URLdecode:
    			factory = new URLDecode();
    			break;
    			
    		case R.id.URLencode:
    			factory = new URLEncode();
    			break;
    			
    		case R.id.asciishift:
    			factory = new ASCIIShift();
    			EditText shiftText = (EditText) findViewById(R.id.asciishiftnumber);
    			String shift = shiftText.getText().toString();
    			((ASCIIShift) factory).setShift(shift);
    			break;
    			
    		case R.id.replace:
    			factory = new Replacer();
    			EditText findText = (EditText) findViewById(R.id.findtext);
    			String find = findText.getText().toString();
    			EditText replaceText = (EditText) findViewById(R.id.replacetext);
    			String replace = replaceText.getText().toString();
    			((Replacer) factory).setFindReplace(find, replace);
    			break;
    			
    		default: 
    			factory = new DefaultFactory();
    	}
    	mText.setText( factory.encode(input).trim() );
    	mText.selectAll();
    }
}


	