package com.example.shrish.adapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ListView lv = findViewById(R.id.phrases);
        final ArrayList<word> list =new ArrayList<>();
        ImageView iv =findViewById(R.id.image1);


        list.add(new word("What is your name?","ningalude peranthanu",R.raw.a1,R.drawable.ic_sentiment_satisfied_black_24dp));//why it doesn't work with 1
        list.add(new word("I heartily thank everyone","ellavarkum ente manasniranja nanni",R.raw.a2,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("My name is Shrish","enne peru Shrish ennanu",R.raw.a3,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("Hello","Namaskaram",R.raw.a4,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("I'm fine","enika sukhmanu",R.raw.a5,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("I don't know","enikku ariyilla",R.raw.a6,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("sit","irriku",R.raw.a7,R.drawable.ic_sentiment_satisfied_black_24dp));
        list.add(new word("Did you understand?","Ningalkku mannassilayo",R.raw.a8,R.drawable.ic_sentiment_satisfied_black_24dp));

        customAdapter adapter=new customAdapter(Main5Activity.this,list);
        lv.setAdapter(adapter);






    }
}
