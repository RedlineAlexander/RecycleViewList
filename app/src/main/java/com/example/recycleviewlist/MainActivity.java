package com.example.recycleviewlist;

import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

import com.example.recycleviewlist.DatabaseHelper.DatabaseHelper;

public class MainActivity extends AppCompatActivity {
private RecyclerView numbersList;
private NumbersAdapter numbersAdapter;
private DatabaseHelper databaseHelper;
private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);
        numbersList = findViewById(R.id.rv_numbers);
        floatingActionButton = findViewById(R.id.floatBtn);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(layoutManager);

        numbersList.setHasFixedSize(true);
        numbersAdapter = new NumbersAdapter(100);
        numbersList.setAdapter(numbersAdapter);

        final Intent intent = new Intent(this, Main2Activity.class);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}
