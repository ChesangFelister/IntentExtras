package com.example.intentextras;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String savedExtra=getIntent().getStringExtra("Zakia");
        TextView tvName=(TextView) findViewById(R.id.tvName);
        tvName.setText(savedExtra);
        int saveExtra=getIntent().getIntExtra("Zakia",49);
        TextView tvAge=(TextView)findViewById(R.id.tvAge);
        tvAge.setText(savedExtra);

//        int savedExtra=getIntent().getIntExtra("Zakia");
//        TextView tvname=(TextView) findViewById(R.id.tvAge);
//        tv.setText(savedExtra);
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
