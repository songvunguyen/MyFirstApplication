package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "it's not working");
    }

    public void disable(View v){
        v.setEnabled(false);
        Button button = (Button) v;
        button.setText("Disabled");
        Log.d("success", "button disabled");
    }
}