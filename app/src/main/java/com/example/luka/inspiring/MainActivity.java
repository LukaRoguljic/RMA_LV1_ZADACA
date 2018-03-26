package com.example.luka.inspiring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView OppenheimerImage  = findViewById  (R.id.OppenheimerImageView);
        ImageView NewtonImage       = findViewById  (R.id.NewtonImageView);
        ImageView HiggsImage        = findViewById  (R.id.HiggsImageView);

        OppenheimerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"I am become, the destroyer of worlds!",Toast.LENGTH_SHORT).show();
            }
        });

        NewtonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"I can calculate the motion of heavenly bodies, but not the madness of people.",Toast.LENGTH_SHORT).show();
            }
        });

        HiggsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Nobody else took what I was doing seriously, so nobody would want to work with me. I was tought to be a bit eccentric and maybe cranky.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
