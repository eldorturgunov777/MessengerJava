package com.example.messengerjava.adapter;

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
import com.example.messengerjava.model.Chat_horizontal;

import java.util.List;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {
    Context context;
    List<Chat_horizontal> list;

    public HorizontalAdapter(Context context, List<Chat_horizontal> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizontal_item, parent, false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        Chat_horizontal data = list.get(position);
        holder.imageView.setImageResource(data.getImg());
        holder.fullName.setText(data.getFullName());
        if (position == 0) {
            holder.imageView.setScaleType(ImageView.ScaleType.CENTER);
            holder.imageView.setBackgroundColor(Color.parseColor("#303030"));
            holder.online.setVisibility(View.GONE);
        } else {
            holder.online.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class HorizontalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView fullName;
        LinearLayout online;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_horizontal);
            fullName = itemView.findViewById(R.id.tv_horizontal);
            online = itemView.findViewById(R.id.is_online);
        }
    }
}
