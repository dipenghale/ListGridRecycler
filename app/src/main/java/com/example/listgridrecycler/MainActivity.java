package com.example.listgridrecycler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] items = {"Go to Gridview", "Go to RecyclerView", "Item 3",
            "Item 4","Item 5","Item 6","Item 7","Item 8",
            "Item 9","Item 10","Item 11","Item 12","Item 13"
            ,"Item 14","Item 15","Item 16","Item 17","Item 18","Item 19","Item 20"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_layout, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = items[position];
            Toast.makeText(MainActivity.this, selectedItem + " clicked", Toast.LENGTH_SHORT).show();
            if(position==0){
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);

            }

            if(position==1){
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);

            }
        });


    }
}