package com.example.assignmenttracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private Button deleteButton;
    EditText inputAssignment;
    ListView listView;
    ArrayList<String> list;
    TodoAdapter todoAdapter;

    public void onClickAdd(View view){

        String assignment = inputAssignment.getText().toString();
        if (!assignment.equals("")) {
            list.add(assignment);
            listView.setAdapter(todoAdapter);
            inputAssignment.setText("");
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
    }

    public void onClickDelete (View view)
    {
        list.clear();
        todoAdapter.notifyDataSetChanged();


    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //hide the action bar so the screen is in full

        fab= findViewById(R.id.addAssignment);
        deleteButton = findViewById(R.id.deleteAssignment);
        inputAssignment=findViewById(R.id.newAssignment);
        listView=findViewById(R.id.assignmentView);
        list = new ArrayList<>();

        todoAdapter= new TodoAdapter(list, this);


    }


}