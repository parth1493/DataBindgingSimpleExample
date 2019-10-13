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
        Student student = new Student("Parth","parth1493@gmail.com");
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mActivityMainBinding.setStudent(student);

        mEventHandlerDatabinding = new EventHandlerDatabinding(this);
        mActivityMainBinding.setEventHandler(mEventHandlerDatabinding);
    }


}
