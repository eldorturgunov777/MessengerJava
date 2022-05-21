package com.example.messengerjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.messengerjava.R;
import com.example.messengerjava.adapter.HorizontalAdapter;
import com.example.messengerjava.adapter.VerticalAdapter;
import com.example.messengerjava.model.Chat_horizontal;
import com.example.messengerjava.model.Chat_vertical;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    RecyclerView horizontalRecView;
    List<Chat_horizontal> chat_horizontals = new ArrayList<>();
    RecyclerView verticalRecView;
    List<Chat_vertical> chat_verticals = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        horizontalRecView = findViewById(R.id.horizontalRecView);
        horizontalRecView.setHasFixedSize(true);
        horizontalRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        HorizontalAdapter horizontalAdapter = new HorizontalAdapter(this, chat_horizontals);
        horizontalRecView.setAdapter(horizontalAdapter);
        horizontalData();

        verticalRecView = findViewById(R.id.verticalRecView);
        verticalRecView.setHasFixedSize(true);
        verticalRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        VerticalAdapter verticalAdapter = new VerticalAdapter(this, chat_verticals);
        verticalRecView.setAdapter(verticalAdapter);
        verticalData();

    }

    private void horizontalData() {
        chat_horizontals.add(new Chat_horizontal(R.drawable.ic_video_call, "Create room"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img3, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img4, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img5, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img6, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img7, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img8, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img2, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img3, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img4, "Eldor Turgunov"));
        chat_horizontals.add(new Chat_horizontal(R.drawable.img5, "Eldor Turgunov"));

    }

    private void verticalData() {
        chat_verticals.add(new Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img4, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img5, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img6, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img7, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img8, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img4, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img5, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img6, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img7, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img8, "Eldor Turgunov", "Last seen",false));
        chat_verticals.add(new Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen",true));
        chat_verticals.add(new Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen",true));
    }
}