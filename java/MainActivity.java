package com.custome_adapter.harsharaple.add_list_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    ListView listview;
    ListAdapter adapter;
    Button btn;
    ArrayList<Student> mprolist;
    RadioGroup rgrp;
    RadioButton rbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    listview = (ListView)findViewById(R.id.listview1);
    btn = (Button)findViewById(R.id.button);
    txt1 =(EditText)findViewById(R.id.txt1) ;
    rgrp =(RadioGroup)findViewById(R.id.radiogrp);



    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mprolist = new ArrayList<>();

            rbtn = findViewById(rgrp.getCheckedRadioButtonId());

            mprolist.add(new Student(txt1.getText().toString(),rbtn.getText().toString(),R.drawable.ic_launcher_background));



            adapter = new ListAdapter(getApplicationContext(),mprolist);
            listview.setAdapter(adapter);


           // adapter.notifyDataSetChanged();

        }
    });






}
}
