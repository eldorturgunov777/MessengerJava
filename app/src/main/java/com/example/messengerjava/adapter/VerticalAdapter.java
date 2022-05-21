package com.example.messengerjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messengerjava.R;
import com.example.messengerjava.model.Chat_vertical;

import java.util.List;

/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger Java
 * eldorturgunov777@gmail.com
 */
public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {
    Context context;
    List<Chat_vertical> list;

    public VerticalAdapter(Context context, List<Chat_vertical> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_item, parent, false);
        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        Chat_vertical data = list.get(position);
        holder.imageView.setImageResource(data.getImg());
        holder.title.setText(data.getFullName());
        holder.desc.setText(data.getDesc());
        holder.online.setBaselineAligned(data.getOnline());

        if (data.getOnline()) {
            holder.online.setVisibility(View.VISIBLE);
        } else {
            holder.online.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class VerticalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView desc;
        LinearLayout online;

        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_vertical);
            title = itemView.findViewById(R.id.tv_fullname_ver);
            desc = itemView.findViewById(R.id.tv_desc_ver);
            online = itemView.findViewById(R.id.is_online);
        }
    }
}
