package com.example.thandiwe.tourguid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {



    TextView tv, tv1;
     Button btn,btn_lesur;
    ImageView images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        tv=(TextView)findViewById(R.id.textView5);
        tv1=(TextView)findViewById(R.id.textView6);
        btn=(Button) findViewById(R.id.button2);
        btn_lesur=(Button) findViewById(R.id.lesure_btn);


        Intent intent = getIntent();
        Tour tour =(Tour) intent.getSerializableExtra("name");


        tv.setText(tour.getName() + "\n" + "\n" +tour.getDesceiption());


        images =(ImageView)findViewById(R.id.imageView2);


        images.setImageResource(tour.getImage());

        tv1.setText("Tell No: 011 462 4566" + "\n" +
                    "Cell No: 073 2456 2222"+ "\n" +
                     "Email: tours@SA.com");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ThirdActivity.this,FourthActivity.class );
                startActivity(intent1);
            }
        });



        btn_lesur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(ThirdActivity.this,FifthActivity.class );
                startActivity(intent2);
            }
        });
    }
}
