package com.example.recycleviewlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.recycleviewlist.DatabaseHelper.DatabaseHelper;

public class Main2Activity extends AppCompatActivity {

    private TextView edit1, edit2;
    private Button btn;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button);
        databaseHelper = new DatabaseHelper(this);
        edit1 = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);
        final Intent intent = new Intent(this, MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.addData(edit1.getText().toString(), edit2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
