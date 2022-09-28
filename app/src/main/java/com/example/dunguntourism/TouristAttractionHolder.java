package com.example.dunguntourism;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TouristAttractionHolder extends RecyclerView.ViewHolder{

    TextView name;
    ImageView image;
    Context context;
    ArrayList<TouristAttraction> tA_ArrayList;

    public TouristAttractionHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tvTouristAttractionName);
        image = itemView.findViewById(R.id.ivTouristAttractionImg);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TouristAttractionDescriptionActivity.class);
                int position = getAdapterPosition();
                intent.putExtra("name",tA_ArrayList.get(position).getName());
                intent.putExtra("description",tA_ArrayList.get(position).getDescription());
                intent.putExtra("gmURL",tA_ArrayList.get(position).getGmURL());
                intent.putExtra("gpURL",tA_ArrayList.get(position).getGpURL());
                intent.putExtra("imageID",tA_ArrayList.get(position).getImageID());
                context.startActivity(intent);
            }
        });
    }
}
