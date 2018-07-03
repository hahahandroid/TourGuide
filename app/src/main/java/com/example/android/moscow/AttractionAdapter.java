package com.example.android.moscow;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractionList, int ColorResourceId) {
        super(context, 0, attractionList);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentAttraction.getName());

        TextView description = listItemView.findViewById(R.id.description);
        description.setText(currentAttraction.getDescription());

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentAttraction.getImageID());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
