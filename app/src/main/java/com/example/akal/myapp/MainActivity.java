package com.example.akal.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText eTextname;
    Button btnsubmit;
    void initviews(){
        eTextname = (EditText)findViewById(R.id.editText);
        btnsubmit = (Button) findViewById(R.id.button);
        btnsubmit.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        Toast.makeText(this,"activityone-on create",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"activityone-on start",Toast.LENGTH_LONG).show();
        Log.i("keyactivityone","onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"activityone-on pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"activityone-on resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"activityone-on stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"activityone- on destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"activityone- on restart",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            String str1 = eTextname.getText().toString().trim();
            Toast.makeText(this,"you clicked it:"+str1,Toast.LENGTH_LONG).show();
        }

    }
}
