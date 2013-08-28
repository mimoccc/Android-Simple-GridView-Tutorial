package com.androidbegin.gridviewtutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from gridview_main.xml
		setContentView(R.layout.gridview_main);

		// Locate GridView in listview_main.xml
		GridView gridview = (GridView) findViewById(R.id.gridview);

		// Set the ImageAdapter into GridView Adapter
		gridview.setAdapter(new ImageAdapter(this));

		// Capture GridView item click
		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {

				// Launch ViewImage.java using intent
				Intent i = new Intent(MainActivity.this, SingleItemView.class);

				// Show the item position using toast
				Toast.makeText(MainActivity.this, "Position " + position,
						Toast.LENGTH_SHORT).show();

				// Send captured position to ViewImage.java
				i.putExtra("id", position);

				// Start ViewImage.java
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_grid_view, menu);
		return true;
	}
}
