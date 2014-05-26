package com.sixminute.parentproject;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.sixminute.subproject.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		getWindow().setBackgroundDrawable( new ColorDrawable(android.graphics.Color.GRAY) );
		
		setContentView(R.layout.com_sixminute_rellayout);
	}
}
