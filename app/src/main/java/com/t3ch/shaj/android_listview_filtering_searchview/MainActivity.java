package com.t3ch.shaj.android_listview_filtering_searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView_ID);

        String[] countryName = getResources().getStringArray(R.array.countries_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.base_view, R.id.TV_ID, countryName);

        listView.setAdapter(adapter);
    }
}