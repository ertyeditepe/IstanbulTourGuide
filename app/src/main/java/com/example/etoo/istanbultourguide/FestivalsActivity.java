package com.example.etoo.istanbultourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.fest_kukla,R.mipmap.palace_icon,R.string.fest_desc_kukla));
        items.add(new Item(R.string.fest_dans,R.mipmap.palace_icon,R.string.fest_desc_dans));
        items.add(new Item(R.string.fest_film,R.mipmap.palace_icon,R.string.fest_desc_film));
        items.add(new Item(R.string.fest_sahaf,R.mipmap.palace_icon,R.string.fest_desc_sahaf));
        items.add(new Item(R.string.fest_shopping,R.mipmap.palace_icon,R.string.fest_desc_shopping));
        items.add(new Item(R.string.fest_tasarım,R.mipmap.palace_icon,R.string.fest_desc_tasarım));
        items.add(new Item(R.string.fest_caz,R.mipmap.palace_icon,R.string.fest_caz));
        items.add(new Item(R.string.fest_chill,R.mipmap.palace_icon,R.string.fest_desc_chill));
        items.add(new Item(R.string.fest_bagimsiz_filmler,R.mipmap.palace_icon,R.string.fest_desc_bagimsiz));
        items.add(new Item(R.string.fest_opera,R.mipmap.palace_icon,R.string.fest_desc_opera));
        items.add(new Item(R.string.fest_dogaclama,R.mipmap.palace_icon,R.string.fest_desc_dogaclama));
        items.add(new Item(R.string.fest_coke,R.mipmap.palace_icon,R.string.fest_desc_coke));
        items.add(new Item(R.string.fest_eksi,R.mipmap.palace_icon,R.string.fest_desc_eksi));
        items.add(new Item(R.string.fest_muzik,R.mipmap.palace_icon,R.string.fest_desc_müzik));
        items.add(new Item(R.string.fest_fanta,R.mipmap.palace_icon,R.string.fest_desc_fanta));
        items.add(new Item(R.string.fest_one_love,R.mipmap.palace_icon,R.string.fest_desc_one_love));
        items.add(new Item(R.string.fest_igf,R.mipmap.palace_icon,R.string.fest_desc_igf));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_festivals);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
