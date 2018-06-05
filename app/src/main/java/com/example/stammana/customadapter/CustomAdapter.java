package com.example.stammana.customadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.StudentViewHolder> {

    private List<Student> students;

    public CustomAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_student, parent, false);
        return new StudentViewHolder(studentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);
        holder.idView.setText(Integer.toString(student.getId()));
        holder.nameView.setText(student.getName());
        holder.phoneNumberView.setText(student.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        private TextView idView;
        private TextView nameView;
        private TextView phoneNumberView;

        public StudentViewHolder(View studentView) {
            super(studentView);
            idView = (TextView) studentView.findViewById(R.id.studentId);
            nameView = (TextView) studentView.findViewById(R.id.studentName);
            phoneNumberView = (TextView) studentView.findViewById(R.id.studentPhoneNumber);
        }
    }
}
