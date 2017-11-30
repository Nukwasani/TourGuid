package com.example.thandiwe.tourguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FifthActivity extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        imageView1 =(ImageView)findViewById(R.id.imageView5);
        imageView2 =(ImageView)findViewById(R.id.imageView6);
        imageView3 =(ImageView)findViewById(R.id.imageView7);
        imageView4 =(ImageView)findViewById(R.id.imageView8);
    }
}
