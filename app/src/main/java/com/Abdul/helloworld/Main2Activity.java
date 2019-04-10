package com.Abdul.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent E = getIntent();
        /*String pesan = E.getData().toString();
        TextView view = (TextView) findViewById(R.id.txtHello);
        view.setText(pesan);
*/

        //get extra
        String nama = getIntent().getStringExtra("nama");
        String pesanExtra = getIntent().getStringExtra( "msg");
        //giv data to textView
        TextView nm =(TextView) findViewById(R.id.txtHello);
        nm.setText(nama);
        TextView txt =(TextView) findViewById(R.id.txtHello);
        txt.setText(pesanExtra);
    }
}
