package com.example.user.myapplication74;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Database sql_database;
    TextView textView;
    Database db= new Database(MainActivity.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display_textview);
        db.deleteAllItems();
        sql_database = new Database(this);

        sql_database.insertName("Ravi","Meena");
        sql_database.insertName("Vaibhav","Gupta");
        sql_database.insertName("Kapil","Saini");
        sql_database.insertName("Varun","Kumar");

        sql_database.getName(textView);
    }
}
