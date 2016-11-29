package com.libin.audiodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  Audio mAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAudio=new Audio();
    }
    public   void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_record:
                mAudio.startRecord();
                break;
            case R.id.btn_stop_record:
                mAudio.stopRecord();
                break;
            case R.id.btn_play:
                mAudio.play();
                break;
            case R.id.btn_stop_play:
                mAudio.stopPlay();
                break;
            case R.id.btn_instantplay:
              mAudio.instantplay();
                break;
            case R.id.btn_stop_instantplay:
                mAudio.stopInstantplay();
                break;
        }
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}


