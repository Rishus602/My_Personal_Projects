package com.example.teaching;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Chapter 1")){

            myPDFViewer.fromAsset("Chapter_1.pdf").load();
        }
        if(getItem.equals("Chapter 2")){

            myPDFViewer.fromAsset("Chapter_2.pdf").load();
        }
    }
}