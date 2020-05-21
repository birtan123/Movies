package com.example.moviesapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        textView1=(TextView)itemView.findViewById(R.id.row1);
        textView2=(TextView)itemView.findViewById(R.id.row2);
        textView3=(TextView)itemView.findViewById(R.id.row3);

    }
}
