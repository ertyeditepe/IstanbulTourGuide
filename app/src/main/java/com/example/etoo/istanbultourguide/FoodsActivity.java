package com.example.etoo.istanbultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.kebap,R.mipmap.palace_icon, R.string.kebap_desc));
        items.add(new Item(R.string.doner,R.mipmap.palace_icon,R.string.doner_desc));
        items.add(new Item(R.string.borek,R.mipmap.palace_icon,R.string.borek_desc));
        items.add(new Item(R.string.pide,R.mipmap.palace_icon,R.string.pide_desc));
        items.add(new Item(R.string.lahmacun,R.mipmap.palace_icon,R.string.lahmacun_desc));
        items.add(new Item(R.string.kestane,R.mipmap.palace_icon,R.string.kestane_desc));
        items.add(new Item(R.string.misir,R.mipmap.palace_icon,R.string.misir_desc));
        items.add(new Item(R.string.balik_ekmek,R.mipmap.palace_icon,R.string.balik_ekmek_desc));
        items.add(new Item(R.string.simit,R.mipmap.palace_icon,R.string.simit_desc));
        items.add(new Item(R.string.acma,R.mipmap.palace_icon,R.string.acma_desc));
        items.add(new Item(R.string.pogaca,R.mipmap.palace_icon,R.string.pogaca_desc));
        items.add(new Item(R.string.midye_dolma,R.mipmap.palace_icon,R.string.midye_dolma_desc));
        items.add(new Item(R.string.kuru,R.mipmap.palace_icon,R.string.kuru_desc));
        items.add(new Item(R.string.menemen,R.mipmap.palace_icon,R.string.menemen_desc));
        items.add(new Item(R.string.kahvalti,R.mipmap.palace_icon,R.string.kahvalti_desc));
        items.add(new Item(R.string.meze,R.mipmap.palace_icon,R.string.meze_desc));
        items.add(new Item(R.string.manti,R.mipmap.palace_icon,R.string.manti_desc));
        items.add(new Item(R.string.kunefe,R.mipmap.palace_icon,R.string.kunefe_desc));
        items.add(new Item(R.string.baklava,R.mipmap.palace_icon,R.string.baklava_desc));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_foods);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item mItem = (Item) listView.getItemAtPosition(position);
                Intent descPage = new Intent(FoodsActivity.this, DescPageActivity.class);

                descPage.putExtra("image", mItem.getImageResourceId());
                descPage.putExtra("description", mItem.getItemDescription() );
                descPage.putExtra("title", mItem.getItemTitle());
                startActivity(descPage);

            }
        });
    }
}
