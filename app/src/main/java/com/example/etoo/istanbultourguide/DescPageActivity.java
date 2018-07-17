package com.example.etoo.istanbultourguide;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescPageActivity extends AppCompatActivity {
    ImageView itemImage;
    TextView itemDescription;
    ActionBar actionBar = getActionBar();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_page);

        itemImage = findViewById(R.id.item_image);
        itemDescription = findViewById(R.id.description);

        Bundle extras = getIntent().getExtras();

        if (extras == null)
        {return;}

        int imageRes = extras.getInt("image");
        itemImage.setImageResource(imageRes);

        itemDescription.setText(extras.getString("description"));

        actionBar.setTitle(extras.getInt("title"));

    }
}
