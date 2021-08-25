package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "it's not working");
    }

//    public void disable(View v){
////        v.setEnabled(false);
////        Button button = (Button) v;
////        button.setText("Disabled");
////        Log.d("success", "button disabled");
//        View myView = findViewById(R.id.button5);
//        myView.setEnabled(false);
//        Button button = (Button) myView;
//        button.setText("New Disabled");
//    }

    public void handleText(View v){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
//        Log.d("info", input);

        //Alert take (Activity, text, duration)
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }
}