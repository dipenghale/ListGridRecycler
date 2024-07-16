package com.example.listgridrecycler;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity implements StudentAdapter.OnItemClickListener {
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<studentData> studentDataList = new ArrayList<>();
    //@TargetApi(Build.VERSION_CODES.O)

    //private StudentAdapter.OnItemClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);
        recyclerView = findViewById(R.id.recycler_view);
        studentAdapter=new StudentAdapter(studentDataList,this);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();

    }

    private void StudentDataPrepare() {
        studentData data=new studentData("sai",25);
        studentDataList.add(data);
        data=new studentData("dai",25);
        studentDataList.add(data);
        data=new studentData("raghu",20);
        studentDataList.add(data);
        data=new studentData("raj",28);
        studentDataList.add(data);
        data=new studentData("amar",15);
        studentDataList.add(data);
        data=new studentData("bapu",19);
        studentDataList.add(data);
        data=new studentData("chandra",52);
        studentDataList.add(data);
        data=new studentData("deraj",30);
        studentDataList.add(data);
        data=new studentData("eshanth",28);
        studentDataList.add(data);

        // Notify the adapter that data has changed
        studentAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(int position) {
        studentData clickedStudent = studentDataList.get(position);
        Toast.makeText(this, "Clicked: " + clickedStudent.getName() + " "+clickedStudent.getAge(), Toast.LENGTH_SHORT).show();
    }
}