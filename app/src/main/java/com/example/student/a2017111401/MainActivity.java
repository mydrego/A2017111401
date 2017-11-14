package com.example.student.a2017111401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(0,1,1,"a");
//        menu.add(0,2,2,"b");
//        menu.add(0,3,3,"c");
        getMenuInflater().inflate(R.menu.munu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.m1:
                Toast.makeText(MainActivity.this, "AAA", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
            Toast.makeText(MainActivity.this, "BBB", Toast.LENGTH_SHORT).show();
            break;
            case R.id.m3:
                Toast.makeText(MainActivity.this, "CCC", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}
