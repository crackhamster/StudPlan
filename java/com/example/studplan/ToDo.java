package com.example.studplan;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ToDo extends AppCompatActivity {
    private EditText input;
    private EditText inputTime;
    private Button button;
    private ListView list;

@Override
    protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.to_do_list);
    findViews();
    viewSetup();
}

    private void findViews() {
    input = (EditText)findViewById(R.id.edit_to_do);
    inputTime = (EditText)findViewById(R.id.edit_when);
    button = (Button)findViewById(R.id.button);
    list = (ListView)findViewById(R.id.)
}

    private void viewSetup() {
    }
}
