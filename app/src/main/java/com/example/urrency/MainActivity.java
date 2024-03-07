package com.example.urrency;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.listview);

        ArrayList<DataFlags> list = new ArrayList<>();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.RU,R.string.russian_capital));
        list.add(new DataFlags(R.drawable.za, R.string.south_african, R.string.SG,R.string.singapore_capital));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.ZA,R.string.south_african_capital));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.TR,R.string.turkish_capital));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.US,R.string.usa_capital));
        list.add(new DataFlags(R.drawable.jp, R.string.japan, R.string.JPY,R.string.japan_capital));
        list.add(new DataFlags(R.drawable.fr, R.string.france, R.string.FRF,R.string.france_capital));


        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.string.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}