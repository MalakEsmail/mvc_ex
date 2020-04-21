package com.example.simple_mvc_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public StudentController controller;
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.txtViewId);

        Student model = retriveStudetnFromDatabase();
        MainActivity view = new MainActivity();
        controller = new StudentController(model,view);
        textView.setText("Student name is : "+controller.getStudentName()+" And my  num is : "+controller.getStudentRoll());
    }
    private Student retriveStudetnFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }


}
