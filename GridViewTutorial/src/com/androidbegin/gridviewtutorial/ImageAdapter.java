package com.androidbegin.gridviewtutorial;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;

	public ImageAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// Create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		// if it's not recycled, initialize some attributes
		if (convertView == null) { 
			imageView = new ImageView(mContext);
			// Center crop image
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		} else {
			imageView = (ImageView) convertView;
		}
		// Set images into ImageView
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}

	// References to our images in res > drawable
	public Integer[] mThumbIds = { R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4,
			R.drawable.sample_5, R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_8, R.drawable.sample_9, R.drawable.sample_10,
			R.drawable.sample_11, R.drawable.sample_12, R.drawable.sample_13,
			R.drawable.sample_14, R.drawable.sample_15, R.drawable.sample_16,
			R.drawable.sample_17, R.drawable.sample_18 };
}
