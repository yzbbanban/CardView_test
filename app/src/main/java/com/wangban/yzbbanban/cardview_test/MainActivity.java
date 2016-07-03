package com.wangban.yzbbanban.cardview_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter adapter;
    private List<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        for (int i = 0; i < 50; i++) {
            numbers.add(i);

        }
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,numbers);

        lv.setAdapter(adapter);

    }

}
