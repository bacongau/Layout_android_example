package com.example.bttt.Ngay_217;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bttt.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerView1Adapter extends RecyclerView.Adapter<RecyclerView1Adapter.ViewHolder> {
    ArrayList<ItemFood> arrayList;

    public RecyclerView1Adapter(ArrayList<ItemFood> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gridview_217, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView1Adapter.ViewHolder holder, int position) {
          String h1 = arrayList.get(position).getH1();
          String h2 = arrayList.get(position).getH2();
          String imgurl = arrayList.get(position).getImgUrl();

          holder.setData(h1,h2,imgurl);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView img;
        TextView tvh1,tvh2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView_gridview_217);
            tvh1 = itemView.findViewById(R.id.textView_gridview_h1_217);
            tvh2 = itemView.findViewById(R.id.textView_gridview_h2_217);


        }

        public void setData(String h1,String h2, String url){
            Picasso.get().load(url).placeholder(R.drawable.d10).into(img);
            img.setPadding(10,10,10,10);
            tvh1.setText(h1);
            tvh2.setText(h2);
        }
    }

}
