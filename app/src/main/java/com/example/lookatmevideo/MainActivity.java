package com.example.lookatmevideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        // for offine videos
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        //to use video from a url
        //lookAtMe.setVideoPath("http://website.com/video/mp4/62000/62792m.mp4");

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}