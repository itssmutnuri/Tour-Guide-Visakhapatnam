package com.srikarmutnuri.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * {@link InfoListAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link InfoList} objects.
 */
public class InfoListAdapter extends ArrayAdapter<InfoList>  {

    public InfoListAdapter(Context context, List<InfoList> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        InfoList currentLocation = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        imageView.setImageResource(currentLocation.getImageResourceId());

        TextView nameView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameView.setText(currentLocation.getName());

        TextView descView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descView.setText(currentLocation.getDesc());

        TextView addressView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressView.setText(currentLocation.getAddress());

        TextView timeView = (TextView) listItemView.findViewById(R.id.timeTextView);
        timeView.setText(currentLocation.getWorkHours());

        return listItemView;
    }
}