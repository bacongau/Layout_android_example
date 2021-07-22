package com.example.bttt.Ngay_217.Rcv3_horizontal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bttt.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class Rcv3Adapter extends RecyclerView.Adapter<Rcv3Adapter.ViewHolder> {
    ArrayList<MatHang> arrayList;

    public Rcv3Adapter(ArrayList<MatHang> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rcv3, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MatHang hang = arrayList.get(position);
        String ten = hang.getTensp();
        String dis = hang.getDiscount();
        String before = hang.getBeforeDis();
        String after = hang.getAfterDis();
        String url = hang.getImgUrl();

        holder.setData(ten,dis,before,after,url);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvten,tvDiscount,tvbefore,tvafter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView_rcv3_217);
            tvten = itemView.findViewById(R.id.textView_tensp_rcv3_217);
            tvDiscount = itemView.findViewById(R.id.textView_discount_rcv3_217);
            tvbefore = itemView.findViewById(R.id.textView_beforeDis_rcv3_217);
            tvafter = itemView.findViewById(R.id.textView_afterDis_rcv3_217);

        }

        public void setData(String ten, String discount, String before, String after, String url) {
            Picasso.get().load(url).placeholder(R.drawable.haohao).into(img);
            tvten.setText(ten);
            tvDiscount.setText(discount);
            tvbefore.setText(before);
            tvafter.setText(after);
        }
    }
}
