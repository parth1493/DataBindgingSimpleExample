package com.parth.databindgingsimpleexample;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventHandlerDatabinding {

    private Context context;

    public EventHandlerDatabinding(Context context) {
        this.context = context;
    }

    public void enrollButtonClickEvent(View view){
        Toast.makeText(context, "Enroll button click", Toast.LENGTH_SHORT).show();
    }

    public void cancelButtonClickEvent(View view){
        Toast.makeText(context, "cancel Button click", Toast.LENGTH_SHORT).show();
    }
}
