package com.example.bttt.Ngay_217.Rcv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bttt.Ngay_217.RecyclerView1Adapter;
import com.example.bttt.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Rcv2GoodsAdapter extends RecyclerView.Adapter<Rcv2GoodsAdapter.ViewHolder> {
    ArrayList<Goods> arrayList;

    public Rcv2GoodsAdapter(ArrayList<Goods> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Rcv2GoodsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_good_rcv2, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rcv2GoodsAdapter.ViewHolder holder, int position) {
        Goods goods = arrayList.get(position);
        String ten = goods.getTen();
        String discount = goods.getDiscountPercentage();
        String before = goods.getBeforeDis();
        String after = goods.getBeforeDis();
        int status = goods.getStatus1();
        String url = goods.getImgUrl();

        holder.setData(ten, discount, before, after, status, url);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvTen, tvDiscount, tvBefore, tvAfter, tvStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView_rcv2_217);
            tvTen = itemView.findViewById(R.id.textView_ten_rcv2_217);
            tvDiscount = itemView.findViewById(R.id.textView_discount_rcv2_217);
            tvBefore = itemView.findViewById(R.id.textView_before_rcv2_217);
            tvAfter = itemView.findViewById(R.id.textView_after_rcv2_217);
            tvStatus = itemView.findViewById(R.id.textView_status_rcv2_217);


        }

        public void setData(String ten, String discount, String before, String after, int status, String url) {
            Picasso.get().load(url).placeholder(R.drawable.keo).into(img);
            img.setPadding(10, 10, 10, 10);
            tvTen.setText(ten);
            tvDiscount.setText(discount);
            tvBefore.setText(before);
            tvAfter.setText(after);
            if (status == 0){
                tvStatus.setText("Hết hàng");
            }else{
                tvStatus.setText("");
            }
        }
    }
}
