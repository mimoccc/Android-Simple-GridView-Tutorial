package com.androidbegin.gridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
 
public class ViewImage extends Activity {
	int position;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Full Image View");
        setContentView(R.layout.view_image);
 
        // Get intent data from GridViewActivity.java
        Intent i = getIntent();
        position = i.getExtras().getInt("id");
        
        // Open the Image adapter
        ImageAdapter imageAdapter = new ImageAdapter(this);
        
        // Displaying selected Image
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        
        // Set the image position that is passed from GridViewActivity.java
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
}