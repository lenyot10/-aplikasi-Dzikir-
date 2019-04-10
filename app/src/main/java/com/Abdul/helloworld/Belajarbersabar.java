package com.Abdul.helloworld;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.FILL_HORIZONTAL;

public class Belajarbersabar extends AppCompatActivity {


    public int angka = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajarbersabar);
    }

    public void hitung(View view) {
        angka++;
        Vibrator Vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        if (angka == 33) {
            Vibe.vibrate(2000);
        }
        if (angka == 34) {
            reset(view);
        }


        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(Integer.toString(angka));
    }

    public void kurang(View view) {
        angka--;
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(Integer.toString(angka));
        if (angka == 0) {
            reset(view);
        }
    }

    public void reset(View view) {
        angka = 0;
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(Integer.toString(angka));

        String reset = "Berhasil direset";
        Toast motif = Toast.makeText(this, reset, Toast.LENGTH_LONG);
        motif.setGravity(Gravity.FILL_HORIZONTAL, 0, -500);
        motif.show();
    }
}