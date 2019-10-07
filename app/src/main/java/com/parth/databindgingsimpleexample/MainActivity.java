package com.parth.databindgingsimpleexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.parth.databindgingsimpleexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;
    private EventHandlerDatabinding mEventHandlerDatabinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mActivityMainBinding.setStudent(getCurrentStudent());

        mEventHandlerDatabinding = new EventHandlerDatabinding(this);
        mActivityMainBinding.setEventHandler(mEventHandlerDatabinding);
    }

    private Student getCurrentStudent(){
        Student student = new Student();
        student.setName("Parth");
        student.setEmail("parth1493@gmail.com");
        return student;
    }
}
