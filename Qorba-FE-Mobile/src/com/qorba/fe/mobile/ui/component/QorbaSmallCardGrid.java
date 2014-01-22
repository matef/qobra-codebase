package com.qorba.fe.mobile.ui.component;

import com.qorba.fe.mobile.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class QorbaSmallCardGrid extends LinearLayout {

	public QorbaSmallCardGrid(Context context) {
		super(context);
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.qorba_small_card_grid, this);
		loadViews();

	}

	public QorbaSmallCardGrid(Context context, AttributeSet attrs) {
		super(context,attrs);
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.qorba_small_card_grid, this);
		loadViews();

	}
	public ImageView getCardImage(){
		return (ImageView)findViewById(R.id.headIcon);
	}

	private void loadViews() {
		// TODO put all components as local variables and the bind them here
	}

}
