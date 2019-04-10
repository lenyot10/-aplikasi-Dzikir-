package com.Abdul.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
       /* public void senddata(View v) {
            EditText edit = (EditText)findViewById(R.id.pass);
            String pesan = edit.getText().toString();
             Intent intent = new Intent(this, Main2Activity.class);
             intent.setData(Uri.parse(pesan));
             startActivity(intent);
        }*/
        public void sendExtras(View view){
            EditText nm =(EditText)findViewById(R.id.pass);
            String nama= nm.getText().toString();
            EditText input =(EditText)findViewById(R.id.pass);
            String pesan= input.getText().toString();
            Intent intent = new Intent(this, Main2Activity.class);

            intent.putExtra("nama",nama);
            intent.putExtra("msg",pesan);
            startActivity(intent);

        }






public void changeText (View view){
    TextView helloText = (TextView)findViewById(R.id.text1);
    helloText.setText("Welcome to Aplikasi Sederhana ! ");

}
public void getTotext1(View v){
    Intent daftar= new Intent(this,Belajarbersabar.class);
    startActivity(daftar);
}
}

