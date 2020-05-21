package com.example.moviesapp;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView =  findViewById(R.id.rv);

        mAdapter = new CustomAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        MovieData();

    }

    private void MovieData() {
        movieList.add(new Movie(R.drawable.gemeniman,"Gemini Man","Action / Thriller","Release date: Oct 11, 2019 (United States) "));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"Fast & Furious Presents: Hobbs & Shaw","Adventure/Action","Release date: Aug 2, 2019 "));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"Shazam!"," Fantasy/Adventure","Release date: Apr 5, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"Men in Black: International"," Sci-Fi/Adventure","Release date: Jun 14, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"6 Underground","Thriller/Adventure","Release date: Dec 13, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_foreground,"Jumanji: The Next Level","Fantasy/Adventure","Release date: Dec 13, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_foreground,"21 Bridges","Crime/Thriller","Release date: Nov 22, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"Crawl","Horror/Thriller","Release date: Jul 12, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_background,"Escape Plan: The Extractors","Crime/Thriller","Release date: Jul 2, 2019 (United States)"));
        movieList.add(new Movie(R.drawable.ic_launcher_foreground,"Danger Close","Action/War","Release date: Nov 9, 2019 (United States)"));

        mAdapter.notifyDataSetChanged();

    }
}