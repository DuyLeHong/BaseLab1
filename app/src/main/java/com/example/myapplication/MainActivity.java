package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edtTitle = findViewById(R.id.edt_title);
        EditText edtContent = findViewById(R.id.edt_content);

        Button btnAdd = findViewById(R.id.btn_add);
        Button btnUpdate = findViewById(R.id.btn_update);
        Button btnDelete = findViewById(R.id.btn_delete);

        RecyclerView rcvSanpham = findViewById(R.id.rcv_sanpham);

        ArrayList<SanphamModel> listSanphams = new ArrayList<>();
        // sau can lay du lieu trong sqlite database de dua vao listSanphams
        listSanphams.add(new SanphamModel("Tiêu đề 1", "Nội dung 1"));
        listSanphams.add(new SanphamModel("Tiêu đề 2", "Nội dung 2"));
        listSanphams.add(new SanphamModel("Tiêu đề 3", "Nội dung 3"));

        AdapterSanpham adapterSanpham = new AdapterSanpham(listSanphams);

        rcvSanpham.setAdapter(adapterSanpham);

        rcvSanpham.setLayoutManager(new LinearLayoutManager(this));

    }
}