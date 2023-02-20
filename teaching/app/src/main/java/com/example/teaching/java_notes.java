package com.example.teaching;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class java_notes extends AppCompatActivity {

    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_notes);
        pdfListView=(ListView) findViewById(R.id.myPDFList);
        String[] pdfFiles = {"Chapter 1","Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6","Chapter 7","Chapter 8","Chapter 9","Chapter 10"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;

            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = pdfListView.getItemAtPosition(position).toString();

                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}