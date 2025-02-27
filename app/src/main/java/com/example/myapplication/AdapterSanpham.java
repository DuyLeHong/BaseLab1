package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSanpham extends RecyclerView.Adapter<AdapterSanpham.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle;
        public TextView txtContent;

        public MyViewHolder(View itemView) {

            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtContent = itemView.findViewById(R.id.txt_content);
        }
    }


    private ArrayList<SanphamModel> listSanphams;

    public AdapterSanpham(ArrayList<SanphamModel> listSanphams) {
        this.listSanphams = listSanphams;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = inflater.inflate(R.layout.item_sanpham, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SanphamModel sanphamModel = listSanphams.get(position);
        holder.txtTitle.setText(sanphamModel.getTitle());
        holder.txtContent.setText(sanphamModel.getContent());
    }



    @Override
    public int getItemCount() {
        return listSanphams.size();
    }
}
