package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button,button2,button3,button4,button5,button6,button7;
    SoundPool soundPool;
    private static int SoundID, Sound2ID, Sound3ID, Sound4ID, Sound5ID, Sound6ID, Sound7ID;
    private static float LeftVolume = 1.0f;
    private static float RightVolume = 1.0f;
    private static int Priority = 1;
    private static int No_Loop = 0;
    private static float Speed_Rate = 1.0f;


    private static int Music_Number = 7;
    private static int Scr_Quality = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("check","Yes 1");
        button = findViewById(R.id.buttonID);
        button2 = findViewById(R.id.button2ID);
        button3 = findViewById(R.id.button3ID);
        button4 = findViewById(R.id.button4ID);
        button5 = findViewById(R.id.button5ID);
        button6 = findViewById(R.id.button6ID);
        button7 = findViewById(R.id.button7ID);

        soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);


        SetButtonInOneClickListner();
        FindID();
    }

    private void SetButtonInOneClickListner() {
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
    }

    private void FindID() {
        SoundID = soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        Sound2ID = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        Sound3ID = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        Sound4ID = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        Sound5ID = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        Sound6ID = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        Sound7ID = soundPool.load(getApplicationContext(),R.raw.note7_b,1);
        Log.d("check","Yes 3");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonID:
                soundPool.play(SoundID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button2ID:
                soundPool.play(Sound2ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button3ID:
                soundPool.play(Sound3ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button4ID:
                soundPool.play(Sound4ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button5ID:
                soundPool.play(Sound5ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button6ID:
                soundPool.play(Sound6ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;
            case R.id.button7ID:
                soundPool.play(Sound7ID,LeftVolume,RightVolume,Priority,No_Loop,Speed_Rate);
                break;

        }

    }
}