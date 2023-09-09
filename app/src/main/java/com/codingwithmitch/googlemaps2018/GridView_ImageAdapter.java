package com.codingwithmitch.googlemaps2018;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.codingwithmitch.googlemaps2018.R;

public class GridView_ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public GridView_ImageAdapter(Context c){
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
    public View getView(int position, View convertview, ViewGroup parent) {
        ImageView imageView;

        if(convertview == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350,350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else{
            imageView = (ImageView) convertview;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public Integer[] mThumbIds = {
            R.drawable.taeyeon, R.drawable.sunny,
            R.drawable.tiffany, R.drawable.hyoyeon,
            R.drawable.yuri, R.drawable.sooyoung,
            R.drawable.yoona, R.drawable.seohyun
    };
}
