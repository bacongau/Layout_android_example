package com.example.bttt.Ngay_217.Rcv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bttt.Ngay_217.Rcv3_horizontal.Rcv3Activity;
import com.example.bttt.R;

import java.util.ArrayList;

import static android.view.View.VISIBLE;

public class Rcv2Activity extends AppCompatActivity {
    EditText edt;
    ImageView imgClear, imgSearch;
    TextView tv,tvbai3;
    RecyclerView rcv;
    Rcv2GoodsAdapter adapter;
    Rcv2GoodsAdapter adapterSearch;
    ArrayList<Goods> arrayList;
    ArrayList<Goods> arrayListSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcv2);

        anhxa();
        themDuLieu();
        setupRecyclerView();

        edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    imgClear.setVisibility(VISIBLE);
                } else {
                    imgClear.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        imgClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
                rcv.setAdapter(adapter);
                tv.setText("");
            }
        });

        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayListSearch.clear();
                String key = edt.getText().toString();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getTen().toLowerCase().contains(key.toLowerCase())) {
                        arrayListSearch.add(arrayList.get(i));
                    }
                }
                rcv.setAdapter(adapterSearch);
                tv.setText("Có " + arrayListSearch.size() + " kết quả tìm kiếm cho " + "\"" + key + "\"");

                if (key.equals("")) {
                    rcv.setAdapter(adapter);
                    tv.setText("");
                }
            }
        });

        chuyenBai3();
    }

    private void chuyenBai3() {
        tvbai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rcv2Activity.this, Rcv3Activity.class));
            }
        });
    }

    private void setupRecyclerView() {
        rcv.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        rcv.setLayoutManager(linearLayoutManager);
        rcv.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclerview_divider));
        rcv.addItemDecoration(dividerItemDecoration);
    }

    private void themDuLieu() {
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 1));
        arrayList.add(new Goods("https://static.omipharma.vn/files/product/2020-09/keo-deo-super-man-22-vien-omi-pharma-1.png", "Kẹo", "25%", "16.000 VND", "15.000 VND", 1));
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://static.omipharma.vn/files/product/2020-09/keo-deo-super-man-22-vien-omi-pharma-1.png", "Kẹo", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://static.omipharma.vn/files/product/2020-09/keo-deo-super-man-22-vien-omi-pharma-1.png", "Kẹo", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://static.omipharma.vn/files/product/2020-09/keo-deo-super-man-22-vien-omi-pharma-1.png", "Kẹo", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 0));
        arrayList.add(new Goods("https://static.omipharma.vn/files/product/2020-09/keo-deo-super-man-22-vien-omi-pharma-1.png", "Kẹo", "25%", "16.000 VND", "15.000 VND", 1));
        arrayList.add(new Goods("https://lh3.googleusercontent.com/proxy/LTPSLbW4SiGbR0QuLtpPE_RqIJbwKMCYNRTXvl-yXN3xrmlSNoRvqdaklcscq-bMdl8RLf_CdDhalLD7D2oLafzbkmXWGCOrftzfYLzPsXkewgNUx1oxJxX5_TxY", "Bim Bim", "25%", "16.000 VND", "15.000 VND", 1));
    }

    private void anhxa() {
        tv = findViewById(R.id.textView);
        tvbai3 = findViewById(R.id.textView_bai3);
        edt = findViewById(R.id.edt_rcv2_217);
        imgClear = findViewById(R.id.imgclear_rcv2_217);
        imgSearch = findViewById(R.id.imgsearch_rcv2_217);
        rcv = findViewById(R.id.rcv2_217);

        arrayList = new ArrayList<>();
        arrayListSearch = new ArrayList<>();
        adapter = new Rcv2GoodsAdapter(arrayList);
        adapterSearch = new Rcv2GoodsAdapter(arrayListSearch);
    }

}