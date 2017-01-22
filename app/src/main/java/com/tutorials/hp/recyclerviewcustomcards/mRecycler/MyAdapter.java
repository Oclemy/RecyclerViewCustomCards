package com.tutorials.hp.recyclerviewcustomcards.mRecycler;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerviewcustomcards.R;
import com.tutorials.hp.recyclerviewcustomcards.Spacecraft;

import java.util.ArrayList;

/**
 * Created by Oclemy on 8/7/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Spacecraft> spacecrafts;


    public MyAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    //VIEW ITEM
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        //CURRENT SPACECRAFT
        Spacecraft s=spacecrafts.get(position);

        //BIND DATA
        holder.nameTxt.setText(s.getName());
        holder.propellantTxt.setText(s.getPropellant());
        holder.img.setImageResource(s.getImage());


    }

    //TOTAL SPACECRAFTS
    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}
