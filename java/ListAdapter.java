package com.custome_adapter.harsharaple.add_list_adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Context mcon;
    private List<Student> mprolist;

    public ListAdapter(Context mcon,List<Student> mstulist)
    {
        this.mcon = mcon;
        this.mprolist = mstulist;
    }

    @Override
    public int getCount() {
        return mprolist.size();
    }

    @Override
    public Object getItem(int position) {
        return mprolist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mcon,R.layout.list_view_layout,null);
        TextView name = (TextView)v.findViewById(R.id.txt1);
        TextView gender = (TextView)v.findViewById(R.id.txt2);
       // TextView pri = (TextView)v.findViewById(R.id.price);
        ImageView img = (ImageView)v.findViewById(R.id.img);


        name.setText(mprolist.get(position).getStu_name());
        gender.setText(mprolist.get(position).getStu_gender());
        img.setImageResource(mprolist.get(position).getStu_image());
        //pri.setText(String.valueOf(mprolist.get(position).getPrice()) + "$");


        return v;
    }
}
