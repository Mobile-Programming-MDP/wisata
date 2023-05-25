package com.si61.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.si61.myapplication.Model.ModelResponse;
import com.si61.myapplication.Model.ModelWisata;
import com.si61.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ProgressBar pbWisata;
    private FloatingActionButton fabTambah;
    private RecyclerView.Adapter adWisata;
    private RecyclerView.LayoutManager lmWisata;
    private List<ModelWisata> listwisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        pbWisata = findViewById(R.id.pb_wisata);
        fabTambah = findViewById(R.id.fab_tambah);

        lmWisata = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvWisata.setLayoutManager(lmWisata);

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TambahActivity.class));
            }
        });

    }

    public void retrieveWisata(){

    }

    @Override
    protected void onResume() {
        super.onResume();
        retrieveWisata();
    }
}