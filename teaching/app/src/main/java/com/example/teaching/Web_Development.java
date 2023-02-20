package com.example.teaching;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Web_Development extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_development);
        Intent intent = getIntent();

        ImageButton button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Web_Development.this,java_notes.class);
                startActivity(intent1);
            }
        });

        ImageButton button1 = findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Web_Development.this,book_web.class);
                startActivity(intent1);
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share) {
            Toast.makeText(getApplicationContext(), "You Click Share", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "You Click About", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.exit) {
            Toast.makeText(getApplicationContext(), "You Click Exit", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.search) {
            Toast.makeText(getApplicationContext(), "You Click Search", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.setting) {
            Toast.makeText(getApplicationContext(), "You Click Setting", Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}