package com.example.stammana.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRecyclerViewData();

    }

    private void setRecyclerViewData() {
        List<Student> students = getStudentsData();
        RecyclerView recyclerView = findViewById(R.id.students);
        recyclerView.setAdapter(new CustomAdapter(students));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }


    private List<Student> getStudentsData() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "ABC", "1234567890");
        Student student2 = new Student(2, "DEF", "1234567890");
        Student student3 = new Student(3, "GHI", "1234567890");
        Student student4 = new Student(4, "JKL", "1234567890");
        Student student5 = new Student(5, "MNO", "1234567890");
        Student student6 = new Student(6, "PQR", "1234567890");
        students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}
