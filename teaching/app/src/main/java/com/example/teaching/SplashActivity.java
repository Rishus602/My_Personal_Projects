package com.example.teaching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    LottieAnimationView lottieAnimationView;
    float v=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashActivity.this , LoginActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();

        lottieAnimationView = findViewById(R.id.lottie);
        lottieAnimationView.animate().alpha(v).setDuration(0);


    }
}