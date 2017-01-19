package com.example.deepakrattan.parcelabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtName, edtAge, edtCourse;
    private Button btnNext;
    String name, age, course;
    private Student student, student1, student2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        edtAge = (EditText) findViewById(R.id.edtAge);
        edtCourse = (EditText) findViewById(R.id.edtCourse);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = edtName.getText().toString();
                age = edtAge.getText().toString();
                course = edtCourse.getText().toString();
                student = new Student(name, age, course);
                student1 = new Student("Deepak", "30", "MCA");
                student2 = new Student("Raj", "31", "BCA");

                //PAssing a single Student object

               /* Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("student", student);
                startActivity(intent);*/

                //PAssing an arraylist of student object
                ArrayList<Student> studentList = new ArrayList<Student>();
                studentList.add(student1);
                studentList.add(student2);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putParcelableArrayListExtra("StudentList", studentList);
                startActivity(intent);

            }
        });

    }
}
