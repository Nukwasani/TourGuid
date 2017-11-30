package com.example.thandiwe.tourguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {


    TourRecyclerView tourRecyclerView;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Tour> tours = new ArrayList<Tour>();

        Tour t =new Tour();


        t.setName("Authentic cousine");
        t.setDesceiption("This is where u can get all kinds of South African food such as mugodu, pap etc" +
                         "It is located at different developing townships" +
                           "If you want to exprience the township life of SA this is the place to go");
        t.setImage(R.drawable.food);
        tours.add(t);

        Tour t1 =new Tour();
        t1.setName("Lesure Hotel");
        t1.setDesceiption("Lesure Hotel is one of the famous five star hotel" +
                          "It is located at midrand. its include single, double abd horney moon suites." +
                           "there are bars, clubs and out door activities");
        t1.setImage(R.drawable.building);
        tours.add(t1);


        Tour t2 =new Tour();
        t2.setName("Lets Drink Bar");
        t2.setDesceiption("one of the popular bars around Midrand." +
                         "   Its a place where you can relax na listen to jazz music.");
        t2.setImage(R.drawable.bar);
        tours.add(t2);


        Tour t3 =new Tour();
        t3.setName("Adventures");
        t3.setDesceiption("Adventures/ activities that you can do including surfing, hicking, " +
                          " animal watching and may more");
        t3.setImage(R.drawable.out_door);
        tours.add(t3);

        tourRecyclerView = new TourRecyclerView(this, tours);

        recyclerView.setAdapter(tourRecyclerView);
    }
}
