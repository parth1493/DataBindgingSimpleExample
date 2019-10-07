package com.parth.databindgingsimpleexample;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.parth.databindgingsimpleexample.databinding.ActivityMainBinding;
import com.parth.databindgingsimpleexample.databinding.ActivitySecondBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding mActivitySecondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mActivitySecondBinding = DataBindingUtil.setContentView(this,R.layout.activity_second);
        mActivitySecondBinding.setStudent(getCurrentStudent());

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private Student getCurrentStudent(){
        Student student = new Student();
        student.setName("Parth");
        student.setEmail("parth1493@gmail.com");
        return student;
    }

}
