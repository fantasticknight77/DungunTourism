package com.example.dunguntourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TouristAttractionDescriptionActivity extends AppCompatActivity {

    TextView name, description;
    ImageView image, map, picture;
    String googleMapURL, googleImageURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attraction_description);

        name = findViewById(R.id.tv_Name);
        description = findViewById(R.id.tv_description);
        image = findViewById(R.id.iv_Image);
        map = findViewById(R.id.iv_Map);
        picture = findViewById(R.id.iv_Picture);

        String taName = getIntent().getExtras().getString("name");
        name.setText(taName);

        String taDescription = getIntent().getExtras().getString("description");
        description.setText(taDescription);

        int taImage = getIntent().getExtras().getInt("imageID");
        image.setImageResource(taImage);

        googleMapURL = getIntent().getExtras().getString("gmURL");
        googleImageURL = getIntent().getExtras().getString("gpURL");

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(googleMapURL));
                startActivity(intent);
            }
        });

        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(googleImageURL));
                startActivity(intent);
            }
        });
    }
}