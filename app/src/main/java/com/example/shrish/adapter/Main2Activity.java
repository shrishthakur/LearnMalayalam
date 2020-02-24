package com.example.shrish.adapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lv = findViewById(R.id.number);
        ImageView iv=findViewById(R.id.image2);

      final   ArrayList<word> list =new ArrayList<>();

        list.add(new word("one","on-nuh",R.raw.one,R.drawable.number_one));
        list.add(new word("two","rrunn-duh",R.raw.two,R.drawable.number_two));
        list.add(new word("three","moon-uh",R.raw.three,R.drawable.number_three));
        list.add(new word("four","naal-lu",R.raw.four,R.drawable.number_four));
        list.add(new word("five","anj-uh",R.raw.fivr,R.drawable.number_five));
        list.add(new word("six","aarr-uh",R.raw.six,R.drawable.number_six));
        list.add(new word("seven","yeh-rruh",R.raw.seven,R.drawable.number_seven));
        list.add(new word("eight","et-duh",R.raw.eight,R.drawable.number_eight));
        list.add(new word("nine","onpa-duh",R.raw.nine,R.drawable.number_nine));
        list.add(new word("ten","pat-duh",R.raw.ten,R.drawable.number_ten));



        customAdapter adapter=new customAdapter(Main2Activity.this,list);
        lv.setAdapter(adapter);

       /* lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                word w = list.get(i);
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this,w.getSound());
                mp.start();
            }
        });*/

    }
}
