package com.example.messengerjava.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messengerjava.R;
import com.example.messengerjava.model.SecondModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {
    Context context;
    List<SecondModel> list = new ArrayList<>();

    public SecondAdapter(Context context, List<SecondModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.second_item, parent, false);
        return new SecondViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        SecondModel data = list.get(position);
        holder.img1.setImageResource(data.getImg());
        holder.img2.setImageResource(data.getImgVertical());
        holder.title.setText(data.getTitle());
        holder.desc.setText(Integer.toString(data.getDesc()));
        if (position == 0) {
            holder.img2.setImageResource(R.drawable.ic_add);
            holder.img2.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.title.setText("Add to Story");
            holder.layout.setVisibility(View.GONE);
        }
        if (data.getDesc() > 0) {
            holder.layout.setVisibility(View.VISIBLE);
        } else {
            holder.layout.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class SecondViewHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        ImageView img2;
        TextView title;
        TextView desc;
        LinearLayout layout;

        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img);
            img2 = itemView.findViewById(R.id.iv_vertical);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            layout = itemView.findViewById(R.id.layout);
        }
    }
}
