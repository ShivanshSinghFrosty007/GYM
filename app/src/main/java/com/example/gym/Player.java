package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Player extends AppCompatActivity {

    VideoView videoView;
    String url;
    TextView textView;
    TextView timerTxt;
    Button startBtn, resetBtn;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        textView = findViewById(R.id.work_text);
        timerTxt = findViewById(R.id.timerTxt);
        startBtn = findViewById(R.id.start);
        resetBtn = findViewById(R.id.reset);

        url = getIntent().getStringExtra("url");
        textView.setText(getIntent().getStringExtra("text"));

        videoView = findViewById(R.id.video);
        Uri uri = Uri.parse(url);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        videoView.start();
    }

    public void start(View v){
        startBtn.setVisibility(View.GONE);
        resetBtn.setVisibility(View.VISIBLE);

        countDownTimer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {
                timerTxt.setText(String.format(Locale.ENGLISH, "%02d", TimeUnit.MILLISECONDS.toSeconds(l)));
            }

            @Override
            public void onFinish() {
                startBtn.setVisibility(View.VISIBLE);
                resetBtn.setVisibility(View.GONE);
            }
        }.start();
    }

    public void reset(View v){
        try {
            countDownTimer.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
        timerTxt.setText("00");
        startBtn.setVisibility(View.VISIBLE);
        resetBtn.setVisibility(View.GONE);
    }
}