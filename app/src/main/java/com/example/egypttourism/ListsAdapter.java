package com.example.egypttourism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListsAdapter extends ArrayAdapter<Lists> {

    Context context;
    int resource;

    public ListsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Lists> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource, parent, false);

        ImageView Image1 = (ImageView) convertView.findViewById(R.id.Image1);
        TextView Name1 = (TextView) convertView.findViewById(R.id.Name1);
        TextView Address1 = (TextView) convertView.findViewById(R.id.Address1);
        ImageView Image2 = (ImageView) convertView.findViewById(R.id.Image2);
        TextView Name2 = (TextView) convertView.findViewById(R.id.Name2);
        TextView Address2 = (TextView) convertView.findViewById(R.id.Address2);

        final Lists currentLists = getItem(position);

        Image1.setImageResource(currentLists.getImage1());
        Name1.setText(currentLists.getName1());
        Address1.setText(currentLists.getAddress1());
        Image2.setImageResource(currentLists.getImage2());
        Name2.setText(currentLists.getName2());
        Address2.setText(currentLists.getAddress2());

        return convertView;
    }
}
