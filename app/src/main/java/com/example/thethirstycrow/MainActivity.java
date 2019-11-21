package com.example.thethirstycrow;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //create class reference
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vid = (VideoView)findViewById(R.id.videoView);

    }

    public void playVideo(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

        String path = "android.resource://com.example.thethirstycrow/"+R.raw.videop;

        Uri u = Uri.parse(path);

        vid.setVideoURI(u);

        vid.start();

    }
}