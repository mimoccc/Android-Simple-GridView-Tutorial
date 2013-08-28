package com.androidbegin.gridviewtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleItemView extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from singleitemview.xml
		setContentView(R.layout.singleitemview);

		// Get position from intent passed from MainActivity.java
		Intent i = getIntent();

		int position = i.getExtras().getInt("id");

		// Open the Image adapter
		ImageAdapter imageAdapter = new ImageAdapter(this);

		// Locate the ImageView in singleitemview.xml
		ImageView imageView = (ImageView) findViewById(R.id.image);

		// Get image and position from ImageAdapter.java and set into ImageView
		imageView.setImageResource(imageAdapter.mThumbIds[position]);
	}
}