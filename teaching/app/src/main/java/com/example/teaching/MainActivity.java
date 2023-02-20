package com.example.teaching;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
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

    public void clanguage(View view) {
        Intent intent = new Intent(this, C_Language.class);
        startActivity(intent);
    }

    public void cpplanguage(View view) {
        Intent intent = new Intent(this, cpp_Language.class);
        startActivity(intent);
    }

    public void javalanguage(View view) {
        Intent intent = new Intent(this, Java_Language.class);
        startActivity(intent);
    }

    public void webDevelopment(View view) {
        Intent intent = new Intent(this, Web_Development.class);
        startActivity(intent);
    }

    public void pythonlanguage(View view) {
        Intent intent = new Intent(this, python_language.class);
        startActivity(intent);
    }

    }

