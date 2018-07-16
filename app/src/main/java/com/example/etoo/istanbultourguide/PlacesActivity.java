package com.example.etoo.istanbultourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.topkapi,R.mipmap.palace_icon,R.string.topkapi_desc));
        items.add(new Item(R.string.galata_kulesi,R.mipmap.palace_icon,R.string.galata_kulesi_desc));
        items.add(new Item(R.string.suleymaniye,R.mipmap.palace_icon,R.string.suleymaniye_desc));
        items.add(new Item(R.string.sultan_ahmet,R.mipmap.palace_icon,R.string.sultan_ahmet_desc));
        items.add(new Item(R.string.ayasofya,R.mipmap.palace_icon,R.string.ayasofya_desc));
        items.add(new Item(R.string.yerebatan,R.mipmap.palace_icon,R.string.yerebatan_desc));
        items.add(new Item(R.string.yedikule,R.mipmap.palace_icon,R.string.yedikule_desc));
        items.add(new Item(R.string.adalar,R.mipmap.palace_icon,R.string.adalar_desc));
        items.add(new Item(R.string.camlica,R.mipmap.palace_icon,R.string.camlica_desc));
        items.add(new Item(R.string.pierre_loti,R.mipmap.palace_icon,R.string.pierre_loti_desc));
        items.add(new Item(R.string.taksim,R.mipmap.palace_icon,R.string.taksim_desc));
        items.add(new Item(R.string.haydarpasa,R.mipmap.palace_icon,R.string.haydarpasa_desc));
        items.add(new Item(R.string.kiz_kulesi,R.mipmap.palace_icon,R.string.kiz_kulesi_desc));
        items.add(new Item(R.string.kapali_carsi,R.mipmap.palace_icon,R.string.kapali_carsi_desc));
        items.add(new Item(R.string.emirgan,R.mipmap.palace_icon,R.string.emirgan_desc));
        items.add(new Item(R.string.anadolu_hisari,R.mipmap.palace_icon,R.string.anadolu_hisari_desc));
        items.add(new Item(R.string.rumeli,R.mipmap.palace_icon,R.string.rumeli_desc));
        items.add(new Item(R.string.ciragan,R.mipmap.palace_icon,R.string.ciragan_desc));
        items.add(new Item(R.string.gulhane,R.mipmap.palace_icon,R.string.gulhane_desc));
        items.add(new Item(R.string.fener_balat,R.mipmap.palace_icon,R.string.fener_balat_desc));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
