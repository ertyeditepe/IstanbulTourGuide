package com.example.etoo.istanbultourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.mall_of_istanbul,R.mipmap.palace_icon,R.string.mall_desc_of_istanbul));
        items.add(new Item(R.string.mall_kanyon,R.mipmap.palace_icon,R.string.mall_desc_kanyon));
        items.add(new Item(R.string.mall_istinye,R.mipmap.palace_icon,R.string.mall_desc_of_istanbul));
        items.add(new Item(R.string.mall_zorlu,R.mipmap.palace_icon,R.string.mall_desc_zorlu));
        items.add(new Item(R.string.mall_palladium,R.mipmap.palace_icon,R.string.mall_desc_palladium));
        items.add(new Item(R.string.mall_akmerkez,R.mipmap.palace_icon,R.string.mall_desc_akmerkez));
        items.add(new Item(R.string.mall_trump,R.mipmap.palace_icon,R.string.mall_desc_trump));
        items.add(new Item(R.string.mall_forum,R.mipmap.palace_icon,R.string.mall_desc_forum));
        items.add(new Item(R.string.mall_cevahir,R.mipmap.palace_icon,R.string.mall_desc_cevahir));
        items.add(new Item(R.string.mall_astoria,R.mipmap.palace_icon,R.string.mall_desc_astoria));
        items.add(new Item(R.string.mall_nisantasi,R.mipmap.palace_icon,R.string.mall_desc_nisantasi));
        items.add(new Item(R.string.mall_sapphire,R.mipmap.palace_icon,R.string.mall_desc_sapphire));
        items.add(new Item(R.string.mall_vialand,R.mipmap.palace_icon,R.string.mall_desc_vialand));
        items.add(new Item(R.string.mall_aqua,R.mipmap.palace_icon,R.string.mall_desc_aqua));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_malls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
