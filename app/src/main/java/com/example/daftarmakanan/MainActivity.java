package com.example.daftarmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new kulinerAdapater(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }
        private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Gorengan", "Gurih", "Gorengan Renyah harga murah meriah", R.drawable.gorengan ));
        listKuliner.add(new Kuliner("Lumpia", "Daging ayam", "Enak dan Bergizi, kualitas terjamin", R.drawable.lumpia ));
        listKuliner.add(new Kuliner("Kue Kering", "Choko chips", "Enak Menyehatkan dan renyah", R.drawable.kuekering ));
        listKuliner.add(new Kuliner("Kue Tar", "Caramel", "Kualitas terbaik, Harga murah meriah guys", R.drawable.kuetar));
        }
}