package com.example.shrish.adapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView lv =findViewById(R.id.Relatives);
        final ArrayList<word> list =new ArrayList<>();

        list.add(new word("father","Achan",R.raw.father,R.drawable.family_father));
        list.add(new word("mother","Amma",R.raw.mother,R.drawable.family_mother));
        list.add(new word("son","Makan",R.raw.son,R.drawable.family_son));
        list.add(new word("daughter","Makal",R.raw.daughter,R.drawable.family_daughter));
        list.add(new word("grandfather","Appoppan",R.raw.grandfather,R.drawable.family_grandfather));
        list.add(new word("garndmother","Ammoomma",R.raw.grandmother,R.drawable.family_grandmother));
        list.add(new word("older brother","Cheeta",R.raw.eldrbrother,R.drawable.family_older_brother));
        list.add(new word("Yonger sister","Anuja",R.raw.youngersister,R.drawable.family_younger_brother));

        customAdapter adapter=new customAdapter(Main3Activity.this,list);
        lv.setAdapter(adapter);





    }
}
