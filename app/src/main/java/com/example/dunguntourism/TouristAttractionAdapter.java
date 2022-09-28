package com.example.dunguntourism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TouristAttractionAdapter extends RecyclerView.Adapter<TouristAttractionHolder>{

    Context context;
    ArrayList<TouristAttraction> ta_ArrayList;

    public TouristAttractionAdapter(Context context, ArrayList<TouristAttraction> ta_ArrayList) {
        this.context = context;
        this.ta_ArrayList = ta_ArrayList;
    }

    @NonNull
    @Override
    public TouristAttractionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tourist_attraction, parent, false);
        return new TouristAttractionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TouristAttractionHolder holder, int position) {

        holder.name.setText(ta_ArrayList.get(position).getName());
        holder.image.setImageResource(ta_ArrayList.get(position).getImageID());
        holder.context = this.context;
        holder.tA_ArrayList = this.ta_ArrayList;
    }

    @Override
    public int getItemCount() {
        return ta_ArrayList.size();
    }
}