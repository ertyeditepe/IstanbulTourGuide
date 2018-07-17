package com.example.etoo.istanbultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.mall_of_istanbul,R.drawable.mallof,R.string.mall_desc_of_istanbul));
        items.add(new Item(R.string.mall_kanyon,R.drawable.kanyon,R.string.mall_desc_kanyon));
        items.add(new Item(R.string.mall_istinye,R.drawable.istinye,R.string.mall_desc_of_istanbul));
        items.add(new Item(R.string.mall_zorlu,R.drawable.zorlu,R.string.mall_desc_zorlu));
        items.add(new Item(R.string.mall_palladium,R.drawable.palladium,R.string.mall_desc_palladium));
        items.add(new Item(R.string.mall_akmerkez,R.drawable.akmerkez,R.string.mall_desc_akmerkez));
        items.add(new Item(R.string.mall_trump,R.drawable.trump,R.string.mall_desc_trump));
        items.add(new Item(R.string.mall_forum,R.drawable.forum,R.string.mall_desc_forum));
        items.add(new Item(R.string.mall_cevahir,R.drawable.cevahir,R.string.mall_desc_cevahir));
        items.add(new Item(R.string.mall_astoria,R.drawable.astoria,R.string.mall_desc_astoria));
        items.add(new Item(R.string.mall_nisantasi,R.drawable.city,R.string.mall_desc_nisantasi));
        items.add(new Item(R.string.mall_sapphire,R.drawable.sapphire,R.string.mall_desc_sapphire));
        items.add(new Item(R.string.mall_vialand,R.drawable.vialand,R.string.mall_desc_vialand));
        items.add(new Item(R.string.mall_aqua,R.drawable.aqua,R.string.mall_desc_aqua));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_malls);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item mItem = (Item) listView.getItemAtPosition(position);

                Intent descPage = new Intent(MallsActivity.this, DescPageActivity.class);

                descPage.putExtra("image", mItem.getImageResourceId());
                descPage.putExtra("description", mItem.getItemDescription());
                descPage.putExtra("title", mItem.getItemTitle());

                startActivity(descPage);
            }
        });
    }
}
