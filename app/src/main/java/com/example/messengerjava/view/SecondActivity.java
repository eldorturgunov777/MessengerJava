package com.example.messengerjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.messengerjava.R;
import com.example.messengerjava.adapter.SecondAdapter;
import com.example.messengerjava.model.SecondModel;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewSecond);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        List<SecondModel> list = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        SecondAdapter secondAdapter = new SecondAdapter(getApplicationContext(), list);
        recyclerView.setAdapter(secondAdapter);
        list.add(new SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img3, R.drawable.img3, "Eldor Turgunov", 3));
        list.add(new SecondModel(R.drawable.img4, R.drawable.img4, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 1));
        list.add(new SecondModel(R.drawable.img6, R.drawable.img6, "Eldor Turgunov", 1));
        list.add(new SecondModel(R.drawable.img7, R.drawable.img7, "Eldor Turgunov", 3));
        list.add(new SecondModel(R.drawable.img8, R.drawable.img8, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 1));
        list.add(new SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img3, R.drawable.img3, "Eldor Turgunov", 3));
        list.add(new SecondModel(R.drawable.img4, R.drawable.img4, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 1));
        list.add(new SecondModel(R.drawable.img6, R.drawable.img6, "Eldor Turgunov", 1));
        list.add(new SecondModel(R.drawable.img7, R.drawable.img7, "Eldor Turgunov", 3));
        list.add(new SecondModel(R.drawable.img8, R.drawable.img8, "Eldor Turgunov", 0));
        list.add(new SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 1));

    }
}