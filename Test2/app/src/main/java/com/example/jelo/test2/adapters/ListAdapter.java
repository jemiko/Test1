package com.example.jelo.test2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jelo.test2.ListActivity;
import com.example.jelo.test2.R;

/**
 * Created by jelo on 7/22/2015.
 */
public class ListAdapter extends BaseAdapter {
    String[]result;
    Context context;
    int[]imageId;
    private static LayoutInflater inflater=null;
    public ListAdapter(ListActivity ListActivity, int[] prmImages, String[] prgmNameList){
        result=prgmNameList;
        context= ListActivity;
        imageId=prmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.listview_item, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        return rowView;
    }
}