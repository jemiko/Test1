package com.example.jelo.test2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.jelo.test2.adapters.ListAdapter;

import java.util.ArrayList;

/**
 * Created by jelo on 7/22/2015.
 */
public class ListActivity extends Activity {
    ListView listView;
    Context context;
    ArrayList prgName;


    public static String [] prgNameList={
            "mwvadi",
            "xachapuri",
            "xinkali",
            "mwvadi",
            "xachapuri",
            "xinkali",
            "mwvadi",
            "xachapuri",
            "xinkali",
            "mwvadi",};
    public static int[] prgImages={
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,
            R.drawable.mwvadi,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter(this,prgImages,prgNameList));



    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

