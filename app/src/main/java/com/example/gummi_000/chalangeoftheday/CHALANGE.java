package com.example.gummi_000.chalangeoftheday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class CHALANGE extends Activity {
   private TextView chalangetext, tala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalange);
        chalangetext = (TextView) findViewById(R.id.textView);
        tala = (TextView) findViewById(R.id.textView3);
        String i = "ekkert";
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        if(answer == 2)
            i = "armb";
        else if(answer == 4)
            i = "maga";
        else if(answer == 6)
            i = "bak";
        else if(answer == 8)
            i = "rass";
        else if(answer == 3)
            i = "kalfar";
        else if(answer == 5)
            i = "hendur";
        else if(answer == 1)
            i = "haus";
        else if(answer == 7)
            i = "rass";
        else if(answer == 9)
            i = "arm";
        else if(answer == 10)
            i = "rass";
        else
            i = "annad";
        chalangetext.setText(i);

    }
    public void onbotton2(View v){
        Intent intent = new Intent(this, Startscreen.class);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.chalange, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
