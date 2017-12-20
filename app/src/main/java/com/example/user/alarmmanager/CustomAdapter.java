package com.example.user.alarmmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import static android.R.attr.resource;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] alarmTabs) {
        super(context,R.layout.custom_row, alarmTabs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater kartikInflator = LayoutInflater.from(getContext());
        View customView = kartikInflator.inflate(R.layout.custom_row, parent, false);

        String singleDate = getItem(position);
        TextView timeDisplay = (TextView) customView.findViewById(R.id.timeDisplay);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);
        Switch alarmSetter = (Switch) customView.findViewById(R.id.alarmSetter);

        timeDisplay.setText(singleDate);
        imageView.setImageResource(R.drawable.icon);
        alarmSetter.setEnabled(false);
        return customView;

    }
}

