package com.example.bttt.Ngay_217;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bttt.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<ItemFood> arrayList;

    public GridViewAdapter(Context context, int layout, ArrayList<ItemFood> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class GridViewHolder{
        ShapeableImageView img;
        TextView tvh1,tvh2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridViewHolder holder;
        if (convertView == null){
            holder = new GridViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);

            holder.img = convertView.findViewById(R.id.imageView_gridview_217);
            holder.tvh1 = convertView.findViewById(R.id.textView_gridview_h1_217);
            holder.tvh2 = convertView.findViewById(R.id.textView_gridview_h2_217);

            convertView.setTag(holder);
        }else{
            holder = (GridViewHolder) convertView.getTag();
        }

        ItemFood itemFood = arrayList.get(position);

        Picasso.get()
                .load(itemFood.getImgUrl())
                .placeholder(R.drawable.d10)
                .error(R.drawable.d10)
                .into(holder.img);

        holder.tvh1.setText(itemFood.getH1());
        holder.tvh2.setText(itemFood.getH2());

        return convertView;
    }
}
