package com.androidbegin.gridview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import android.view.View;

public class GridViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set title for the GridView
        setTitle("GridView");
        setContentView(R.layout.grid_view);

        // Set the images from ImageAdapter.java to GridView
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        // Listening to GridView item click
        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	
            	// Launch ViewImage.java on selecting GridView Item
            	Intent i = new Intent(getApplicationContext(), ViewImage.class);
            	
            	// Show a simple toast message for the item position
            	Toast.makeText(GridViewActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            	
            	// Send the click position to ViewImage.java using intent
            	i.putExtra("id", position);
                
                // Start ViewImage
                startActivity(i);
            }
        });
    }
    
    // Not using options menu for this tutorial
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_grid_view, menu);
        return true;
    }
}
