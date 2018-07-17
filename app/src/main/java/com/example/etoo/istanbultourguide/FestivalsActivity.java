package com.example.etoo.istanbultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.fest_kukla, R.drawable.kukla, R.string.fest_desc_kukla));
        items.add(new Item(R.string.fest_dans, R.drawable.dans, R.string.fest_desc_dans));
        items.add(new Item(R.string.fest_film, R.drawable.film, R.string.fest_desc_film));
        items.add(new Item(R.string.fest_sahaf, R.drawable.sahaf, R.string.fest_desc_sahaf));
        items.add(new Item(R.string.fest_shopping , R.drawable.shopping, R.string.fest_desc_shopping));
        items.add(new Item(R.string.fest_tasarım, R.drawable.tasar_m, R.string.fest_desc_tasarım));
        items.add(new Item(R.string.fest_caz, R.drawable.caz, R.string.fest_caz));
        items.add(new Item(R.string.fest_chill, R.drawable.chill, R.string.fest_desc_chill));
        items.add(new Item(R.string.fest_bagimsiz_filmler, R.drawable.bagimsiz, R.string.fest_desc_bagimsiz));
        items.add(new Item(R.string.fest_opera,R.drawable.opera, R.string.fest_desc_opera));
        items.add(new Item(R.string.fest_dogaclama, R.drawable.dogaclama, R.string.fest_desc_dogaclama));
        items.add(new Item(R.string.fest_coke, R.drawable.coke, R.string.fest_desc_coke));
        items.add(new Item(R.string.fest_eksi, R.drawable.eksi, R.string.fest_desc_eksi));
        items.add(new Item(R.string.fest_muzik, R.drawable.muzik, R.string.fest_desc_müzik));
        items.add(new Item(R.string.fest_fanta, R.drawable.fanta, R.string.fest_desc_fanta));
        items.add(new Item(R.string.fest_one_love, R.drawable.onelove, R.string.fest_desc_one_love));
        items.add(new Item(R.string.fest_igf, R.drawable.igf, R.string.fest_desc_igf));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_festivals);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Item mItem = (Item) listView.getItemAtPosition(position);
                Intent descPage = new Intent(FestivalsActivity.this, DescPageActivity.class);

                descPage.putExtra("image", mItem.getImageResourceId());
                descPage.putExtra("description", mItem.getItemDescription() );
                descPage.putExtra("title", mItem.getItemTitle());
                startActivity(descPage);

            }
        });

    }

}
