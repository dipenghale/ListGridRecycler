package com.example.listgridrecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity  {
    private GridView gridView;
    // private int[] imageIds = {R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6};
    private String[] items = {"Go to Listview", "Item 2", "Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10","Item 11","Item 12","Item 13","Item 14","Item 15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view_layout);
        gridView = findViewById(R.id.gridview);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, items);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedId = items[position];
                Toast.makeText(GridViewActivity.this, "Item " + selectedId + " clicked", Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent intent = new Intent(GridViewActivity.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}
