package com.example.shrish.adapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ListView lv=findViewById(R.id.colours);
        final ArrayList<word> list =new ArrayList<>();

        list.add(new word("black","karuppa",R.raw.black1,R.drawable.color_black));
        list.add(new word("brown","tavitu niram",R.raw.brown,R.drawable.color_brown));
        list.add(new word("yellow","manya",R.raw.yellow,R.drawable.color_dusty_yellow));
        list.add(new word("gray","jaray niram",R.raw.grey,R.drawable.color_gray));
        list.add(new word("green","pachcha",R.raw.green,R.drawable.color_green));
        list.add(new word("red","chuvappa",R.raw.red,R.drawable.color_red));
        list.add(new word("white","elluppa",R.raw.white,R.drawable.color_white));

        customAdapter adapter=new customAdapter(Main4Activity.this,list);
        lv.setAdapter(adapter);


    }
}
