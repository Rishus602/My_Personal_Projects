package com.example.teaching;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bookspdf1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookspdf1);
        String url = getIntent().getStringExtra("pdf_url");
        WebView webView = findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);
    }
}