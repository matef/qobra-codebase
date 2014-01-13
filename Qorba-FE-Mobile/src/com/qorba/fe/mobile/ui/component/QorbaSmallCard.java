package com.qorba.fe.mobile.ui.component;

import com.qorba.fe.mobile.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class QorbaSmallCard extends LinearLayout {

	public QorbaSmallCard(Context context) {
		super(context);
		loadViews();

	}

	public QorbaSmallCard(Context context, AttributeSet attrs) {
		super(context);
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.qorba_small_card, this);
		loadViews();

	}

	private void loadViews() {
		// TODO put all components as local variables and the bind them here
	}

}
