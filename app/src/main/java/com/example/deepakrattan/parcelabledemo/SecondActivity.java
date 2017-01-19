package com.example.deepakrattan.parcelabledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private TextView txtName, txtAge, txtCourse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //findViewByID

        txtName = (TextView) findViewById(R.id.txtName);
        txtAge = (TextView) findViewById(R.id.txtAge);
        txtCourse = (TextView) findViewById(R.id.txtCourse);

        //  Student student = getIntent().getParcelableExtra("student");

       /* txtName.setText(student.name);
        txtAge.setText(student.age);
        txtCourse.setText(student.course);*/

        ArrayList<Student> studentArrayList = getIntent().getParcelableArrayListExtra("StudentList");
        for (int i = 0; i < studentArrayList.size(); i++) {

            Student s = studentArrayList.get(i);

            Toast.makeText(SecondActivity.this, "Name " + s.name + "Age" + s.age + "Course" + s.course, Toast.LENGTH_LONG).show();

        }
    }
}
