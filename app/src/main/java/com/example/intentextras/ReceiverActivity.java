package com.example.intentextras;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;
    String name;
    String ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvName=findViewById(R.id.tvName);
        tvAge=findViewById(R.id.tvAge);
        Bundle exras=getIntent().getExtras();
        if (exras!=null){
            String name= exras.getString("etName");
            String age=exras.getString("etAge");
            tvName.setText(name);
            tvAge.setText(age);
        }

//        String savedExtra=getIntent().getStringExtra("Zakia");
//        tvName.setText(savedExtra);
//        int saveExtra=getIntent().getIntExtra("Zakia",49);
//        tvAge.setText(savedExtra);

//        int saveExtra=getIntent().getIntExtra("Zakia",90);
//        TextView tvAge=(TextView) findViewById(R.id.tvAge);
//        tvAge.setText(savedExtra);
//        TextView textView = (TextView) findViewById(R.id.tvName);
//        textView.setText(text);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
