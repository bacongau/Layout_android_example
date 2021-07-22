package com.example.bttt.Ngay_217.Rcv3_horizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bttt.R;

import java.util.ArrayList;

public class Rcv3Activity extends AppCompatActivity {
    RecyclerView rcv;
    Rcv3Adapter adapter;
    ArrayList<MatHang> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcv3);

        anhxa();
        themDuLieu();
        setupRecyclerView();

    }

    private void setupRecyclerView() {
        rcv.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rcv.setLayoutManager(linearLayoutManager);
        rcv.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclerview_divider));
        rcv.addItemDecoration(dividerItemDecoration);
    }

    private void anhxa() {
        rcv = findViewById(R.id.rcv3_217);

        arrayList = new ArrayList<>();
        adapter = new Rcv3Adapter(arrayList);
    }

    private void themDuLieu() {
        arrayList.add(new MatHang("https://fujimart.vn/image/cache/catalog/Th%E1%BB%B1c%20ph%E1%BA%A9m%20c%C3%B4ng%20ngh%E1%BB%87/nuoc%20mam%20nam%20ngu%20500ml-502x502.png",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://www.thanh-binh.fr/4778-thickbox_default/nuoc-mam-nuoc-mam-ca-com-725ml-thai.jpg",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://fujimart.vn/image/cache/catalog/Th%E1%BB%B1c%20ph%E1%BA%A9m%20c%C3%B4ng%20ngh%E1%BB%87/nuoc%20mam%20nam%20ngu%20500ml-502x502.png",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://www.thanh-binh.fr/4778-thickbox_default/nuoc-mam-nuoc-mam-ca-com-725ml-thai.jpg",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://fujimart.vn/image/cache/catalog/Th%E1%BB%B1c%20ph%E1%BA%A9m%20c%C3%B4ng%20ngh%E1%BB%87/nuoc%20mam%20nam%20ngu%20500ml-502x502.png",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://www.thanh-binh.fr/4778-thickbox_default/nuoc-mam-nuoc-mam-ca-com-725ml-thai.jpg",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
        arrayList.add(new MatHang("https://fujimart.vn/image/cache/catalog/Th%E1%BB%B1c%20ph%E1%BA%A9m%20c%C3%B4ng%20ngh%E1%BB%87/nuoc%20mam%20nam%20ngu%20500ml-502x502.png",
                "BEKSUL Xốt ướp Bulgogi heo 290G (~11/09/21)",
                "40%",
                "45.000 VND",
                "27.000 VND"));
    }
}