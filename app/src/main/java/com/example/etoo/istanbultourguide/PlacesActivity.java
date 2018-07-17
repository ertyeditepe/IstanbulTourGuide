package com.example.etoo.istanbultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.topkapi,R.drawable.topkapi,R.string.topkapi_desc));
        items.add(new Item(R.string.galata_kulesi,R.drawable.galata,R.string.galata_kulesi_desc));
        items.add(new Item(R.string.suleymaniye,R.drawable.suleymaniye,R.string.suleymaniye_desc));
        items.add(new Item(R.string.sultan_ahmet,R.drawable.sultanahmet,R.string.sultan_ahmet_desc));
        items.add(new Item(R.string.ayasofya,R.drawable.ayasofya,R.string.ayasofya_desc));
        items.add(new Item(R.string.yerebatan,R.drawable.yerebatan,R.string.yerebatan_desc));
        items.add(new Item(R.string.yedikule,R.drawable.yedikule,R.string.yedikule_desc));
        items.add(new Item(R.string.adalar,R.drawable.adalar,R.string.adalar_desc));
        items.add(new Item(R.string.camlica,R.drawable.camlica,R.string.camlica_desc));
        items.add(new Item(R.string.pierre_loti,R.drawable.pierre,R.string.pierre_loti_desc));
        items.add(new Item(R.string.taksim,R.drawable.taksin,R.string.taksim_desc));
        items.add(new Item(R.string.haydarpasa,R.drawable.haydarpasa,R.string.haydarpasa_desc));
        items.add(new Item(R.string.kiz_kulesi,R.drawable.kizkulesi,R.string.kiz_kulesi_desc));
        items.add(new Item(R.string.kapali_carsi,R.drawable.kapalicarsi,R.string.kapali_carsi_desc));
        items.add(new Item(R.string.emirgan,R.drawable.emirgan,R.string.emirgan_desc));
        items.add(new Item(R.string.anadolu_hisari,R.drawable.anadoluhisari,R.string.anadolu_hisari_desc));
        items.add(new Item(R.string.rumeli,R.drawable.rumelihisari,R.string.rumeli_desc));
        items.add(new Item(R.string.ciragan,R.drawable.ciragan,R.string.ciragan_desc));
        items.add(new Item(R.string.gulhane,R.drawable.gulhane,R.string.gulhane_desc));
        items.add(new Item(R.string.fener_balat,R.drawable.fenerbalat,R.string.fener_balat_desc));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_places);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item mItem = (Item) listView.getItemAtPosition(position);

                Intent descPage = new Intent(PlacesActivity.this, DescPageActivity.class);

                descPage.putExtra("image", mItem.getImageResourceId());
                descPage.putExtra("description", mItem.getItemDescription() );
                descPage.putExtra("title", mItem.getItemTitle());
                startActivity(descPage);
            }
        });


    }
}
