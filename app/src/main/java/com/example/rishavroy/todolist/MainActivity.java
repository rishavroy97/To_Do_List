package com.example.rishavroy.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    LinearLayout TaskList;
    EditText NewTask;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskList = (LinearLayout) findViewById(R.id.linearLayout);
        NewTask = (EditText) findViewById(R.id.editText);
    }

    TextView createNewText(String text) {
        count += 1;
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setLayoutParams(params);
        textView.setTextSize(30);
        textView.setTextColor(Color.rgb(0,0,0));
        textView.setText(count + " . " + text);
        //textView.setBackgroundColor(Color.rgb(255,204,0));
        return textView;
    }

    public void AddNewTask(View view) {
        if(!Objects.equals(NewTask.getText().toString(), "")) {
            TaskList.addView(createNewText(NewTask.getText().toString()));
            NewTask.setText("");
        }
    }
}
