package com.example.thandiwe.tourguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourthActivity extends AppCompatActivity {

    ImageView view,plate,plate2, salads,burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

      view =(ImageView)findViewById(R.id.next);
        plate =(ImageView)findViewById(R.id.image_plate);
        plate2 =(ImageView)findViewById(R.id.image_p1);
        salads =(ImageView)findViewById(R.id.image_salads);
        burger =(ImageView)findViewById(R.id.image_burger);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                view.setImageResource(R.drawable.beef);
                view.setImageResource(R.drawable.chicken);


            }
        });
    }
}
