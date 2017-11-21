package com.example.a32150.mybroadcastsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnClick(View v)    {
        switch(v.getId())   {
            case R.id.button:
                Intent it = new Intent("com.example.a32150.intent.action.CUSTOM_BROADCAST");//廣播傳送者不須註冊
                sendBroadcast(it);
                break;
        }
    }
}
