package com.example.leaderboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewFriends;
    private FakeDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();
        configureRecyclerViewChats();
        initializeDatabase();
    }

    private void initializeUI(){
        recyclerViewFriends = findViewById(R.id.recycler_view_friends);
    }

    private void configureRecyclerViewChats(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewFriends.setLayoutManager(layoutManager);

        RecyclerViewFriendsAdapter adapter = new RecyclerViewFriendsAdapter();
        recyclerViewFriends.setAdapter(adapter);

        adapter.submitList(database.getListOfFriends());
    }

    private void initializeDatabase(){
        database = new FakeDatabase();
    }

}