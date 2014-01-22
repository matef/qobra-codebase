package com.qorba.fe.mobile.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;

import com.qorba.fe.mobile.R;
import com.qorba.fe.mobile.ui.component.QorbaSmallCardGrid;

public class QSmallCardAdapter extends BaseAdapter {
	
    private Context mContext;
    
    private List<QorbaSmallCardGrid> qorbaCards;

    public QSmallCardAdapter(Context c) {
    	System.out.println("qorba adapter is inistantiated .*******");
        mContext = c;
     
        
    }

    public int getCount() {
        return 6;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
    	QorbaSmallCardGrid qcard = null;
    	if(convertView == null){
    		System.out.println("new view ********************");
    		qcard = new QorbaSmallCardGrid (mContext);
    		
    		//qcard = qorbaCards.get(position);
    		// GridLayout.LayoutParams params = new GridLayout.LayoutParams(GridLayout.LayoutParams.MATCH_PARENT, GridLayout.LayoutParams.MATCH_PARENT);
    		// convertView.setLayoutParams(new GridView.LayoutParams(params));
    		qcard.setLayoutParams(new GridView.LayoutParams(350,GridView.LayoutParams.WRAP_CONTENT ));
    		//qcard.setScaleType();
    		qcard.setBackgroundColor(Color.DKGRAY );
        	//qcard.getCardImage().setImageResource(R.drawable.cardhead);
        	qcard.setPadding(3, 3, 3, 3);
			
    	}
    	else{
    		System.out.println("old view ********************");
    		qcard = (QorbaSmallCardGrid)convertView;
    	}
    	
		//qcard.setEnabled(true);
		//qcard.setFocusable(true);
    	//qcard.invalidate();
    	return qcard;
    }


}
