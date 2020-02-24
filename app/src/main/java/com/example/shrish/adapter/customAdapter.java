package com.example.shrish.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHRISH on 10-03-2018.
 */

public class customAdapter extends ArrayAdapter<word>{//what is super class and why extends?

    boolean paused = true;
    private static MediaPlayer mp;
    Context context;
    ArrayList<word> list;

    public customAdapter(@NonNull Context context, @NonNull ArrayList objects) {   //constructor
        super(context,0, objects);//why resources zero?// what is super

        this.context=context;
        list =objects;
    }

    @Override       //why override used here
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public word getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.layoutnum, parent, false);
        //what is layout inflator? what are its parameters


        final word w = list.get(position);
        final TextView t1 = convertView.findViewById(R.id.eng);//why dot before find view byid?
       final TextView t2 = convertView.findViewById(R.id.mal);
        ImageView iv1 = convertView.findViewById(R.id.image1);
        final ImageView iv2 = convertView.findViewById(R.id.image2);
        LinearLayout ll =convertView.findViewById(R.id.linlay);

        if(w.image==R.drawable.ic_sentiment_satisfied_black_24dp)
        {iv1.setVisibility(View.GONE);}
       /* if(w.getImage()==1)
        {iv1.setVisibility(View.GONE);}*/


        t1.setText(w.getEnglish());
        t2.setText(w.getMalayalam());
        iv1.setImageResource(w.getImage());

         mp = MediaPlayer.create(context,w.getSound());
        iv2.setImageResource(R.drawable.ic_play_arrow_black_24dp);


         String s="";
        iv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /*if (paused) {
                    mp = MediaPlayer.create(context, w.getSound());
                    mp.start();
                    paused = false;
                    iv2.setImageResource(R.drawable.ic_pause_black_24dp);
                } else {
                    if (mp != null && mp.isPlaying()) {
                        mp.stop();
                        paused = true;
                        iv2.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        //when MediaPlayer paused, startbutton is shown
                    }*/


                if(mp.isPlaying()==false) {
                    mp = MediaPlayer.create(context, w.getSound());
                    mp.start();
                }
                if(mp.isPlaying()) {
                    iv2.setImageResource(R.drawable.ic_pause_black_24dp);

                }

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        iv2.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                    }
                });
                }

            });

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=t1.getText().toString();
                t1.setText(t2.getText().toString());//how is the text changing even when declared final?
                t2.setText(s);

            }
        });







       /* mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                           @Override
                                           public void onCompletion(MediaPlayer mediaPlayer) {
                                               iv2.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                                           }
                                       });*/


        /*iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp!=null && mp.isPlaying()){
                    mp.stop();}
            }
        });*/




        return convertView;
    }


    }

